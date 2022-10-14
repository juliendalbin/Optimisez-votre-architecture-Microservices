package com.mproduits.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties("microservice-produits")
@RefreshScope
public class ApplicationPropertiesConfiguration 
{

  private int limitDeProduits;

  public int getLimitDeProduits() 
{

      return limitDeProduits;

  }

  public void setLimitDeProduits(int limitDeProduits) 
{
      this.limitDeProduits = limitDeProduits;
  }
}
