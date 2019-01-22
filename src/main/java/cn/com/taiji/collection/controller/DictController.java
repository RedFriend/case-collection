package cn.com.taiji.collection.controller;

import cn.com.taiji.collection.entity.Ajlx;
import cn.com.taiji.collection.entity.Ay;
import cn.com.taiji.collection.entity.AyAjlx;
import cn.com.taiji.collection.entity.Fydm;
import cn.com.taiji.collection.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dict")
public class DictController extends BaseController {

    @Autowired
    DictService dictService;

    @GetMapping("/ay")
    @Cacheable(value = "ay")
    public List<Ay> findAllAy() {
        return dictService.findAllAy();
    }

    @GetMapping("/ayAjlx")
    @Cacheable(value = "ayAjlx")
    public List<AyAjlx> findAllAyAjlx() {
        return dictService.findAllAyAjlx();
    }

    @GetMapping("/fydm")
    @Cacheable(value = "fydm")
    public List<Fydm> findAllFydm() {
        return dictService.findAllFydm();
    }

    @GetMapping("/ajlx")
    @Cacheable(value = "ajlx")
    public List<Ajlx> findAllAjlx() {
        return dictService.findAllAjlx();
    }

}
