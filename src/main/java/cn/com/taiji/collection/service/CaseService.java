package cn.com.taiji.collection.service;

import cn.com.taiji.collection.entity.Ajjbxx;
import cn.com.taiji.collection.entity.vo.CaseDsrVo;

import java.util.Map;

public interface CaseService {

    Map<String, Object> addAjjbxx(Ajjbxx ajjbxx);

    Map<String, Object> updAjjbxx(Ajjbxx ajjbxx);

    Map<String, Object> selectCase(Ajjbxx ajjbxx);

    Map<String, Object> pushCase(CaseDsrVo caseDsrVo);
}
