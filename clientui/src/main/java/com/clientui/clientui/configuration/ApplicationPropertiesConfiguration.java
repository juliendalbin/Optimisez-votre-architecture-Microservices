package com.clientui.clientui.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties("microservice-clientui")
@RefreshScope
public class ApplicationPropertiesConfiguration 
{
}
