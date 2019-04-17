package cn.com.taiji.collection.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class DsrVo {
    @ApiModelProperty(value = "id", name = "id")
    private String id;
    @ApiModelProperty(value = "流水号", name = "code")
    private String code;

    //自然人属性

    @ApiModelProperty(value = "诉讼地位", name = "ssdw")
    private String ssdw;
    @ApiModelProperty(value = "诉讼地位名称", name = "ssdwmc")
    private String ssdwmc;
    @ApiModelProperty(value = "类型", name = "lx")
    private String lx;
    @ApiModelProperty(value = "姓名", name = "xm")
    private String xm;
    @ApiModelProperty(value = "别名", name = "bm")
    private String bm;
    @ApiModelProperty(value = "曾用名", name = "cym")
    private String cym;
    @ApiModelProperty(value = "英文名", name = "ywm")
    private String ywm;
    @ApiModelProperty(value = "性别", name = "xb")
    private String xb;
    @ApiModelProperty(value = "出生日期", name = "csrq")
    private String csrq;
    @ApiModelProperty(value = "年龄", name = "nl")
    private String nl;
    @ApiModelProperty(value = "婚姻状况", name = "hyzk")
    private String hyzk;
    @ApiModelProperty(value = "证件类型", name = "zjlx")
    private String zjlx;
    @ApiModelProperty(value = "身份证号码", name = "sfzhm")
    private String sfzhm;
    @ApiModelProperty(value = "是否身份信息验证", name = "sfsfzxxyz")
    private String sfsfzxxyz;
    @ApiModelProperty(value = "身份证件截止日期", name = "sfzjjzrq")
    private String sfzjjzrq;
    @ApiModelProperty(value = "文化程度", name = "whcd")
    private String whcd;
    @ApiModelProperty(value = "民族", name = "mz")
    private String mz;
    @ApiModelProperty(value = "政治面貌", name = "zzmm")
    private String zzmm;
    @ApiModelProperty(value = "身份", name = "sf")
    private String sf;
    @ApiModelProperty(value = "年龄（作案时）", name = "zanl")
    private String zanl;
    @ApiModelProperty(value = "作案时间", name = "zasj")
    private String zasj;
    @ApiModelProperty(value = "年龄（审判时）", name = "spnl")
    private String spnl;
    @ApiModelProperty(value = "行为能力状况", name = "xwnlzk")
    private String xwnlzk;
    @ApiModelProperty(value = "刑事责任能力", name = "xszrnl")
    private String xszrnl;
    @ApiModelProperty(value = "国别或地区", name = "gjdq")
    private String gjdq;
    @ApiModelProperty(value = "流动人员", name = "sfldry")
    private String sfldry;
    @ApiModelProperty(value = "户籍所在地", name = "hjszd")
    private String hjszd;
    @ApiModelProperty(value = "经常居住地", name = "jcjzd")
    private String jcjzd;
    @ApiModelProperty(value = "现住址", name = "xzz")
    private String xzz;
    @ApiModelProperty(value = "涉军情况", name = "sjqk")
    private String sjqk;
    @ApiModelProperty(value = "特殊生理或病理", name = "tsslhbl")
    private String tsslhbl;
    @ApiModelProperty(value = "单位犯罪责任人", name = "sfdwfzzrr")
    private String sfdwfzzrr;
    @ApiModelProperty(value = "工作单位名称", name = "gzdwmc")
    private String gzdwmc;
    @ApiModelProperty(value = "工作单位类型", name = "gzdwlx")
    private String gzdwlx;
    @ApiModelProperty(value = "是否中央国家机关", name = "sfzygjjg")
    private String sfzygjjg;
    @ApiModelProperty(value = "是否人大代表", name = "sfrddb")
    private String sfrddb;
    @ApiModelProperty(value = "涉侨信息", name = "sqxx")
    private String sqxx;
    @ApiModelProperty(value = "是否外籍华人", name = "sfwjhr")
    private String sfwjhr;
    @ApiModelProperty(value = "是否涉侨", name = "sfsq")
    private String sfsq;
    @ApiModelProperty(value = "是否接受电子送达", name = "sfjsdzsd")
    private String sfjsdzsd;
    @ApiModelProperty(value = "指定签收人", name = "zdqsr")
    private String zdqsr;
    @ApiModelProperty(value = "确定送达地址", name = "qdsddz")
    private String qdsddz;
    @ApiModelProperty(value = "联系方式类型", name = "lxfslx")
    private String lxfslx;
    @ApiModelProperty(value = "联系方式", name = "lxfs")
    private String lxfs;
    @ApiModelProperty(value = "羁押日期", name = "jyrq")
    private String jyrq;
    @ApiModelProperty(value = "羁押到期时间", name = "jydqsj")
    private String jydqsj;
    @ApiModelProperty(value = "羁押场所", name = "jycs")
    private String jycs;
    @ApiModelProperty(value = "附带民诉", name = "sffdms")
    private String sffdms;
    @ApiModelProperty(value = "非法取得财产价值", name = "ffqdccjz")
    private String ffqdccjz;
    @ApiModelProperty(value = "强制实施种类", name = "sfqzsszl")
    private String sfqzsszl;
    @ApiModelProperty(value = "采取强制措施时间", name = "cqqzcssj")
    private String cqqzcssj;
    @ApiModelProperty(value = "保证人", name = "bzr")
    private String bzr;
    @ApiModelProperty(value = "保证金额", name = "bzje")
    private String bzje;
    @ApiModelProperty(value = "犯罪金额无法计算", name = "sffzjewfjs")
    private String sffzjewfjs;
    @ApiModelProperty(value = "犯罪金额", name = "fzje")
    private String fzje;
    @ApiModelProperty(value = "在押", name = "sfzy")
    private String sfzy;
    @ApiModelProperty(value = "累犯", name = "sflf")
    private String sflf;
    @ApiModelProperty(value = "曾犯罪", name = "sfcfz")
    private String sfcfz;
    @ApiModelProperty(value = "曾劳教", name = "sfclj")
    private String sfclj;
    @ApiModelProperty(value = "数罪并罚", name = "sfszbf")
    private String sfszbf;

    //法人属性

    @ApiModelProperty(value = "单位名称", name = "dwmc")
    private String dwmc;
    @ApiModelProperty(value = "单位类型", name = "dwlx")
    private String dwlx;
    @ApiModelProperty(value = "是否法人单位", name = "sffrdw")
    private String sffrdw;
    @ApiModelProperty(value = "单位状态", name = "dwzt")
    private String dwzt;
    @ApiModelProperty(value = "证照类型", name = "zzlx")
    private String zzlx;
    @ApiModelProperty(value = "证照号码", name = "zzhm")
    private String zzhm;
    @ApiModelProperty(value = "注册登记地国别或地区", name = "zcdjdq")
    private String zcdjdq;
    @ApiModelProperty(value = "主要办事机构所在地", name = "zybsjgszd")
    private String zybsjgszd;
    @ApiModelProperty(value = "单位登记地", name = "dwdjdz")
    private String dwdjdz;
    @ApiModelProperty(value = "法定代表人", name = "fddbr")
    private String fddbr;
    @ApiModelProperty(value = "单位犯罪责任人", name = "sfdwfzfzr")
    private String sfdwfzfzr;
    @ApiModelProperty(value = "罪犯类型", name = "fzlx")
    private String fzlx;

    //非法人组织属性

    @ApiModelProperty(value = "是否个体工商户", name = "sfgtgsh")
    private String sfgtgsh;
    @ApiModelProperty(value = "负责人姓名", name = "fzrmc")
    private String fzrmc;


    @ApiModelProperty(value = "代理人集合", name = "bhrVos")
    private List<BhrVo> bhrVos;
}
