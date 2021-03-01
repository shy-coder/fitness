package com.jifeng.fitness.service.Impl;

import com.jifeng.fitness.dao.TagDao;
import com.jifeng.fitness.pojo.Article;
import com.jifeng.fitness.pojo.Articles;
import com.jifeng.fitness.pojo.Tag;
import com.jifeng.fitness.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class TagServiceImpl implements TagService {


    @Autowired
    private TagDao tagDao;


    @Override
    public List<Articles> selectByTag(List<Character> ids) {
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 hh点mm分ss秒");
        List<Articles> list = new ArrayList<>();
        List<Article> articleList = tagDao.selectByTag(ids);
        for (int i = 0; i < articleList.size(); i++) {
            Articles articles = new Articles();
            articles.setId(articleList.get(i).getId());
            articles.setTitle(articleList.get(i).getTitle());
            articles.setAuthor(articleList.get(i).getAuthor());
            articles.setPublishDate(df.format(articleList.get(i).getPublishDate()));
            articles.setSummary(articleList.get(i).getSummary());
            articles.setWatches(articleList.get(i).getWatches());
            articles.setColumnName(articleList.get(i).getColumnName());
            list.add(articles);
        }
        return list;
    }

    @Override
    public Tag selectTag(String alias) {
        return tagDao.selectTag(alias);
    }

    @Override
    public List<String> selectByIds(List<Character> ids) {
        return tagDao.selectByIds(ids);
    }
}
