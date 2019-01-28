package cn.com.taiji.collection.controller;

import cn.com.taiji.collection.entity.Ajlx;
import cn.com.taiji.collection.entity.Ay;
import cn.com.taiji.collection.entity.AyAjlx;
import cn.com.taiji.collection.entity.Fydm;
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

}
