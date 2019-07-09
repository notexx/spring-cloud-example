package cn.waynezw.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceHiHystric implements HelloService {
    @Override
    public String say(String name) {
        return "sorry "+name;
    }
}
