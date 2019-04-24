package cn.com.taiji.collection.service;

import cn.com.taiji.collection.entity.Bhr;
import cn.com.taiji.collection.entity.Dsr;
import cn.com.taiji.collection.entity.vo.BhrVo;
import cn.com.taiji.collection.entity.vo.DsrVo;
import cn.com.taiji.collection.mapper.AjjbxxMapper;
import cn.com.taiji.collection.mapper.BhrMapper;
import cn.com.taiji.collection.mapper.DsrMapper;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class DsrServiceImpl implements DsrService {

    @Autowired
    DsrMapper dsrMapper;

    @Autowired
    BhrMapper bhrMapper;

    @Autowired
    AjjbxxMapper ajjbxxMapper;

    @Override
    public List<DsrVo> findDsrs(String code) {
        List<DsrVo> dsrVos = new ArrayList<>();
        Dsr dsr = new Dsr();
        dsr.setCode(code);
        List<Dsr> dsrs = dsrMapper.select(dsr);
        for (Dsr d : dsrs) {
            DsrVo dsrVo = convertToDsrVo(d);
            Bhr bhr = new Bhr();
            bhr.setDsrId(d.getDsrId());
            List<Bhr> bhrs = bhrMapper.select(bhr);
            List<BhrVo> bhrVos = new ArrayList<>();
            for (Bhr b : bhrs) {
                bhrVos.add(convertToBhrVo(b));
            }
            dsrVo.setBhrVos(bhrVos);
            dsrVos.add(dsrVo);
        }
        return dsrVos;
    }

    @Override
    public Integer addDsr(DsrVo dsrVo) {
        Dsr dsr=convertToDsr(dsrVo);
        JSON.toJSONString(dsr);
        int rs= dsrMapper.insertUseGeneratedKeys(dsr);
        List<BhrVo> bhrVos = dsrVo.getBhrVos();
        for (BhrVo bhrVo : bhrVos) {
            Bhr bhr = convertToBhr(bhrVo);
            bhr.setDsrId(dsr.getDsrId());
            bhr.setSource("cc");
            bhrMapper.insert(bhr);
        }
        return rs;
    }

    @Override
    public Integer deleleteDsr(Integer id) {

        Bhr bhr = new Bhr();
        bhr.setDsrId(id);
        bhrMapper.delete(bhr);

        Dsr dsr = new Dsr();
        dsr.setDsrId(id);
        return dsrMapper.delete(dsr);
    }

    @Override
    public Integer updateDsr(DsrVo dsrVo) {
        Bhr bhr = new Bhr();
        bhr.setDsrId(Integer.parseInt(dsrVo.getId()));
        bhrMapper.delete(bhr);
        List<BhrVo> bhrvos = dsrVo.getBhrVos();
        for (BhrVo bhrvo : bhrvos) {
            bhrvo.setDsrId(dsrVo.getId());
            bhrMapper.insert(convertToBhr(bhrvo));
        }
        return dsrMapper.updateByPrimaryKey(convertToDsr(dsrVo));
    }

    @Override
    public DsrVo selectDsr(Integer id) {
        DsrVo dsrVo = convertToDsrVo(dsrMapper.selectByPrimaryKey(id));
        Bhr bhr = new Bhr();
        bhr.setDsrId(id);
        List<Bhr> bhrs = bhrMapper.select(bhr);
        List<BhrVo> bhrVos = new ArrayList<>();
        for (Bhr b : bhrs) {
            bhrVos.add(convertToBhrVo(b));
        }
        dsrVo.setBhrVos(bhrVos);
        return dsrVo;
    }

    private Dsr convertToDsr(DsrVo dsrVo) {
        Dsr dsr = new Dsr();
        dsr.setDsrId(StringUtils.isEmpty(dsrVo.getId()) ? null :Integer.parseInt(dsrVo.getId()));
        dsr.setCode(dsrVo.getCode());
        dsr.setSsdw(dsrVo.getSsdw());

        dsr.setDsrlx(dsrVo.getLx());
        dsr.setDsrmc(dsrVo.getXm());
        dsr.setXb(dsrVo.getXb());
        dsr.setNl(dsrVo.getNl());
        dsr.setGj(dsrVo.getGjdq());
        dsr.setMz(dsrVo.getMz());
        dsr.setCsrq(dsrVo.getCsrq());
        dsr.setWhcd(dsrVo.getWhcd());
        dsr.setHjszd(dsrVo.getHjszd());
        dsr.setZzmm(dsrVo.getZzmm());
        dsr.setZw(null);
        dsr.setSf(dsrVo.getSf());
        dsr.setJb(null);
        dsr.setZjzl(dsrVo.getZjlx());
        dsr.setZjhm(dsrVo.getSfzhm());
        dsr.setDwxz(dsrVo.getDwlx());
        dsr.setZzjgdm(dsrVo.getZzhm());
        dsr.setFddbr(dsrVo.getFddbr());
        dsr.setFddbrzw(null);
        dsr.setDbrzjzl(null);
        dsr.setDbrzjhm(null);
        dsr.setLxdh(dsrVo.getLxfs());
        dsr.setJyrq(dsrVo.getJyrq());
        dsr.setJycs(dsrVo.getJycs());
        dsr.setSjhm(dsrVo.getLxfs());
        dsr.setSxfzsnl(dsrVo.getZanl());
        dsr.setHdr(null);
        dsr.setHdsj(null);
        dsr.setFjm(null);
        dsr.setHdr(null);
        dsr.setDz(dsrVo.getXzz());

        return dsr;
    }

    private DsrVo convertToDsrVo(Dsr dsr) {
        DsrVo dsrVo = new DsrVo();
        dsrVo.setId(dsr.getDsrId()==null?null:dsr.getDsrId().toString());
        dsrVo.setCode(dsr.getCode());
        dsrVo.setSsdw(dsr.getSsdw());

        dsrVo.setLx(dsr.getDsrlx());
        dsrVo.setXm(dsr.getDsrmc());
        dsrVo.setBm(null);
        dsrVo.setCym(null);
        dsrVo.setYwm(null);
        dsrVo.setXb(dsr.getXb());
        dsrVo.setCsrq(dsr.getCsrq());
        dsrVo.setNl(dsr.getNl());
        dsrVo.setHyzk(null);
        dsrVo.setZjlx(dsr.getZjzl());
        dsrVo.setSfzhm(dsr.getZjhm());
        dsrVo.setSfsfzxxyz(null);
        dsrVo.setSfzjjzrq(null);
        dsrVo.setWhcd(dsr.getWhcd());

        dsrVo.setMz(dsr.getMz());
        dsrVo.setZzmm(dsr.getZzmm());
        dsrVo.setSf(dsr.getSf());
        dsrVo.setZanl(dsr.getSxfzsnl());

        dsrVo.setSpnl(null);
        dsrVo.setSpnl(null);
        dsrVo.setXwnlzk(null);
        dsrVo.setXszrnl(null);
        dsrVo.setGjdq(dsr.getGj());
        dsrVo.setSfldry(null);
        dsrVo.setHjszd(dsr.getHjszd());
        dsrVo.setJcjzd(null);
        dsrVo.setXzz(dsr.getDz());

        dsrVo.setSjqk(null);
        dsrVo.setTsslhbl(null);
        dsrVo.setSfdwfzzrr(null);
        dsrVo.setGzdwmc(null);
        dsrVo.setGzdwlx(null);
        dsrVo.setSfzygjjg(null);
        dsrVo.setSfrddb(null);
        dsrVo.setSqxx(null);
        dsrVo.setSfwjhr(null);
        dsrVo.setSfsq(null);
        dsrVo.setSfjsdzsd(null);
        dsrVo.setZdqsr(null);
        dsrVo.setQdsddz(null);
        dsrVo.setLxfslx(null);
        dsrVo.setLxfs(null);
        dsrVo.setJyrq(null);
        dsrVo.setJydqsj(null);
        dsrVo.setJycs(null);
        dsrVo.setSffdms(null);
        dsrVo.setFfqdccjz(null);
        dsrVo.setSfqzsszl(null);
        dsrVo.setCqqzcssj(null);
        dsrVo.setBzr(null);
        dsrVo.setBzje(null);
        dsrVo.setSffzjewfjs(null);
        dsrVo.setFzje(null);
        dsrVo.setSfzy(null);

        dsrVo.setSflf(null);
        dsrVo.setSfcfz(null);
        dsrVo.setSfclj(null);
        dsrVo.setSfszbf(null);

        //法人属性

        dsrVo.setDwmc(dsr.getDsrmc());
        dsrVo.setDwlx(dsr.getDwxz());
        dsrVo.setSffrdw(null);
        dsrVo.setDwzt(null);
        dsrVo.setZzlx(dsr.getZjzl());
        dsrVo.setZzhm(dsr.getZzjgdm());
        dsrVo.setZcdjdq(null);
        dsrVo.setZybsjgszd(null);
        dsrVo.setDwdjdz(dsr.getDz());
        dsrVo.setFddbr(dsr.getFddbr());
        dsrVo.setSfdwfzfzr(null);
        dsrVo.setFzlx(null);

        //非法人组织属性

        dsrVo.setSfgtgsh(null);
        dsrVo.setFzrmc(null);

        return dsrVo;
    }

    private BhrVo convertToBhrVo(Bhr bhr) {
        BhrVo bhrVo = new BhrVo();
        bhrVo.setId(bhr.getId().toString());
        bhrVo.setCode(bhr.getCode());
        bhrVo.setDsrId(bhr.getDsrId().toString());
        bhrVo.setDlrmc(bhr.getLx());
        bhrVo.setDlrxm(bhr.getXm());
        bhrVo.setYdsrgx(bhr.getYdsrgx());
        bhrVo.setSsdlrsf(bhr.getSsdlrsf());
        bhrVo.setSfflyz(bhr.getSfflyz());
        bhrVo.setDlrzjlx(bhr.getZjzl());
        bhrVo.setDlrzjhm(bhr.getZjhm());
        bhrVo.setDlrdh(bhr.getLxff());
        bhrVo.setDlryb(bhr.getYb());
        bhrVo.setDlrdw(bhr.getDw());
        bhrVo.setDlrdwzcd(bhr.getDwzcd());
        bhrVo.setDlrdwdz(bhr.getDwdz());

        return bhrVo;
    }

    private Bhr convertToBhr(BhrVo b) {
        Bhr bhr = new Bhr();
        bhr.setId(StringUtils.isEmpty(b.getId()) ? null : Integer.parseInt(b.getId()));
        bhr.setCode(b.getCode());
        bhr.setDsrId(StringUtils.isEmpty(b.getDsrId()) ? null : Integer.parseInt(b.getDsrId()));
        bhr.setXm(b.getDlrxm());
        bhr.setLx(b.getDlrmc());
        bhr.setYdsrgx(b.getYdsrgx());
        bhr.setSsdlrsf(b.getSsdlrsf());
        bhr.setSfflyz(b.getSfflyz());
        bhr.setZjzl(b.getDlrzjhm());
        bhr.setZjhm(b.getDlrzjhm());
        bhr.setLxff(b.getDlrdh());
        bhr.setYb(b.getDlryb());
        bhr.setDw(b.getDlrdw());
        bhr.setDwzcd(b.getDlrdwzcd());
        bhr.setDwdz(b.getDlrdwdz());
        return bhr;
    }
}
