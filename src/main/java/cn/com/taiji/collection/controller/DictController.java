package cn.com.taiji.collection.controller;

import cn.com.taiji.collection.entity.*;
import cn.com.taiji.collection.service.DictService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@RestController
@RequestMapping("/dict")
@CrossOrigin(origins = "*")
//@CrossOrigin(origins = "http://localhost:8085",maxAge=3600)
public class DictController extends BaseController {

    @Autowired
    DictService dictService;

    @ApiOperation("案由")
    @GetMapping("/ay")
    @Cacheable(value    = "ay")
    public List<Ay> findAllAy() {
        List<Ay> ayList = dictService.findAllAy();
        List<Ay> ayList2 = dictService.getChirldAy(ayList);
        return ayList2;
    }

    @ApiOperation("案由案件类型")
    @GetMapping("/ayAjlx")
    @Cacheable(value = "ayAjlx")
    public List<AyAjlx> findAllAyAjlx() {
        return dictService.findAllAyAjlx();
    }

    @ApiOperation("法院代码")
    @GetMapping("/fydm")
    @Cacheable(value = "fydm")
    public List<Fydm> findAllFydm() {
        return dictService.findAllFydm();
    }

    @ApiOperation("案件类型")
    @GetMapping("/ajlx")
    @Cacheable(value = "ajlx")
    public List<Ajlx> findAllAjlx() {
        return dictService.findAllAjlx();
    }

    @ApiOperation(value="案件信息/收案信息/收案来源 选项",notes="code 案件类型（不传值或传空值返回所有收案来源）刑事一审 0301")
    @ApiParam(name="code",value="案件类型编码",required=true)
    @GetMapping("/saly")
    @Cacheable(value = "saly")
    public List<Dict> saly(String code) {
        String type="saly";
        return dictService.getSaly(type,code);
    }

    @ApiOperation(value="案件信息/收案信息/管辖依据 选项")
    @ApiParam(name="ajlx",value="案件类型编码",required=true)
    @GetMapping("/gxyj")
    @Cacheable(value = "gxyj")
    public List<Dict> gxyj(String ajlx) {
        String type="gxyj";
        return dictService.getSaly(type,ajlx);
    }



    @ApiOperation(value="案件信息/收案信息/适用程序 选项")
    @GetMapping("/sycx")
    @Cacheable(value = "sycx")
    public List<Dict> sycx() {
        String code="fb_xs_xsys_slcxxx_sycx";
        String type="1";
        return dictService.getSaly(type,code);
    }



    @ApiOperation(value="案件信息/收案信息/检察院建议适用程序 选项")
    @ApiParam(name="code",value="案件类型编码",required=true)
    @GetMapping("/jcyjycycx")
    @Cacheable(value = "jcyjycycx")
    public List<Dict> jcyjycycx() {
        String code="fb_xs_xsys_slcxxx_jcyjycycx";
        String type="1";
        return dictService.getSaly(type,code);
    }


    @ApiOperation(value="当事人/基本信息/类型 选项")
    @GetMapping("/dsrlx")
    @Cacheable(value = "dsrlx")
    public List<Dict> dsrlx() {
        String code="clientType";
        String type="1238";
        return dictService.getSaly(type,code);
    }

    @ApiOperation(value="当事人/基本信息/性别 选项")
    @GetMapping("/xb")
    @Cacheable(value = "xb")
    public List<Dict> xb() {
        String code="XB";
        String type="39";
        return dictService.getSaly(type,code);
    }

    @ApiOperation(value="当事人/基本信息/婚姻状况 选项")
    @GetMapping("/hyzk")
    @Cacheable(value = "hyzk")
    public List<Dict> hyzk() {
        String code="gb_hyzk";
        String type="1";
        return dictService.getSaly(type,code);
    }

    @ApiOperation(value="当事人/基本信息/证件类型 选项")
    @GetMapping("/zjlx")
    @Cacheable(value = "zjlx")
    public List<Dict> zjlx() {
        String code="fb_zrr_jmsfz";
        String type="1";
        return dictService.getSaly(type,code);
    }

    @ApiOperation(value="当事人/基本信息/文化程度 选项")
    @GetMapping("/whcd")
    @Cacheable(value = "whcd")
    public List<Dict> whcd() {
        String code="gb_xldm";
        String type="1";
        return dictService.getSaly(type,code);
    }

    @ApiOperation(value="当事人/基本信息/民族 选项")
    @GetMapping("/mz")
    @Cacheable(value = "mz")
    public List<Dict> mz() {
        String code="gb_mz";
        String type="1";
        return dictService.getSaly(type,code);
    }

