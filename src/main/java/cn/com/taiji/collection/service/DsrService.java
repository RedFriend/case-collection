package cn.com.taiji.collection.service;

import cn.com.taiji.collection.entity.Dsr;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public interface DsrService {

    public Map<String,Object> addDsr(HttpServletRequest request,Dsr dsr);

    public Map<String,Object> updDsr(HttpServletRequest request,Dsr dsr);

    public Map<String,Object> selectDsr(String code);

    public Map<String,Object> delDsr(String code,int dsrId);
}
