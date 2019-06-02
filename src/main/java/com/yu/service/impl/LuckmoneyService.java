package com.yu.service.impl;

import com.yu.entity.Luckmoney;
import com.yu.repository.LuckmoneyRepository;
import com.yu.service.ILuckmoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yousan on 2019/6/2 12:34.
 */
@Service
public class LuckmoneyService implements ILuckmoneyService {

    @Autowired
    private LuckmoneyRepository luckmoneyRepository;

    @Override
    public List<Luckmoney> findAll() {
        return luckmoneyRepository.findAll();
    }

    @Override
    public Luckmoney findById(Integer id) {
        return luckmoneyRepository.findById(id).orElse(null);
    }

    @Override
    public Luckmoney insert(Luckmoney luckmoney) {
        return luckmoneyRepository.save(luckmoney);
    }

    @Override
    public Luckmoney update(Integer id,String name) {
        Luckmoney luckmoney = findById(id);
        luckmoney.setConsumer(name);
        return luckmoney;
    }
}
