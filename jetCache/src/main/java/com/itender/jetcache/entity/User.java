package com.itender.jetcache.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yuan
 * @create 2021-10-20 10:05
 */
@Data
public class User implements Serializable {
    private Long id;

    private String name;

    private Integer age;

}
