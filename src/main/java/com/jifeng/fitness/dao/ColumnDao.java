package com.jifeng.fitness.dao;

import com.jifeng.fitness.pojo.Article;
import com.jifeng.fitness.pojo.ArticleColumn;
import com.jifeng.fitness.pojo.Column;

import java.util.List;

public interface ColumnDao {

    List<Column> selectAll();

    List<ArticleColumn> selectByColumn (String alias);

}
