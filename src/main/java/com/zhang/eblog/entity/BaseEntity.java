package com.zhang.eblog.entity;

import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {

    private Long id;

    private Date created;

    private Date modified;

    private int status;
}
