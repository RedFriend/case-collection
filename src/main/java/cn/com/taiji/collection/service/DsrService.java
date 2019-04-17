package cn.com.taiji.collection.service;

import cn.com.taiji.collection.entity.vo.DsrVo;

import java.util.List;

public interface DsrService {

    List<DsrVo> findDsrs(String code);

    Integer addDsr(DsrVo dsr);

    Integer deleleteDsr(Integer id);

    Integer updateDsr(DsrVo dsr);

    DsrVo selectDsr(Integer id);
}
