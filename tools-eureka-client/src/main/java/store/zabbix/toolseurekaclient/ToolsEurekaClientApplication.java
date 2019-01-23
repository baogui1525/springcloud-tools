package store.zabbix.toolseurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ToolsEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToolsEurekaClientApplication.class, args);
    }

    @Value("${server.port}")
    private int port;

    @GetMapping("test")
    public String showPort(){
        return "my port is "+port ;
    }

}

