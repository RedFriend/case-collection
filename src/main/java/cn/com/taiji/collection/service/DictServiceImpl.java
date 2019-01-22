package cn.com.taiji.collection.service;

import cn.com.taiji.collection.entity.Ajlx;
import cn.com.taiji.collection.entity.Ay;
import cn.com.taiji.collection.entity.AyAjlx;
import cn.com.taiji.collection.entity.Fydm;
import cn.com.taiji.collection.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictServiceImpl implements DictService {

    @Autowired
    AyMapper ayMapper;

    @Autowired
    AyAjlxMapper ayAjlxMapper;

    @Autowired
    FydmMapper fydmMapper;

    @Autowired
    AjlxMapper ajlxMapper;

    @Override
    public List<Ay> findAllAy() {
        return ayMapper.selectAll();
    }

    @Override
    public List<Fydm> findAllFydm() {
        return fydmMapper.selectAll();
    }

    @Override
    public List<AyAjlx> findAllAyAjlx() {
        return ayAjlxMapper.selectAll();
    }

    @Override
    public List<Ajlx> findAllAjlx() {
        return ajlxMapper.selectAll();
    }
}
