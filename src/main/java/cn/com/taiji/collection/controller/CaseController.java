package cn.com.taiji.collection.controller;

import cn.com.taiji.collection.entity.Ajjbxx;
import cn.com.taiji.collection.service.CaseService;
import cn.com.taiji.collection.util.RequestReflect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/case")
public class CaseController extends BaseController {

    @Autowired
    CaseService caseService;

    /**
     * 立案 保存案件信息
     * @param request
     * @param response
     * @return
     *
     * 测试:
     *  新增：http://localhost:8080/case/addUpdCase?code=222222&addOrUpd=add
     *  修改：http://localhost:8080/case/addUpdCase?code=222222&addOrUpd=upd&id=145048
     */
    @GetMapping("/addUpdCase")
    @Cacheable(value = "addUpdCase")
    @ResponseBody
    public Map<String,Object> addUpdCase(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        Map<String, Object> map = new HashMap<>();
        try{
            String addOrUpd=request.getParameter("addOrUpd");
            RequestReflect reflect=new RequestReflect();
            Ajjbxx ajjbxx=reflect.reflects(request,Ajjbxx.class);//转换为对象
            if("add".equals(addOrUpd)){
                map=caseService.addAjjbxx(ajjbxx,request);
            }else if("upd".equals(addOrUpd)){
                map=caseService.updAjjbxx(ajjbxx,request);
            }
        }catch(Exception e){
            e.printStackTrace();
            if(map.get("returnStr")==null){
                map.put("code","false");
                map.put("returnStr",e.toString());
            }
        }
        return map;
    }


}
