package com.meergo.analytics.autoconfigure;

import com.meergo.analytics.Analytics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring Boot autoconfiguration class for Meergo Analytics.
 *
 * @author Christopher Smith
 */
@Configuration
@EnableConfigurationProperties(MeergoProperties.class)
@ConditionalOnProperty("meergo.analytics.writeKey")
public class MeergoAnalyticsAutoConfiguration {

  @Autowired private MeergoProperties properties;

  @Bean
  public Analytics meergoAnalytics() {
    return Analytics.builder(properties.getWriteKey()).build();
  }
}
