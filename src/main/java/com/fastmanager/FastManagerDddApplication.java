package com.fastmanager;

import com.fastmanager.Infrastructure.helper.SpringEnvHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class FastManagerDddApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastManagerDddApplication.class, args);
        log.info("-------------------------"+SpringEnvHelper.getAppName()+"-------------------------");
        log.info("-------------------------"+SpringEnvHelper.getLocalhostIp()+"-------------------------");
        log.info("-------------------------"+SpringEnvHelper.getProcessId()+"-------------------------");

    }

}
