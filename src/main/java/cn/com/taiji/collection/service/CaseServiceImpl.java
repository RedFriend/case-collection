package cn.com.taiji.collection.service;

import cn.com.taiji.collection.entity.Ajjbxx;
import cn.com.taiji.collection.entity.vo.CaseDsrVo;
import cn.com.taiji.collection.entity.vo.CaseVo;
import cn.com.taiji.collection.mapper.AjjbxxMapper;
import cn.com.taiji.collection.util.AjCompare;
import com.taiji.caze.online.remote.vo.data.CaseData;
import com.taiji.caze.online.remote.vo.data.Dsr;
import com.taiji.caze.online.remote.vo.data.ElCaseInfo;
import com.taiji.caze.online.remote.vo.data.MsAjxx;
import com.taiji.common.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CaseServiceImpl implements CaseService {

    @Autowired
    AjjbxxMapper ajjbxxMapper;

    @Autowired
    com.taiji.caze.online.remote.service.CaseService caseOnlineService;

    public Map<String, Object> addAjjbxx(Ajjbxx ajjbxx) {
        Map<String, Object> map = new HashMap<>();

        //添加
        ajjbxx.setId(null);
        ajjbxx.setCode(ajjbxxMapper.getStandCode(ajjbxx.getCbfy()));
        ajjbxxMapper.insert(ajjbxx);
        map.put("code", "true");
        map.put("returnStr", "添加成功");
        map.put("data", ajjbxx);
        return map;
    }

    public Map<String, Object> updAjjbxx(Ajjbxx ajjbxx) {
        Map<String, Object> map = new HashMap<>();

        //特殊处理
        if (ObjectUtils.isEmpty(ajjbxx.getId())) {
            map.put("code", "false");
            map.put("returnStr", "参数id不能为空");
            return map;
        }
        Ajjbxx ajj = ajjbxxMapper.selectByPrimaryKey(ajjbxx.getId());
        if (ajj == null) {
            map.put("code", "false");
            map.put("returnStr", "此案件不存在");
            return map;
        }

        ajjbxxMapper.updateByPrimaryKey(ajjbxx);
        map.put("code", "true");
        map.put("returnStr", "修改成功");
        map.put("data", ajjbxx);
        return map;
    }

    @Override
    public Map<String, Object> selectCase(Ajjbxx ajjbxx) {
        Map<String, Object> map = new HashMap<>();
        if (null == ajjbxx) {
            map.put("code", "false");
            map.put("returnStr", "参数不能为空");
            return map;
        }
        List<Ajjbxx> ajjbxxes = ajjbxxMapper.select(ajjbxx);
        if (CommonUtil.isNull(ajjbxxes)) {
            map.put("code", "false");
            map.put("returnStr", "未查询到案件，请核对查询值！");
        }
        Ajjbxx finalData = findFinal(ajjbxxes);
        map.put("code", "true");
        map.put("data", finalData);
        return map;
    }

    @Override
    public Map<String, Object> pushCase(CaseDsrVo caseDsrVo) {
        try {
            CaseVo cas=caseDsrVo.getCaseVo();

            ElCaseInfo elCaseInfo = new ElCaseInfo();
            elCaseInfo.setSourceEnum(com.taiji.caze.online.remote.vo.data.enums.SourceEnum.DZJZ);
            elCaseInfo.setXladr(0);
            elCaseInfo.setFydm(cas.getCbfy());

            List<CaseData> list = new ArrayList<>();
            CaseData caseData = new CaseData();
            caseData.setAjlb(cas.getAjlb());
            caseData.setOid(cas.getCode());
            caseData.setImpType(1);

            MsAjxx msAjxx = new MsAjxx();
            msAjxx.setAjlx("0301");
            msAjxx.setAjsjlx("255");
            msAjxx.setBz("111111");
            msAjxx.setFydm("2577");
            msAjxx.setGxyj("9");
            msAjxx.setQsay("9196");
            msAjxx.setQsaymc("房屋租赁合同纠纷");
            msAjxx.setSaly("2101");
            msAjxx.setSfjgsqtj("2");
            msAjxx.setSsbdje("800578.1");
            msAjxx.setSsbdw("");
            msAjxx.setSsbdxw("");
            msAjxx.setSsqq("1、请求依法判令被告向原告支付结欠的租赁费用合计人民币800578.1元；\n" +
                    "2、本案诉讼费用由被告承担。");
            msAjxx.setSsyly("2012年3月14日，原告与被告签订两份《房屋租赁合同》，约定原告将深圳市龙华新区民治街道民治社区春华四季园10栋89、90号房屋出租给被告用于商业经营，双方就租金、租赁期限等进行了约定。原告依约交付了房屋，被告未依约向原告支付租金、电费等费用，原告多次催收被告拒绝支付，原告特向贵院提起诉讼，请求依法判如所请。");

            caseData.setAjxx(msAjxx);

            List<Dsr> dsrList = new ArrayList<>();
            Dsr dsr = new Dsr();
            dsr.setBaajdw("1");
            dsr.setDlrList(new ArrayList<Dsr.Dlr>());
            dsr.setDssarfl("1");
            dsr.setDssarlx("1");
            List<Dsr.Lxfs> lxfsList = new ArrayList<>();
            dsr.setLxfsList(lxfsList);
            List<Dsr.Sddz> sddzList = new ArrayList<>();
            Dsr.Sddz sddz1 = new Dsr.Sddz();
            dsr.setSddzList(sddzList);
            sddz1.setSddz("广西贺州市八步区开山镇开山村二十七组492号");
            sddz1.setFydm("2577");
            sddz1.setSddzqsr("张凤玲");
            sddzList.add(sddz1);
            dsr.setZrrdh("18682198341");
            dsr.setZrrsfzh("23062119750305158X");
            dsr.setZrrsfzjlx("1");
            dsr.setZrrxb("1");
            dsr.setZrrxm("张凤玲");
            dsr.setZrrxzz("广西贺州市八步区开山镇开山村二十七组492号");
            dsr.setBaajdw("2");
            dsrList.add(dsr);


            Dsr dsr1 = new Dsr();
            dsr1.setBaajdw("1");
            dsr1.setDlrList(new ArrayList<Dsr.Dlr>());
            dsr1.setDssarfl("1");
            dsr1.setDssarlx("1");
            dsr.setLxfsList(lxfsList);
            Dsr.Sddz sddz2 = new Dsr.Sddz();
            dsr1.setSddzList(sddzList);
            sddz1.setSddz("深圳市福田区金田路皇岗商务中心1号楼705");
            sddz1.setFydm("2577");
            sddz1.setSddzqsr("李志");
            sddzList.add(sddz1);
            dsr1.setZrrdh("18682198341");
            dsr1.setZrrsfzh("430481119890228461X");
            dsr1.setZrrsfzjlx("1");
            dsr1.setZrrxb("1");
            dsr1.setZrrxm("李志");
            dsr1.setZrrxzz("深圳市福田区金田路皇岗商务中心1号楼705");
            dsr1.setBaajdw("1");
            dsrList.add(dsr1);

            caseData.setDsrList(dsrList);

            list.add(caseData);
            elCaseInfo.setCaseData(list);



            com.taiji.caze.online.remote.vo.data.ResultInfo result = caseOnlineService.collectCase(elCaseInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private Ajjbxx findFinal(List<Ajjbxx> list) {

        Ajjbxx ajjbxx = new Ajjbxx();
        for (int i = 0; i < list.size(); i++) {
            Ajjbxx sample = list.get(i);
            try {
                AjCompare<Ajjbxx> ajCompare = new AjCompare<>();
                ajjbxx = ajCompare.compare(ajjbxx, sample);
            } catch (Exception e) {
                continue;
            }
        }
        return ajjbxx;
    }

}
