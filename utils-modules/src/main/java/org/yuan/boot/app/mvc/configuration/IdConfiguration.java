package org.yuan.boot.app.mvc.configuration;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IdConfiguration {
    @Bean
    @ConditionalOnMissingClass("cn.hutool.core.lang.Snowflake")
    public Snowflake snowflake() {
        return IdUtil.createSnowflake(1, 1);
    }
}
