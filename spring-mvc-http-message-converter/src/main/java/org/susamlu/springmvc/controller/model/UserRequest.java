package org.susamlu.springmvc.controller.model;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Sam Lu
 * @date 2022/08/20
 */
@Data
public class UserRequest {

    private Long id;

    private String name;

    private Date createTime;

    private Date updateTime;

}
