package cn.com.taiji.collection.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
public class CaseVo {

    @ApiModelProperty(value = "主键")
    private Integer id;

    @ApiModelProperty(value = "流水号")
    private String code;

    @ApiModelProperty(value = "材料编号")
    private String clbh;

    @ApiModelProperty(value = "材料状态=1=以核对、0=未核对")
    private String clzt;

    @ApiModelProperty(value = "创建日期")
    private String cjrq;

    @ApiModelProperty(value = "承办法院")
    private String cbfy;

    @ApiModelProperty(value = "承办部门")
    private String cbbm;

    @ApiModelProperty(value = "案件来源")
    private String ajly;

    @ApiModelProperty(value = "诉讼标的")
    private String ssbd;

    @ApiModelProperty(value = "诉讼标的行为")
    private String ssbdxw;

    @ApiModelProperty(value = "诉讼标的物")
    private String ssbdw;

    @ApiModelProperty(value = "适用程序 ：1简易 2 普通")
    private String sycx;

    @ApiModelProperty(value = "案件类别")
    private String ajlb;

    @ApiModelProperty(value = "案件分类")
    private String ajfl;

    @ApiModelProperty(value = "字号")
    private String zh;

    @ApiModelProperty(value = "收到诉状日期")
    private String sdszrq;

    @ApiModelProperty(value = "立案案由")
    private String laay;

    @ApiModelProperty(value = "是否繁案")
    private String sffa;

    @ApiModelProperty(value = "案件状态")
    private String ajzt;

    @ApiModelProperty(value = "应缴诉讼费")
    private String yjssf;

    @ApiModelProperty(value = "刑事案件:公诉机关")
    private String gsjg;

    @ApiModelProperty(value = "刑事案件:公诉书编号")
    private String gssbh;

    @ApiModelProperty(value = "刑事案件:公安机关")
    private String gajg;

    @ApiModelProperty(value = "收案法官")
    private String safg;

    @ApiModelProperty(value = "案由名称")
    private String aymc;

    @ApiModelProperty(value = "案件涉及")
    private String ajsj;

    @ApiModelProperty(value = "是否大案")
    private String sfda;

    @ApiModelProperty(value = "大案成因")
    private String dacy;

    @ApiModelProperty(value = "是否要案")
    private String sfya;

    @ApiModelProperty(value = "要案成因")
    private String yacy;

    @ApiModelProperty(value = "收费类型")
    private String sflx;

    @ApiModelProperty(value = "适用审限")
    private String sysx;

    @ApiModelProperty(value = "适用审限")
    private String spcx;

    @ApiModelProperty(value = "立案管辖依据")
    private String lagxyj;

    @ApiModelProperty(value = "立案案由 （主体类型）")
    @Column(name = "laay_ztlx")
    private String laayZtlx;

    @ApiModelProperty(value = "立案案由（行政行为种类）")
    @Column(name = "laay_xzxwzl")
    private String laayXzxwzl;

    @ApiModelProperty(value = "行政行为")
    private String xzxw;

    @ApiModelProperty(value = "提起行政赔偿方式")
    private String tqpcfs;

    @ApiModelProperty(value = "")
    private String slcx;

    @ApiModelProperty(value = "赔偿案件类型")
    private String pcajlx;

    @ApiModelProperty(value = "请求赔偿对象")
    private String qqpcdx;

    @ApiModelProperty(value = "确认案件类别")
    private String pcfs;

    @ApiModelProperty(value = "赔偿审判依据")
    private String pcspcx;

    @ApiModelProperty(value = "报请案件案由")
    @Column(name = "laay_bqajay")
    private String laayBqajay;

    @ApiModelProperty(value = "公诉人")
    private String gsr1;

    @ApiModelProperty(value = "案件类型")
    private String ajlx;

    @ApiModelProperty(value = "收案法官姓名")
    private String safgxm;

    @ApiModelProperty(value = "核对人")
    private String hdr;

    @ApiModelProperty(value = "核对时间")
    private String hdsj;

    @ApiModelProperty(value = "分级码")
    private String fjm;

    @ApiModelProperty(value = "")
    @Column(name = "HY_SASJ")
    private String hySasj;

    @ApiModelProperty(value = "")
    @Column(name = "HY_LASJ")
    private String hyLasj;

    @ApiModelProperty(value = "")
    @Column(name = "HY_SXRQ")
    private String hySxrq;

    @ApiModelProperty(value = "")
    @Column(name = "HY_YWLX")
    private String hyYwlx;

    @ApiModelProperty(value = "来源")
    private String source;

    @ApiModelProperty(value = "优先级")
    private Integer level;

    @ApiModelProperty(value = "创建时间")
    @Column(name = "create_time")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    @Column(name = "update_time")
    private Date updateTime;

    @ApiModelProperty(value = "讼请求")
    private String ssqq;

    @ApiModelProperty(value = "事实与理由")
    private String ssyly;

}
