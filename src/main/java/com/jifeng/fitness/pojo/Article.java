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
    private String columnName;

    public Article(Integer id, String title, String author, Date publishDate, String summary, Integer watches, String columnName) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
        this.summary = summary;
        this.watches = watches;
        this.columnName = columnName;
    }

    public Article(Integer id, String title, String author, Date publishDate, String summary, Integer watches) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
        this.summary = summary;
        this.watches = watches;
    }


}
