package cn.com.taiji.collection.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CaseVo {

    @ApiModelProperty(value = "id", name = "id")
    private String id;
    @ApiModelProperty(value = "流水号", name = "code")
    private String code;

}
