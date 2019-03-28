package cn.com.taiji.collection.service;

import cn.com.taiji.collection.entity.*;
import cn.com.taiji.collection.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DictServiceImpl implements DictService {

    @Autowired
    AyMapper ayMapper;

    @Autowired
    AyAjlxMapper ayAjlxMapper;

    @Autowired
    FydmMapper fydmMapper;

    @Autowired
    AjlxMapper ajlxMapper;

    @Autowired
    DictMapper dictMapper;

    @Autowired
    DistrictMapper districtMapper;

    @Autowired
    AjdwMapper ajdwMapper;

    @Override
    public List<Ay> findAllAy() {
        return ayMapper.selectAll();
    }

    @Override
    public List<Fydm> findAllFydm() {
        return fydmMapper.selectAll();
    }

    @Override
    public List<AyAjlx> findAllAyAjlx() {
        return ayAjlxMapper.selectAll();
    }

    @Override
    public List<Ajlx> findAllAjlx() {
        return ajlxMapper.selectAll();
    }

    @Override
    public List<Ay> getChirldAy(List<Ay> ayList) {
        List<Ay> ays = new ArrayList<>();
        List<Ay> ayList2 = new ArrayList<>();
        for(Ay ay1 : ayList){
            if("0".equals(ay1.getAySjdm())){
                ayList2.add(ay1);
            }
        }
        for (Ay ay2 : ayList2){
            ays.add(getAyInfo(ay2,ayList));
        }
        return ays;
    }

    private Ay getAyInfo(Ay ay,List<Ay> ayList){
        List<Ay> ays = new ArrayList<>();
        for(Ay ay1 : ayList){
            if(ay.getAyDm().equals(ay1.getAySjdm())){
                ays.add(ay1);
            }
        }
        if(!ays.isEmpty()){
            ay.setChirldAy(ays);
            for(Ay ay2 : ays){
                ay2 = getAyInfo(ay2,ayList);
            }
        }
        return ay;
    }

    @Override
    public List<Dict> getSaly(String type,String code){
        return dictMapper.selDictByTypeCode(type,code);
    }

    @Override
    public List<District> getSzd(){
        String parent_id="";
        List<District> list=districtMapper.selDistrictCondiction(parent_id); //查询全国所有行政城市
        //每个节点查找子节点
        for(int i=0;i<list.size();i++){
            District father=list.get(i);
            for(int j=0;j<list.size();j++){
                District district=list.get(j);
                if(father.getId().equals(district.getParentId())){
                    List<District> childList=father.getChildDistrict();
                    if(childList==null){
                        childList=new ArrayList<District>();
                    }
                    childList.add(district);
                    father.setChildDistrict(childList);
                }
            }
        }
        //只返回一级节点
        List<District> returnList=new ArrayList<District>();
        for(District district:list){
            if("000000".equals(district.getParentId())){
                returnList.add(district);
            }
        }
        return returnList;
    }

    @Override
    public List<Ajdw> getAjdw(Ajdw ajdw) {
       return ajdwMapper.select(ajdw);
    }
}
