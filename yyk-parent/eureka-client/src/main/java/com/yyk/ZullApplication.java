package com.yyk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ZullApplication {
	    public static void main(String[] args) {
	        SpringApplication.run(ZullApplication.class, args);
	    }

	    @Bean
	    @Autowired
	    @LoadBalanced  //@LoadBalanced 表示开启负载均衡
	    RestTemplate restTemplate(){
	        return new RestTemplate();
	    }
}
