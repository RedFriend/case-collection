package cn.com.taiji.collection.mapper;

import cn.com.taiji.collection.entity.Dsr;
import cn.com.taiji.collection.util.InsertUseGeneratedKeysDsrMapper;
import tk.mybatis.mapper.common.Mapper;

public interface DsrMapper extends Mapper<Dsr>,InsertUseGeneratedKeysDsrMapper<Dsr> {
}