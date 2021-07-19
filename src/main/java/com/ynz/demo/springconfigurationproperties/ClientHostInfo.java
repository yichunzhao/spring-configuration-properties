package com.ynz.demo.springconfigurationproperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "client.mail")
@Getter
@Setter
@NoArgsConstructor
public class ClientHostInfo {
    private String hostName;
    private int port;
    private String from;
}
