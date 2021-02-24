package com.jifeng.fitness.dao;

import com.jifeng.fitness.pojo.ArticleColumn;
import com.jifeng.fitness.pojo.Tag;

import java.util.List;

public interface TagDao {

    List<ArticleColumn> selectByTag (List<Character> ids);

    Tag selectTag(String alias);

}
