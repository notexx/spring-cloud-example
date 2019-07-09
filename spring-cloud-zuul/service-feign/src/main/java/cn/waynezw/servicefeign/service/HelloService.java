package cn.waynezw.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi", fallback = HelloServiceHiHystric.class)
public interface HelloService {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String say(@RequestParam(value = "name") String name);
}