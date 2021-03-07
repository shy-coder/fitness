package com.jifeng.fitness.controller;

import com.jifeng.fitness.pojo.Articles;
import com.jifeng.fitness.pojo.Tag;
import com.jifeng.fitness.service.TagService;
import com.jifeng.fitness.utils.SymbolUtils;
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
    public String selectByTag(@PathVariable("tagId") String alias, Model model) {
        Tag tag = tagService.selectTag(alias);
        List<Articles> articlesList = tagService.selectByTag(SymbolUtils.getNumbers(tag.getArticles()));
        String tagname = tag.getName();
        model.addAttribute("articles", articlesList);
        model.addAttribute("tagName",tagname);
        return "tag";
    }

    @GetMapping("/hot/{tagAlias}")
    @ResponseBody
    public String selectHot(@PathVariable("tagAlias") String alias) {
        Tag tag = tagService.selectTag(alias);
        List<Articles> articleList = tagService.selectArticleByWatches(SymbolUtils.getNumbers(tag.getArticles()));
        return "tag名称" + tag.getName() + "hot2:" + articleList.toString();
    }

}
