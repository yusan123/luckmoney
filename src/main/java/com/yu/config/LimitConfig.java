package com.yu.config;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Created by yousan on 2019/6/2 0:01.
 */
@ConfigurationProperties(prefix = "limit")
@Component
@Data
public class LimitConfig {

    private BigDecimal minMoney;
    private BigDecimal maxMoney;
    private String info;
}