    @ApiOperation(value="当事人/基本信息/政治面貌 选项")
    @GetMapping("/zzmm")
    @Cacheable(value = "zzmm")
    public List<Dict> zzmm() {
        String code="dsr_zzmm";
        String type="1";
        return dictService.getSaly(type,code);
    }

    @ApiOperation(value="当事人/基本信息/身份 选项")
    @GetMapping("/sf")
    @Cacheable(value = "sf")
    public List<Dict> sf() {
        String code="gb_cyzk";
        String type="1";
        return dictService.getSaly(type,code);
    }

    @ApiOperation(value="当事人/基本信息/行为能力状况 选项")
    @GetMapping("/xwnlzk")
    @Cacheable(value = "xwnlzk")
    public List<Dict> xwnlzk() {
        String code="fb_zrr_xwnlzk";
        String type="1";
        return dictService.getSaly(type,code);
    }

    @ApiOperation(value="当事人/基本信息/刑事责任能力 选项")
    @GetMapping("/xszrnl")
    @Cacheable(value = "xszrnl")
    public List<Dict> xszrnl() {
        String code="fb_zrr_xszrnl";
        String type="1";
        return dictService.getSaly(type,code);
    }

    @ApiOperation(value="当事人/基本信息/国别或地区 选项")
    @GetMapping("/gbhdq")
    @Cacheable(value = "gbhdq")
    public List<Dict> gbhdq() {
        String code="gb_gj";
        String type="35";
        return dictService.getSaly(type,code);
    }

    @ApiOperation(value="当事人 所在地(户籍所在地，经常居住地) 选项")
    @GetMapping("/szd")
    @Cacheable(value = "szd")
    public List<District> szd() {
        return dictService.getSzd();
    }

    @ApiOperation(value="当事人/工作单位信息/工作单位类型 选项")
    @GetMapping("/gzdwlx")
    @Cacheable(value = "gzdwlx")
    public List<Dict> gzdwlx() {
        String code="fb_dw_gzdwlx";
        String type="1";
        return dictService.getSaly(type,code);
    }

    @ApiOperation(value="当事人/工作单位信息/是中央国家机关/机关类型 选项")
    @GetMapping("/jglx")
    @Cacheable(value = "jglx")
    public List<Dict> jglx() {
        String code="fb_zrr_jglx";
        String type="1";
        return dictService.getSaly(type,code);
    }

    @ApiOperation(value="当事人/工作单位信息/是中央国家机关/职级 选项")
    @GetMapping("/zj")
    @Cacheable(value = "zj")
    public List<Dict> zj() {
        String code="fb_zrr_zj";
        String type="1";
        return dictService.getSaly(type,code);
    }

    @ApiOperation(value="当事人/涉人大代表/政协委员信息/是人大代表 人大/政协层级  选项")
    @GetMapping("/rdzxcj")
    @Cacheable(value = "rdzxcj")
    public List<Dict> rdzxcj() {
        String code="fb_zrr_rd_zx_cj";
        String type="1";
        return dictService.getSaly(type,code);
    }

    @ApiOperation(value="当事人/涉人大代表/政协委员信息/是人大代表 职务层级  选项")
    @GetMapping("/zwcj")
    @Cacheable(value = "zwcj")
    public List<Dict> zwcj() {
        String code="fb_zwcj";
        String type="1";
        return dictService.getSaly(type,code);
    }

    @ApiOperation(value="当事人/涉侨信息/是涉侨 涉侨类型  选项")
    @GetMapping("/sqlx")
    @Cacheable(value = "sqlx")
    public List<Dict> sqlx() {
        String code="fb_sqlx";
        String type="1";
        return dictService.getSaly(type,code);
    }

    @ApiOperation(value="当事人/联系方式类型/联系方式类型  选项")
    @GetMapping("/lxfslx")
    @Cacheable(value = "lxfslx")
    public List<Dict> lxfslx() {
        String code="fb_dw_lxfslx";
        String type="1";
        return dictService.getSaly(type,code);
    }

    @ApiOperation(value="当事人/基本信息/诉讼地位  选项")
    @ApiParam(name="ajlx",value="案件类型",required=true)
    @GetMapping("/ssdw")
    @Cacheable(value = "ssdw")
    public List<Ajdw> ssdw(String ajlx) {
        Ajdw ajdw=new Ajdw();
        ajdw.setAjlx(ajlx);
        return dictService.getAjdw(ajdw);
    }

}


