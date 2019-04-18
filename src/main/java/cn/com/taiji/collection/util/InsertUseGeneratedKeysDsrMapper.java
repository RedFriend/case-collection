package cn.com.taiji.collection.util;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.provider.SpecialProvider;

@RegisterMapper
public interface InsertUseGeneratedKeysDsrMapper<T> {
    @Options(
            useGeneratedKeys = true,
            keyProperty = "dsrId"
    )
    @InsertProvider(
            type = SpecialProvider.class,
            method = "dynamicSQL"
    )
    int insertUseGeneratedKeys(T var1);
}
