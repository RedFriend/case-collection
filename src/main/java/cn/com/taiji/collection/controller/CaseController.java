package cn.com.taiji.collection.controller;

import cn.com.taiji.collection.entity.Ajjbxx;
import cn.com.taiji.collection.service.CaseService;
import cn.com.taiji.collection.util.RequestReflect;
import com.taiji.caze.online.remote.vo.data.ElCaseInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/case")
@CrossOrigin(origins = "*")
public class CaseController extends BaseController {

    @Autowired
    CaseService caseService;

    @Autowired
    com.taiji.caze.online.remote.service.CaseService caseOnlineService;

    /**
     * 立案 保存案件信息
     *
     * @param ajjbxx
     * @return 测试:
     * 新增：http://localhost:8080/case/addUpdCase?code=222222&addOrUpd=add
     * 修改：http://localhost:8080/case/addUpdCase?code=222222&addOrUpd=upd&id=145048
     */
    @PostMapping("/addUpdCase")
    @ResponseBody
    public Map<String, Object> addUpdCase(@RequestBody Ajjbxx ajjbxx) {
        Map<String, Object> map = new HashMap<>();
        try {
            if (StringUtils.isEmpty(ajjbxx.getId())) {
                map = caseService.addAjjbxx(ajjbxx);
            } else {
                map = caseService.updAjjbxx(ajjbxx);
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

    @ApiOperation(value = "查询案件信息")
    @GetMapping("/selectCase")
    @ResponseBody
    public Map<String, Object> selectCase(@RequestBody Ajjbxx ajjbxx) {
        Map<String, Object> map = new HashMap<>();
        try {
            map = caseService.selectCase(ajjbxx);
        } catch (Exception e) {
            e.printStackTrace();
            if (map.get("returnStr") == null) {
                map.put("code", "false");
                map.put("returnStr", e.toString());
            }
        }
        return map;
    }


    @ApiOperation(value = "调用收案接口")
    @GetMapping("/collectionCase")
    @ResponseBody
    public Map<String, Object> collectionCase(@RequestBody Ajjbxx ajjbxx) {
        return null;
    }
}
