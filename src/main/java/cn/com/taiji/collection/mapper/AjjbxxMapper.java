package cn.com.taiji.collection.mapper;

import cn.com.taiji.collection.entity.Ajjbxx;
import cn.com.taiji.collection.util.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface AjjbxxMapper extends BaseMapper<Ajjbxx> {

    public Ajjbxx selAjjbxxByCode(@Param("code")String code);
}