package com.project.wdx.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Storage implements Serializable {

    private Long id;
    private String commodityCode;
    private int count;
}
