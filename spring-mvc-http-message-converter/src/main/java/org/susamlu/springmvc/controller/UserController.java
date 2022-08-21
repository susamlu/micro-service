package org.susamlu.springmvc.controller;

import cn.hutool.core.util.IdUtil;
import cn.hutool.json.JSONUtil;
import org.springframework.web.bind.annotation.*;
import org.susamlu.springmvc.controller.model.UserRequest;

/**
 * @author Sam Lu
 * @date 2022/08/20
 */
@RestController
public class UserController {

    @PostMapping("/api/users")
    public UserRequest createUser(@RequestBody UserRequest userRequest) {
        userRequest.setId(IdUtil.getSnowflakeNextId());
        return userRequest;
    }

}
