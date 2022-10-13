package com.mcommandes.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties("microservice-commandes")
@RefreshScope
public class ApplicationPropertiesConfiguration 
{
}
