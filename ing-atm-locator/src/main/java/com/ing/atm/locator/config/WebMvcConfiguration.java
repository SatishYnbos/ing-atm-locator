package com.ing.atm.locator.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter
{
  @Override
  public void addViewControllers(ViewControllerRegistry viewControllerRegistry)
  {
    viewControllerRegistry.addViewController("/home").setViewName("home");
    viewControllerRegistry.addViewController("/").setViewName("login");
    viewControllerRegistry.addViewController("/login").setViewName("login");
  }
}
