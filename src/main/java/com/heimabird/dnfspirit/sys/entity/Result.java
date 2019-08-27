package com.heimabird.dnfspirit.sys.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author hellobird
 * @date 2019/8/28
 */
@Data
@Component
public class Result {

    private String status;

    private String message;

}
