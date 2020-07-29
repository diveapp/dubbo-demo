package com.happy.home.dubbo.common.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author: lijixiao
 * @date: 2020-07-29
 */
@Data
@Accessors(chain = true)
public class UserVO implements Serializable {

    private Integer id;

    private String name;

    private Integer age;
}
