package com.jifeng.fitness.controller;

import com.jifeng.fitness.pojo.Articles;
import com.jifeng.fitness.pojo.Tag;
import com.jifeng.fitness.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/tag")
public class TagController {

    @Autowired
    private TagService tagService;


    @GetMapping("/{tagId}")
    @ResponseBody
    public String selectByTag(@PathVariable("tagId") String alias, Model model) {
        Tag tag = tagService.selectTag(alias);
        String articles = tag.getArticles();
        List<Character> idList = new ArrayList<>();
        for (int i = 0; i < articles.length(); i++) {
            if (articles.charAt(i) >= 48 && articles.charAt(i) <= 57) {
                idList.add(articles.charAt(i));
            }
        }
        List<Articles> articlesList = tagService.selectByTag(idList);
        return tag.getName() + "~~~~~~~" + "<br/>" + articlesList.toString();
    }

}
