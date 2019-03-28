package cn.com.taiji.collection.service;

import cn.com.taiji.collection.entity.Ajjbxx;
import cn.com.taiji.collection.mapper.AjjbxxMapper;
import cn.com.taiji.collection.util.AjCompare;
import com.taiji.common.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
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

    @Override
    public Map<String, Object> selectCase(Ajjbxx ajjbxx, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        if(null == ajjbxx){
            map.put("code","false");
            map.put("returnStr","参数不能为空");
            return map;
        }
        List<Ajjbxx> ajjbxxes = ajjbxxMapper.select(ajjbxx);
        if (CommonUtil.isNull(ajjbxxes)) {
            map.put("code","false");
            map.put("returnStr","未查询到案件，请核对查询值！");
        }
        Ajjbxx finalData = findFinal(ajjbxxes);
        map.put("code","true");
        map.put("data",finalData);
        return map;
    }

    private Ajjbxx findFinal(List<Ajjbxx> list) {

        Ajjbxx ajjbxx = new Ajjbxx();
        for (int i = 0; i < list.size(); i++) {
            Ajjbxx sample = list.get(i);
            try {
                AjCompare<Ajjbxx> ajCompare = new AjCompare<>();
                ajjbxx = ajCompare.compare(ajjbxx, sample);
            } catch (Exception e) {
                continue;
            }
        }
        return ajjbxx;
    }

}
