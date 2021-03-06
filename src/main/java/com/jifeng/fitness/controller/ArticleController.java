package com.jifeng.fitness.controller;

import com.jifeng.fitness.pojo.Articles;
import com.jifeng.fitness.service.ArticleService;
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
@RequestMapping(value = "/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;
    @Autowired
    private TagService tagService;

    @GetMapping("/{articleId}")
    public String selectById(@PathVariable("articleId") String id, Model model) {
        Articles article = articleService.selectById(id);
        String tags = article.getTags();
        if (tags != null) {
            System.out.println("待解析的id" + tags);
            List<Character> idList = new ArrayList<>();
            for (int i=0; i<tags.length(); i++) {
                if (tags.charAt(i) >= 48 && tags.charAt(i) <= 57) {
                    idList.add(tags.charAt(i));
                }
            }
            System.out.println("要查询的标签id：" + idList.toString());
            List<String> tagNames = tagService.selectByIds(idList);
            model.addAttribute("tagNames", tagNames);
            System.out.println("标签"+tagNames);
        }
        model.addAttribute("article", article);
        return "article";
//        return "文章：" + article.toString() + "~~~~~~~~~~~~~~~~ 文章的标签们：" + tagNames.toString();
    }

}
