package cn.com.taiji.collection.service;

import cn.com.taiji.collection.entity.Ajjbxx;
import cn.com.taiji.collection.mapper.AjjbxxMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Service
public class CaseServiceImpl implements CaseService{

    @Autowired
    AjjbxxMapper ajjbxxMapper;

    public Map<String,Object> addAjjbxx(Ajjbxx ajjbxx,HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();

        //特殊处理
        String code=request.getParameter("code");
        if(code==null || "".equals(code.trim())){
            map.put("code","false");
            map.put("returnStr","参数code不能为空");
            return map;
        }

        //添加
        ajjbxx.setId(null);
        ajjbxxMapper.insert(ajjbxx);
        map.put("code","true");
        map.put("returnStr","添加成功");
        return map;
    }

    public Map<String,Object> updAjjbxx(Ajjbxx ajjbxx,HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();

        //特殊处理
        String id=request.getParameter("id");
        String code=request.getParameter("code");
        if(id==null || "".equals(id.trim())){
            map.put("code","false");
            map.put("returnStr","参数id不能为空");
            return map;
        }
        Ajjbxx ajj=ajjbxxMapper.selectByPrimaryKey(Integer.valueOf(id));
        if(ajj==null){
            map.put("code","false");
            map.put("returnStr","此案件不存在");
            return map;
        }else if(code==null || "".equals(code.trim())){
            map.put("code","false");
            map.put("returnStr","参数code不能为空");
            return map;
        }

        ajjbxxMapper.updateByPrimaryKey(ajjbxx);
        map.put("code","true");
        map.put("returnStr","修改成功");
        return map;
    }

}
