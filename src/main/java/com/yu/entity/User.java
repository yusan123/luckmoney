package com.yu.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by yousan on 2019/6/2 12:35.
 */
@Data
@Entity
public class User {
    //user s id
    @Id
    @GeneratedValue
    private Integer uid;
    private String name;
    //user have money
    private BigDecimal money;

}
