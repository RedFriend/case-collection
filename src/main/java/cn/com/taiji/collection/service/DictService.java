package cn.com.taiji.collection.service;

import cn.com.taiji.collection.entity.*;

import java.util.List;

public interface DictService {


    List<Ay> findAllAy();

    List<AyAjlx> findAllAyAjlx();

    List<Fydm> findAllFydm();

    List<Ajlx> findAllAjlx();

    List<Ay> getChirldAy(List<Ay> ayList);

    List<Dict> getSaly(String type,String code);

    List<District> getSzd();

    List<Ajdw> getAjdw(Ajdw ajdw);
}
