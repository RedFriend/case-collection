package cn.com.taiji.collection.mapper;

import cn.com.taiji.collection.entity.District;
import cn.com.taiji.collection.util.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DistrictMapper extends BaseMapper<District> {

    public List<District> selDistrictCondiction(@Param("parent_id") String parent_id);
}