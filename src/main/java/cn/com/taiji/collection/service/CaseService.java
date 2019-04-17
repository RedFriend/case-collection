package cn.com.taiji.collection.service;

import cn.com.taiji.collection.entity.Ajjbxx;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public interface CaseService {

    public Map<String,Object> addAjjbxx(Ajjbxx ajjbxx);

    public Map<String,Object> updAjjbxx(Ajjbxx ajjbxx);

    public Map<String,Object> selectCase(Ajjbxx ajjbxx);
}
