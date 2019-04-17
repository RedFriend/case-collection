package cn.com.taiji.collection.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BhrVo {
    @ApiModelProperty(value = "id", name = "id")
    private String id;
    @ApiModelProperty(value = "流水号", name = "code")
    private String code;
    @ApiModelProperty(value = "所属当事人id", name = "dsrId")
    private String dsrId;
    @ApiModelProperty(value = "代理人名称", name = "dlrmc")
    private String dlrmc;
    @ApiModelProperty(value = "与当事人关系", name = "ydsrgx")
    private String ydsrgx;
    @ApiModelProperty(value = "代理人姓名", name = "dlrxm")
    private String dlrxm;
    @ApiModelProperty(value = "诉讼代理人身份", name = "ssdlrsf")
    private String ssdlrsf;
    @ApiModelProperty(value = "是否法律援助", name = "sfflyz")
    private String sfflyz;
    @ApiModelProperty(value = "代理人证件类型", name = "dlrzjlx")
    private String dlrzjlx;
    @ApiModelProperty(value = "代理人证件号码", name = "dlrzjhm")
    private String dlrzjhm;
    @ApiModelProperty(value = "代理人电话", name = "dlrdh")
    private String dlrdh;
    @ApiModelProperty(value = "代理人邮编", name = "dlryb")
    private String dlryb;
    @ApiModelProperty(value = "代理人单位", name = "dlrdw")
    private String dlrdw;
    @ApiModelProperty(value = "代理人单位注册地", name = "dlrdwzcd")
    private String dlrdwzcd;
    @ApiModelProperty(value = "代理人单位地址", name = "dlrdwdz")
    private String dlrdwdz;

}
