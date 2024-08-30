package com.meergo.analytics.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Configuration properties for the Meergo Analytics client. Since the client only supports writes
 * at this point, the write key is the only (and required) property.
 *
 * @author Christopher Smith
 */
@ConfigurationProperties("meergo.analytics")
public class MeergoProperties {

  private String writeKey;

  public String getWriteKey() {
    return writeKey;
  }

  public void setWriteKey(String writeKey) {
    this.writeKey = writeKey;
  }
}
