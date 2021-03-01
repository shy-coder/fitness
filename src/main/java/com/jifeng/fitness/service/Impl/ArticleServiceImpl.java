package com.jifeng.fitness.service.Impl;

import com.jifeng.fitness.dao.ArticleDao;
import com.jifeng.fitness.pojo.Article;
import com.jifeng.fitness.pojo.Articles;
import com.jifeng.fitness.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public Articles selectById(String id) {
        Article oldArticle = articleDao.selectById(id);
        System.out.println("~~~~~~~~~~"+oldArticle.toString());
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 hh点mm分ss秒");
        Articles newArticle = new Articles();
        newArticle.setId(oldArticle.getId());
        newArticle.setTitle(oldArticle.getTitle());
        newArticle.setAuthor(oldArticle.getAuthor());
        newArticle.setPublishDate(df.format(oldArticle.getPublishDate()));
        newArticle.setLastupDate(df.format(oldArticle.getLastupDate()));
        newArticle.setText(oldArticle.getText());
        newArticle.setSummary(oldArticle.getSummary());
        newArticle.setWatches(oldArticle.getWatches());
        newArticle.setTags(oldArticle.getTags());
        newArticle.setColumnName(oldArticle.getColumnName());
        return newArticle;
    }
}
