package com.jifeng.fitness.service;

import com.jifeng.fitness.pojo.Articles;
import com.jifeng.fitness.pojo.Tag;

import java.util.List;

public interface TagService {

    List<Articles> selectByTag(List<Character> ids);

    Tag selectTag(String alias);

}
