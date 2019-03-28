package cn.com.taiji.collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ImportResource;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 收案信息录入
 *
 * @author penghongyou
 */
@SpringBootApplication
@EnableCaching
@MapperScan(basePackages = "cn.com.taiji.collection.mapper")
@ImportResource(locations="classpath:dubbo.xml")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
