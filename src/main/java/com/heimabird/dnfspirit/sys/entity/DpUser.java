package com.heimabird.dnfspirit.sys.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author HelloBird
 * @since 2019-08-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class DpUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户创建日期
     */
    private LocalDateTime createDate;

    /**
     * 用户id
     */
    private String id;

    /**
     * 机器码
     */
    private String machineCode;

    /**
     * 绑定ip
     */
    private String bindIp;


}
