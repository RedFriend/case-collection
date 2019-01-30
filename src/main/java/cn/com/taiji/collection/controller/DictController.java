package cn.com.taiji.collection.controller;

import cn.com.taiji.collection.entity.*;
import cn.com.taiji.collection.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/dict")
//@CrossOrigin(origins = "*",maxAge=3600)
public class DictController extends BaseController {

    @Autowired
    DictService dictService;

    @GetMapping("/ay")
    @Cacheable(value = "ay")
    public List<Ay> findAllAy(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        List<Ay> ayList = dictService.findAllAy();
        List<Ay> ayList2 = dictService.getChirldAy(ayList);
        return ayList2;
    }

    @GetMapping("/ayAjlx")
    @Cacheable(value = "ayAjlx")
    public List<AyAjlx> findAllAyAjlx(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        return dictService.findAllAyAjlx();
    }

    @GetMapping("/fydm")
    @Cacheable(value = "fydm")
    public List<Fydm> findAllFydm(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        return dictService.findAllFydm();
    }

    @GetMapping("/ajlx")
    @Cacheable(value = "ajlx")
    public List<Ajlx> findAllAjlx(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        return dictService.findAllAjlx();
    }

    /**
     * 案件信息/收案信息/收案来源 选项
     * code 案件类型（不传值或传空值返回所有收案来源）
     * 刑事一审 0301
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/saly")
    @Cacheable(value = "saly")
    public List<Dict> saly(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        String code=request.getParameter("code");
        String type="saly";
        return dictService.getSaly(type,code);
    }

    /**
     * 案件信息/收案信息/管辖依据 选项
     * code 案件类型（不传值或传空值返回所有管辖依据）
     * 刑事一审 0301
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/gxyj")
    @Cacheable(value = "gxyj")
    public List<Dict> gxyj(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        String code=request.getParameter("code");
        String type="gxyj";
        return dictService.getSaly(type,code);
    }



    /**
     * 案件信息/收案信息/检察院建议适用程序 选项
     * 刑事一审 0301
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/jcyjycycx")
    @Cacheable(value = "jcyjycycx")
    public List<Dict> jcyjycycx(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        String code="fb_xs_xsys_slcxxx_jcyjycycx";
        String type="1";
        return dictService.getSaly(type,code);
    }


    /**
     * 当事人/基本信息/类型 选项
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/dsrlx")
    @Cacheable(value = "dsrlx")
    public List<Dict> dsrlx(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        String code="clientType";
        String type="1238";
        return dictService.getSaly(type,code);
    }

    /**
     * 当事人/基本信息/性别 选项
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/xb")
    @Cacheable(value = "xb")
    public List<Dict> xb(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        String code="XB";
        String type="39";
        return dictService.getSaly(type,code);
    }

    /**
     * 当事人/基本信息/婚姻状况 选项
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/hyzk")
    @Cacheable(value = "hyzk")
    public List<Dict> hyzk(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        String code="gb_hyzk";
        String type="1";
        return dictService.getSaly(type,code);
    }

    /**
     * 当事人/基本信息/证件类型 选项
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/zjlx")
    @Cacheable(value = "zjlx")
    public List<Dict> zjlx(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        String code="fb_zrr_jmsfz";
        String type="1";
        return dictService.getSaly(type,code);
    }

    /**
     * 当事人/基本信息/文化程度 选项
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/whcd")
    @Cacheable(value = "whcd")
    public List<Dict> whcd(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        String code="gb_xldm";
        String type="1";
        return dictService.getSaly(type,code);
    }

    /**
     * 当事人/基本信息/民族 选项
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/mz")
    @Cacheable(value = "mz")
    public List<Dict> mz(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        String code="gb_mz";
        String type="1";
        return dictService.getSaly(type,code);
    }

    /**
     * 当事人/基本信息/政治面貌 选项
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/zzmm")
    @Cacheable(value = "zzmm")
    public List<Dict> zzmm(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        String code="dsr_zzmm";
        String type="1";
        return dictService.getSaly(type,code);
    }

    /**
     * 当事人/基本信息/身份 选项
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/sf")
    @Cacheable(value = "sf")
    public List<Dict> sf(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        String code="gb_cyzk";
        String type="1";
        return dictService.getSaly(type,code);
    }

    /**
     * 当事人/基本信息/行为能力状况 选项
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/xwnlzk")
    @Cacheable(value = "xwnlzk")
    public List<Dict> xwnlzk(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        String code="fb_zrr_xwnlzk";
        String type="1";
        return dictService.getSaly(type,code);
    }

    /**
     * 当事人/基本信息/刑事责任能力 选项
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/xszrnl")
    @Cacheable(value = "xszrnl")
    public List<Dict> xszrnl(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        String code="fb_zrr_xszrnl";
        String type="1";
        return dictService.getSaly(type,code);
    }

    /**
     * 当事人/基本信息/国别或地区 选项
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/gbhdq")
    @Cacheable(value = "gbhdq")
    public List<Dict> gbhdq(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        String code="gb_gj";
        String type="35";
        return dictService.getSaly(type,code);
    }

    /**
     * 当事人 所在地(户籍所在地，经常居住地) 选项
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/szd")
    @Cacheable(value = "szd")
    public List<District> szd(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        return dictService.getSzd();
    }

    /**
     * 当事人/工作单位信息/工作单位类型 选项
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/gzdwlx")
    @Cacheable(value = "gzdwlx")
    public List<Dict> gzdwlx(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        String code="fb_dw_gzdwlx";
        String type="1";
        return dictService.getSaly(type,code);
    }

    /**
     * 当事人/工作单位信息/是中央国家机关/机关类型 选项
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/jglx")
    @Cacheable(value = "jglx")
    public List<Dict> jglx(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        String code="fb_zrr_jglx";
        String type="1";
        return dictService.getSaly(type,code);
    }

    /**
     * 当事人/工作单位信息/是中央国家机关/职级 选项
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/zj")
    @Cacheable(value = "zj")
    public List<Dict> zj(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        String code="fb_zrr_zj";
        String type="1";
        return dictService.getSaly(type,code);
    }

    /**
     * 当事人/涉人大代表/政协委员信息/是人大代表 人大/政协层级  选项
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/rdzxcj")
    @Cacheable(value = "rdzxcj")
    public List<Dict> rdzxcj(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        String code="fb_zrr_rd_zx_cj";
        String type="1";
        return dictService.getSaly(type,code);
    }

    /**
     * 当事人/涉人大代表/政协委员信息/是人大代表 职务层级  选项
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/zwcj")
    @Cacheable(value = "zwcj")
    public List<Dict> zwcj(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        String code="fb_zwcj";
        String type="1";
        return dictService.getSaly(type,code);
    }

    /**
     * 当事人/涉侨信息/是涉侨 涉侨类型  选项
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/sqlx")
    @Cacheable(value = "sqlx")
    public List<Dict> sqlx(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        String code="fb_sqlx";
        String type="1";
        return dictService.getSaly(type,code);
    }

    /**
     * 当事人/联系方式类型/联系方式类型  选项
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/lxfslx")
    @Cacheable(value = "lxfslx")
    public List<Dict> lxfslx(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8085");
        String code="fb_dw_lxfslx";
        String type="1";
        return dictService.getSaly(type,code);
    }

}
