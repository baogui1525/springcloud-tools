package store.zabbix.toolsrouting.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("eureka-client")
public interface CallServiceTest {

    @GetMapping("test")
    String api(@RequestParam(value = "name",required = false) String name);

}
