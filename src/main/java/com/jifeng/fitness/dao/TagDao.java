package com.jifeng.fitness.dao;

import com.jifeng.fitness.pojo.Article;
import com.jifeng.fitness.pojo.Tag;

import java.util.List;

public interface TagDao {

    List<Article> selectByTag (List<Character> ids);

    Tag selectTag(String alias);

}
