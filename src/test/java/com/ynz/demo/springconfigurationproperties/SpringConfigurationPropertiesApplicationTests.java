package com.ynz.demo.springconfigurationproperties;

import lombok.RequiredArgsConstructor;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertAll;

@SpringBootTest
@RequiredArgsConstructor
class SpringConfigurationPropertiesApplicationTests {
    private final ConfigurableApplicationContext applicationContext;

    @Value("${client.mail.hostName}")
    private String expectedHost;

    @Value("${client.mail.port}")
    private int expectedPort;

    @Value("${client.mail.from}")
    private String expectedFrom;

    @Test
    void contextLoads() {
        assertThat(applicationContext, Matchers.notNullValue());
        assertThat(expectedHost, Matchers.notNullValue());
    }

    @Test
    void beanFactoryShouldCreateClientHostInfo() {
        ClientHostInfo clientHostInfo = applicationContext.getBean(ClientHostInfo.class);
        assertThat(clientHostInfo, Matchers.notNullValue());

        assertAll(
                () -> assertThat(clientHostInfo.getHostName(), is(expectedHost)),
                () -> assertThat(clientHostInfo.getPort(), is(expectedPort)),
                () -> assertThat(clientHostInfo.getFrom(), is(expectedFrom))
        );
    }

}
