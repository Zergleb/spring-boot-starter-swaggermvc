package org.springframework.boot.autoconfigure.bootswaggermvc;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.bootswaggermvc.controllers.SwaggerMVCController;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mangofactory.swagger.plugin.EnableSwagger;

@EnableSwagger
@Configuration
@AutoConfigureAfter(ThymeleafAutoConfiguration.class)
public class SwaggerMVCAutoConfig {
	@Bean
	public SwaggerMVCController controller() {
		return new SwaggerMVCController();
	}
}
