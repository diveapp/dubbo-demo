package com.happy.home.dubbo.service.api;

import com.happy.home.dubbo.common.vo.UserVO;
import com.happy.home.dubbo.common.api.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author: lijixiao
 * @date: 2020-07-29
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserVO getUser() {
        return new UserVO()
                .setId(1)
                .setName("小宝")
                .setAge(1);
    }
}
