package com.yu.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by yousan on 2019/6/2 11:53.
 */
@Data
@Entity
public class Luckmoney {

    @Id
    @GeneratedValue
    private Integer id;
    private BigDecimal money;
    private String producer;
    private String consumer;
}
