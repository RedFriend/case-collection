package cn.com.taiji.collection.controller;

import cn.com.taiji.collection.entity.vo.CaseDsrVo;
import cn.com.taiji.collection.entity.vo.DsrVo;
import cn.com.taiji.collection.service.DsrService;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/dsr")
@CrossOrigin(origins = "*")
@Slf4j
public class DsrController {

    @Autowired
    DsrService dsrService;

    /**
     * 立案 保存当事人信息
     *
     * @param caseDsrVo
     * @return 测试
     */

    @ApiOperation(value = "立案 新增或保存当事人信息")
    @PostMapping("/addUpdDsr")
    public Map addUpdDsr(@RequestBody CaseDsrVo caseDsrVo) {
        System.out.println(JSON.toJSONString(caseDsrVo));
        Map<String, Object> map = new HashMap<>(2);
        map.put("code", "false");
        map.put("returnStr", "保存失败");
        try {

            for (DsrVo dsrVo : caseDsrVo.getDsrVos()) {
                if (StringUtils.isEmpty(dsrVo.getId())) {
                    dsrService.addDsr(dsrVo);
                } else {
                    dsrService.updateDsr(dsrVo);
                }
            }
            map.put("code", "true");
            map.put("returnStr", "保存成功");
        } catch (Exception e) {
            log.error("保存当事人出现异常", e);
        }
        return map;
    }

    @ApiOperation(value = "查询当事人信息")
    @GetMapping("/selectDsr")
    @ResponseBody
    public DsrVo selectDsr(Integer id) {
        return dsrService.selectDsr(id);
    }

    @ApiOperation(value = "查询案件所有当事人信息")
    @GetMapping("/findDsrs")
    @ResponseBody
    public List<DsrVo> findDsrs(String code) {
        return dsrService.findDsrs(code);
    }

    @ApiOperation(value = "删除当事人信息")
    @PostMapping("/delDsr")
    @ResponseBody
    public Map<String, Object> delDsr(Integer id) {
        Map<String, Object> map = new HashMap<>(2);
        map.put("code", "false");
        map.put("returnStr", "保存失败");
        try {
            int flg = dsrService.deleleteDsr(id);
            if (flg > 0) {
                map.put("code", "true");
                map.put("returnStr", "保存成功");
            }
        } catch (Exception e) {
            log.error("删除当事人出现异常", e);
            map.put("code", "false");
            map.put("msg", "删除失败");
        }
        return map;
    }


}
