package tobyspring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import tobyspring.config.EnableMyAutoConfiguration;
import tobyspring.config.autoconfig.DispatcherServletConfig;
import tobyspring.config.autoconfig.TomcatWebServerConfig;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // 어노테이션 정보를 런타임까지 유지
@Target(ElementType.TYPE) // class, interface , ENUM
@Configuration
@ComponentScan // 이 어노테이션이 있는 클래스부터 스캔 시작
@EnableMyAutoConfiguration
public @interface MySpringBootApplication {
}
