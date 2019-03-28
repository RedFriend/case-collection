package cn.com.taiji.collection.controller;

import cn.com.taiji.collection.entity.Ajjbxx;
import cn.com.taiji.collection.entity.Dsr;
import cn.com.taiji.collection.service.DsrService;
import cn.com.taiji.collection.util.RequestReflect;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/dsr")
public class DsrController {

    @Autowired
    DsrService dsrService;

    /**
     * 立案 保存当事人信息
     * @param request
     * @param response
     * @return
     *
     * 测试
     *  新增：http://localhost:8080/dsr/addUpdDsr?code=222222&addOrUpd=add&clbh=1901111&dsrid=1
     *  修改：http://localhost:8080/dsr/addUpdDsr?code=222222&addOrUpd=upd&clbh=1901111&dsrId=48564710&dsrid=1
     */

    @ApiOperation(value="立案 保存当事人信息")
    @GetMapping("/addUpdDsr")
    @Cacheable(value = "addUpdDsr")
    public Map<String,Object> addUpdDsr(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        Map<String, Object> map = new HashMap<>();
        try{
            String addOrUpd=request.getParameter("addOrUpd");
            RequestReflect reflect=new RequestReflect();
            Dsr dsr=reflect.reflects(request,Dsr.class);//转换为对象
            if("add".equals(addOrUpd)){
                map=dsrService.addDsr(request,dsr);
            }else if("upd".equals(addOrUpd)){
                map=dsrService.updDsr(request,dsr);
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

    @ApiOperation(value="查询当事人信息")
    @GetMapping("/selectDsr")
    @Cacheable(value = "selectDsr")
    @ResponseBody
    public Map<String,Object> selectDsr(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        Map<String, Object> map = new HashMap<>();
        try{
            String code = request.getParameter("code");
            map = dsrService.selectDsr(code);
        }catch(Exception e){
            e.printStackTrace();
            map.put("code","false");
            map.put("msg","查询异常");
            map.put("returnStr",e.toString());
        }
        return map;
    }

    @ApiOperation(value="删除当事人信息")
    @GetMapping("/delDsr")
    @Cacheable(value = "delDsr")
    @ResponseBody
    public Map<String,Object> delDsr(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        Map<String, Object> map = new HashMap<>();
        try{
            String code = request.getParameter("code");
            int dsrId = Integer.valueOf(request.getParameter("dsrId"));
            map = dsrService.delDsr(code,dsrId);
        }catch(Exception e){
            e.printStackTrace();
            map.put("code","false");
            map.put("msg","程序异常");
            map.put("returnStr",e.toString());
        }
        return map;
    }

}
