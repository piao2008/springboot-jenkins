package com.as.springbootjenkins;

import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJenkinsApplication.class, args);
    }
    // 可选：注册一个 TimedAspect 来自动记录方法执行时间等指标。
    @Bean
    public TimedAspect timedAspect(MeterRegistry registry) {
        return new TimedAspect(registry);
    }
}
