package cn.com.taiji.collection.service;

import cn.com.taiji.collection.entity.vo.CaseDsrVo;
import cn.com.taiji.collection.entity.vo.CaseVo;
import cn.com.taiji.collection.entity.vo.DsrVo;
import com.alibaba.fastjson.JSON;
import com.taiji.caze.online.remote.service.CaseService;
import com.taiji.caze.online.remote.vo.data.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class CollectionCaseServiceImpl implements CollectionCaseService {

    @Autowired
    CaseService caseService;

    @Override
    public Map pushCase(CaseDsrVo caseDsrVo) {
        CaseVo caseVo=caseDsrVo.getCaseVo();
        List<DsrVo> dsrVos=caseDsrVo.getDsrVos();


        ElCaseInfo elCaseInfo = new ElCaseInfo();
        elCaseInfo.setSourceEnum(com.taiji.caze.online.remote.vo.data.enums.SourceEnum.DZJZ);
        elCaseInfo.setXladr(0);
        elCaseInfo.setFydm(caseVo.getCbbm());

        List<CaseData> list = new ArrayList<>();
        CaseData caseData = new CaseData();
        caseData.setAjlb("0300");
        caseData.setOid("asdfghjkl123");
        MsAjxx msAjxx = new MsAjxx();
        msAjxx.setAjlx("0301");
        msAjxx.setAjsjlx("255");
        msAjxx.setBz("1.网上立案查询号：M10011811151224663399511\n" +
                "2.申请立案备注：\n" +
                "3.网上立案审核备注：");
        msAjxx.setFydm("2581");
        msAjxx.setGxyj("被告住所地");
        msAjxx.setQsay("9047");
        msAjxx.setQsaymc("物权纠纷");
        msAjxx.setSaly("1");
        msAjxx.setSfjgsqtj("2");
        msAjxx.setSsbdje("1232222222.0000");
        msAjxx.setSsbdw("");
        msAjxx.setSsbdxw("");
        msAjxx.setSsqq("1、\t判令被告支付解除劳动关系的经济补偿金4500元；\n" +
                "2、\t判令被告支付2015年9月30日至2016年5月30日未依法签订劳动合同的二倍工资差额36000元（4500元／月×8个月）；\n" +
                "3、\t判令被告支付2015年9月10月高温津贴300元；\n" +
                "4、\t判令被告承担本案诉讼费；\n" +
                "5、\t以上诉讼金额合计40800.00元，本案诉讼费用由被告承担。\n");
        msAjxx.setSsyly("原告于2015年8月31日入职被告处，职务：备料，月工资4500元。\n" +
                "入职以来被告一直未依法为原告缴纳社会保险费，也没有同原告签订书面劳动合同。现原告依据《中华人民共和国劳动合同法》第三十八条第一款第三项的规定，以被告未依法为劳动者缴纳社会保险费为由，通过申请劳动仲裁送达形式同被告解除劳动关系。依据《中华人民共和国劳动合同法》第四十六条、四十七条之规定，应当向劳动者支付经济补偿。为保护原告的合法权益，特依法向人民法院起诉。\n" +
                "\n" +
                "证据和证据来源\n" +
                "1、\t购销协议一份（复印件），原被告双方签订。\n" +
                "2、\t送货单35份（复印件），被告签收确认。\n");

        caseData.setAjxx(msAjxx);

        List<Dsr> dsrList = new ArrayList<>();
        Dsr dsr = new Dsr();
        dsr.setBaajdw("1");

        List<Dsr.Dlr> dlrList = new ArrayList<>();
        Dsr.Dlr dlr = new Dsr.Dlr();
        dlr.setDlrmc("1");
        dlr.setDlrlx("1");
        dlr.setFydm("2581");
        dlr.setLsxm("测试");
        dlr.setLszyzgzh("11111201611222222");
        dlr.setZrrdh("13775895666");
        dlr.setZrrsfzh("11111201611222222");
        dlr.setZrrsfzjlx("255");
        dlr.setZrrxm("测试");
        dlrList.add(dlr);

        Dsr.Dlr dlr1 = new Dsr.Dlr();
        dlr1.setDlrmc("2");
        dlr1.setDlrlx("");
        dlr1.setFydm("2581");
        dlr1.setLsxm("");
        dlr1.setLszyzgzh("");
        dlr1.setZrrdh("");
        dlr1.setZrrsfzh("");
        dlr1.setZrrsfzjlx("");
        dlr1.setZrrxm("");
        dlrList.add(dlr1);
        dsr.setDlrList(dlrList);
        dsr.setDssarfl("1");
        dsr.setDssarlx("1");

        List<Dsr.Lxfs> lxfsList = new ArrayList<>();
        dsr.setLxfsList(lxfsList);

        List<Dsr.Sddz> sddzList = new ArrayList<>();
        Dsr.Sddz sddz1 = new Dsr.Sddz();
        sddz1.setSddz("广西贺州市八步区开山镇开山村二十七组492号2");
        sddz1.setFydm("2581");
        sddz1.setSddzqsr("测试");
        sddzList.add(sddz1);
        dsr.setSddzList(sddzList);
        dsr.setZrrdh("13019092202");
        dsr.setZrrsfzh("452426196902243318");
        dsr.setZrrsfzjlx("1");
        dsr.setZrrxb("1");
        dsr.setZrrxm("测试");
        dsr.setZrrxzz("广西贺州市八步区开山镇开山村二十七组492号");
        dsrList.add(dsr);
        caseData.setDsrList(dsrList);

        caseData.setImpType(1);
        caseData.setOid("255010224663378595");
        List<Ysxx> ysxxList = new ArrayList<>();
        caseData.setYsxxList(ysxxList);

        List<Zjcl> zjclList = new ArrayList<>();
        Zjcl zjcl = new Zjcl();
        zjcl.setFydm("2581");
        zjcl.setZjlx("30");
        zjcl.setZjmc("民事起诉状模板-蒋-副本(3).doc");
        List<Zjcl.St> stList = new ArrayList<>();
        Zjcl.St st = new Zjcl.St();
        st.setAjfl("1");
        st.setFydm("2581");
        st.setStbh("255010224663396842");
        st.setStlb("3");
        st.setStmc("民事起诉状模板-蒋-副本(3).doc");
        List<Zjcl.Wbwj> wbwjList = new ArrayList<>();
        Zjcl.Wbwj wbwj = new Zjcl.Wbwj();
        wbwj.setFydm("2550");
        wbwj.setWjsfdsrtj("1");
        wbwj.setGxzyfwqurl("http://146.12.97.31:8080/doc/dossier_files/2583/201801/5a4de473ca55747ffe69e284/words/5a94af5f6c9d0006f600570f.doc");
        wbwj.setWjwjmc("网上合议.doc");
        wbwj.setWjxsmc("网上合议.doc");
        wbwjList.add(wbwj);
        st.setWbwjList(wbwjList);
        stList.add(st);
        zjcl.setStList(stList);
        zjclList.add(zjcl);
        caseData.setZjclList(zjclList);
        list.add(caseData);
        elCaseInfo.setCaseData(list);
//        ResultInfo resultInfo = caseService.collectCase(elCaseInfo);
//        System.out.println(JSON.toJSON(resultInfo));
        log.info("修改完毕");





        return null;
    }
}
