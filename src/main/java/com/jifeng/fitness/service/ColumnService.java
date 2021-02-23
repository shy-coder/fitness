package com.jifeng.fitness.service;

import com.jifeng.fitness.pojo.Articles;
import com.jifeng.fitness.pojo.Column;

import java.util.List;

public interface ColumnService {

    List<Column> selectAll();

    List<Articles> selectByColumn(String alias);

    String selectName(String alias);

}
