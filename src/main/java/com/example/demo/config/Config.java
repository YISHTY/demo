package com.example.demo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author  yzk
 * @since   2022/4/2 16:10
 * @version 1.0
**/

@ConfigurationProperties(prefix = "run.script")
@Component
@Getter
@Setter
public class Config {
    private String cpp;
    private String c;
    private String python;
}
