package com.project.wdx.storage.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "storage_tbl")
public class StorageDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "commodity_code")
    private String commodityCode;
    @Column(name = "count")
    private int count;
}
