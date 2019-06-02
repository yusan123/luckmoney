package com.yu.service;

import com.yu.entity.Luckmoney;

import java.util.List;

/**
 * Created by yousan on 2019/6/2 12:30.
 */
public interface ILuckmoneyService {
    //查询所有红包记录
    List<Luckmoney> findAll();
    //根据id查询一个红包
    Luckmoney findById(Integer id);
    //新建一个红包
    Luckmoney insert(Luckmoney luckmoney);
    //更新红包，领取红包，设置领取人
    Luckmoney update(Integer id,String name);
}
