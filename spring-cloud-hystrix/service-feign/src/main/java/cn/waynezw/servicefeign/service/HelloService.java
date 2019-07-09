package cn.waynezw.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi",fallback = HelloServiceHiHystric.class)
public interface HelloService {
    @GetMapping(value = "/hi")
    String say(@RequestParam(value = "name") String name);
}