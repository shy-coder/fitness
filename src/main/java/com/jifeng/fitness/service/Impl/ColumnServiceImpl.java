package com.jifeng.fitness.service.Impl;

import com.jifeng.fitness.pojo.Article;
import com.jifeng.fitness.pojo.Articles;
import com.jifeng.fitness.dao.ColumnDao;
import com.jifeng.fitness.pojo.Column;
import com.jifeng.fitness.service.ColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class ColumnServiceImpl implements ColumnService {

    @Autowired
    private ColumnDao columnDao;

    @Override
    public List<Column> selectAll() {
        return columnDao.selectAll();
    }

    @Override
    public List<Articles> selectByColumn(String alias) {
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 hh点mm分ss秒");
        List<Articles> list = new ArrayList<>();
        List<Article> articleList = columnDao.selectByColumn(alias);
        for (int i = 0; i < articleList.size(); i++) {
            Articles articles = new Articles();
            articles.setId(articleList.get(i).getId());
            articles.setTitle(articleList.get(i).getTitle());
            articles.setAuthor(articleList.get(i).getAuthor());
            articles.setPublishDate(df.format(articleList.get(i).getPublishDate()));
            articles.setSummary(articleList.get(i).getSummary());
            articles.setWatches(articleList.get(i).getWatches());
            list.add(articles);
        }
        return list;
    }

    @Override
    public String selectName(String alias) {
        return columnDao.selectName(alias);
    }

    @Override
    public List<Articles> selectArticleByWatches(String columnId) {
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        List<Articles> list = new ArrayList<>();
        List<Article> articleList = columnDao.selectArticleByWatches(columnId);
        for (int i = 0; i < articleList.size(); i++) {
            Articles articles = new Articles();
            articles.setId(articleList.get(i).getId());
            articles.setTitle(articleList.get(i).getTitle());
            articles.setAuthor(articleList.get(i).getAuthor());
            articles.setPublishDate(df.format(articleList.get(i).getPublishDate()));
            articles.setSummary(articleList.get(i).getSummary());
            articles.setWatches(articleList.get(i).getWatches());
            list.add(articles);
        }
        return list;
    }

    @Override
    public Column selectByAlias(String alias) {
        return columnDao.selectByAlias(alias);
    }

}
