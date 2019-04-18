//package cn.com.taiji.collection.conf;
//
//import org.springframework.boot.autoconfigure.AutoConfigureAfter;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import tk.mybatis.spring.mapper.MapperScannerConfigurer;
//
//import java.util.Properties;
//
//@Configuration
//@AutoConfigureAfter(MybatisScannerConfig.class)
//public class MybatisScannerConfig {
//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer() {
//
//        Properties properties = new Properties();
//        properties.put("mappers", "tk.mybatis.mapper.common.Mapper");
//
//        MapperScannerConfigurer msc = new MapperScannerConfigurer();
//        msc.getMapperHelper().setProperties(properties);
//        msc.setBasePackage("cn.com.taiji.collection.mapper");
//
//        return msc;
//    }
//}
