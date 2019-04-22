package com.greeting.example.config;

import com.greeting.example.filter.PreFilter;


public class FilterConfig {
    
    public PreFilter preFilter() {
        return new PreFilter();
    }
    /*
    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }
    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }
    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }*/
}
