package cn.waynezw.ribbon.service.impl;

import cn.waynezw.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public String say(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
}
