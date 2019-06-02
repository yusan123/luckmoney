package com.yu.repository;

import com.yu.LuckmoneyApplicationTests;
import com.yu.entity.Luckmoney;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by yousan on 2019/6/2 12:20.
 */
public class LuckmoneyRepositoryTest extends LuckmoneyApplicationTests{

    @Autowired
    private LuckmoneyRepository repository;
    @Test
    public void insertTest(){
        Luckmoney luckmoney = new Luckmoney();
        luckmoney.setMoney(new BigDecimal("22"));
        luckmoney.setProducer("zhangsan");
        repository.save(luckmoney);
    }
    @Test
    public void queryAllTest(){
        List<Luckmoney> all = repository.findAll();
        System.out.println(all);
        Assert.isTrue(all !=null,"查询不到数据，请检查数据库配置");
    }
}