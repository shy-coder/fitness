package com.jifeng.fitness.controller;

import com.jifeng.fitness.pojo.Articles;
import com.jifeng.fitness.pojo.Column;
import com.jifeng.fitness.service.ColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/column")
public class ColumnController {

    @Autowired
    private ColumnService columnService;

    @GetMapping("/{columnId}")
    public String selectByColumn(@PathVariable("columnId") String alias,Model model) {
        List<Articles> articles = columnService.selectByColumn(alias);
        model.addAttribute("articles", articles);
        String name = columnService.selectName(alias);
        model.addAttribute("columnname", name);
        return "column";
    }

    @GetMapping("/findAll")
    public String selectAll(Model model) {
        List<Column> columns = columnService.selectAll();
//        model.addAttribute("columns", columns);
//        return "/column";
        return columns.toString();
    }

    @GetMapping("/hot/{alias}")
    @ResponseBody
    public String selectHot(@PathVariable("alias") String alias) {
        Column column = columnService.selectByAlias(alias);
        List<Articles> articleList = columnService.selectArticleByWatches(column.getId()+"");
        return "分栏名：" + column.getName() + "hot2:" + articleList.toString();
    }
}
