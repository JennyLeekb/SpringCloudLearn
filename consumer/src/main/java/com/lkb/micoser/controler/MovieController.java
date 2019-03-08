package com.lkb.micoser.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.client.RestTemplate;

import com.lkb.micoser.POJO.User;

@RestController
public class MovieController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping("consumer/getById")
	public User getById(int id) {
		return this.restTemplate.getForObject("http://localhost:8000/user/getById?id=" + id, User.class);
	}

	/**
	   * 查询microservice-provider-user服务的信息并返回
	   * @return microservice-provider-user服务的信息
	   */
	  @GetMapping("consumer/user")
	  public List<ServiceInstance> showInfo() {
	    return this.discoveryClient.getInstances("user");
	  }
	
}
