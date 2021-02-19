package com.jifeng.fitness.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Tag {
    private Integer id;
    private String name;
    private String alias;
    private String articles;
}
