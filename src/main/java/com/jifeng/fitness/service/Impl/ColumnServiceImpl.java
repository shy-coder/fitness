package com.jifeng.fitness.service.Impl;

import com.jifeng.fitness.dao.ColumnDao;
import com.jifeng.fitness.pojo.Article;
import com.jifeng.fitness.pojo.ArticleColumn;
import com.jifeng.fitness.pojo.Column;
import com.jifeng.fitness.service.ColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<ArticleColumn> selectByColumn(String alias) {
        return columnDao.selectByColumn(alias);
    }
}
