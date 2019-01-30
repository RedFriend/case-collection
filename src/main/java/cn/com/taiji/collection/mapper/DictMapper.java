package cn.com.taiji.collection.mapper;

import cn.com.taiji.collection.entity.Dict;
import cn.com.taiji.collection.util.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DictMapper extends BaseMapper<Dict> {

    public List<Dict> selDictByTypeCode(@Param("type")String type, @Param("code")String code);

}