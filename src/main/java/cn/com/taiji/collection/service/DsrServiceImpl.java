package cn.com.taiji.collection.service;

import cn.com.taiji.collection.entity.Ajjbxx;
import cn.com.taiji.collection.entity.Dsr;
import cn.com.taiji.collection.mapper.AjjbxxMapper;
import cn.com.taiji.collection.mapper.DsrMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Service
public class DsrServiceImpl implements DsrService{

    @Autowired
    DsrMapper dsrMapper;

    @Autowired
    AjjbxxMapper ajjbxxMapper;


    public Map<String,Object> addDsr(HttpServletRequest request, Dsr dsr){
        Map<String, Object> map = new HashMap<>();

        //特殊处理
        String code=request.getParameter("code");
        Ajjbxx ajjbxx=ajjbxxMapper.selAjjbxxByCode(code);
        if(code==null || "".equals(code.trim())){
            map.put("code","false");
            map.put("returnStr","参数code不能为空");
            return map;
        }else if(ajjbxx==null){
            map.put("code","false");
            map.put("returnStr","当事人所属案件不存在");
            return map;
        }

        dsr.setDsrId(null);
        dsrMapper.insert(dsr);
        map.put("code","true");
        map.put("returnStr","添加成功");
        return map;
    }

    public Map<String,Object> updDsr(HttpServletRequest request,Dsr dsr){
        Map<String, Object> map = new HashMap<>();

        //特殊处理
        String code=request.getParameter("code");
        String dsrId=request.getParameter("dsrId");
        Ajjbxx ajjbxx=ajjbxxMapper.selAjjbxxByCode(code);
        if(dsrId==null || "".equals(dsrId.trim())){
            map.put("code","false");
            map.put("returnStr","参数dsrId不能为空");
            return map;
        }
        Dsr ds=dsrMapper.selectByPrimaryKey(Integer.valueOf(dsrId));
        if(ds==null){
            map.put("code","false");
            map.put("returnStr","此当事人不存在");
            return map;
        }else if(code==null || "".equals(code.trim())){
            map.put("code","false");
            map.put("returnStr","参数code不能为空");
            return map;
        }else if(ajjbxx==null){
            map.put("code","false");
            map.put("returnStr","当事人所属案件不存在");
        }

        dsr.setDsrId(Integer.valueOf(dsrId));
        dsrMapper.updateByPrimaryKey(dsr);
        map.put("code","true");
        map.put("returnStr","修改成功");
        return map;
    }
}