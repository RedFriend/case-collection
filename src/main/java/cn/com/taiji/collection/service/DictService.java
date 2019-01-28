package cn.com.taiji.collection.service;

import cn.com.taiji.collection.entity.Ajlx;
import cn.com.taiji.collection.entity.Ay;
import cn.com.taiji.collection.entity.AyAjlx;
import cn.com.taiji.collection.entity.Fydm;

import java.util.List;

public interface DictService {


    List<Ay> findAllAy();

    List<AyAjlx> findAllAyAjlx();

    List<Fydm> findAllFydm();

    List<Ajlx> findAllAjlx();

    List<Ay> getChirldAy(List<Ay> ayList);
}
