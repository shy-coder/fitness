package com.jifeng.fitness.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Articles {

    private Integer id;
    private String title;
    private String author;
    private String publishDate;
    private String lastupDate;
    private String text;
    private String summary;
    private Integer watches;
    private String tags;
    private String columnName;

}