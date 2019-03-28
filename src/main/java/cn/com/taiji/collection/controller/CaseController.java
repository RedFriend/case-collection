package cn.com.taiji.collection.controller;

import cn.com.taiji.collection.entity.Ajjbxx;
import cn.com.taiji.collection.service.CaseService;
import cn.com.taiji.collection.util.RequestReflect;
import com.taiji.caze.online.remote.vo.data.ElCaseInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/case")
public class CaseController extends BaseController {

    @Autowired
    CaseService caseService;

    @Autowired
    com.taiji.caze.online.remote.service.CaseService caseOnlineService;

    /**
     * 立案 保存案件信息
     *
     * @param request
     * @param response
     * @return 测试:
     * 新增：http://localhost:8080/case/addUpdCase?code=222222&addOrUpd=add
     * 修改：http://localhost:8080/case/addUpdCase?code=222222&addOrUpd=upd&id=145048
     */
    @PostMapping("/addUpdCase")
    @Cacheable(value = "addUpdCase")
    @ResponseBody
    public Map<String, Object> addUpdCase(Ajjbxx ajjbxx, HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        Map<String, Object> map = new HashMap<>();
        try {
            String addOrUpd = request.getParameter("addOrUpd");
            if ("add".equals(addOrUpd)) {
                map = caseService.addAjjbxx(ajjbxx, request);
            } else if ("upd".equals(addOrUpd)) {
                map = caseService.updAjjbxx(ajjbxx, request);
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (map.get("returnStr") == null) {
                map.put("code", "false");
                map.put("returnStr", e.toString());
            }
        }
        return map;
    }

public void test(){
    ElCaseInfo elCaseInfo=new ElCaseInfo();
//    elCaseInfo.setCaseData();
//    caseOnlineService.collectCase()
}
}
