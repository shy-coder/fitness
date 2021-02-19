package com.jifeng.fitness.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Article {
    private Integer id;
    private String title;
    private String author;
    private Date publishDate;
    private Date lastupDate;
    private String text;
    private String summary;
    private Integer watches;
    private String tags;
    private Integer column;
}
