package com.jifeng.fitness.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleColumn {

    private Integer id;
    private String title;
    private String author;
    private Date publishDate;
    private String summary;
    private Integer watches;

}
