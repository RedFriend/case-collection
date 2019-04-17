package cn.com.taiji.collection.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class CaseDsrVo {

    @ApiModelProperty(value = "案件实体", name = "caseVo")
    private CaseVo caseVo;

    @ApiModelProperty(value = "当事人集合", name = "dsrVos")
    List<DsrVo> dsrVos;
}
