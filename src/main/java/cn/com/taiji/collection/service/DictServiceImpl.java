package cn.com.taiji.collection.service;

import cn.com.taiji.collection.entity.Ajlx;
import cn.com.taiji.collection.entity.Ay;
import cn.com.taiji.collection.entity.AyAjlx;
import cn.com.taiji.collection.entity.Fydm;
import cn.com.taiji.collection.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    @Override
    public List<Ay> getChirldAy(List<Ay> ayList) {
        List<Ay> ays = new ArrayList<>();
        List<Ay> ayList2 = new ArrayList<>();
        for(Ay ay1 : ayList){
            if("0".equals(ay1.getAySjdm())){
                ayList2.add(ay1);
            }
        }
        for (Ay ay2 : ayList2){
            ays.add(getAyInfo(ay2,ayList));
        }
        return ays;
    }

    private Ay getAyInfo(Ay ay,List<Ay> ayList){
        List<Ay> ays = new ArrayList<>();
        for(Ay ay1 : ayList){
            if(ay.getAyDm().equals(ay1.getAySjdm())){
                ays.add(ay1);
            }
        }
        if(!ays.isEmpty()){
            ay.setChirldAy(ays);
            for(Ay ay2 : ays){
                ay2 = getAyInfo(ay2,ayList);
            }
        }
        return ay;
    }
}
