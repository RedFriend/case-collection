package cn.com.taiji.collection.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author penghongyou
 * @Description Swagger配置类
 * @date 2018年6月19日
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${swagger.showEnable:true}")
    private boolean swaggerShowEnable;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.com.taiji.collection.controller"))
                .paths(PathSelectors.any())
                .build().enable(swaggerShowEnable);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("电子卷宗案件推送接口文档")
                .description("Rest API文档")
                .version("1.0")
                .build();
    }
}
