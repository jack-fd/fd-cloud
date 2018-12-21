package com.github.fd.upms.service.impl;

import com.github.fd.upms.model.entity.User;
import com.github.fd.upms.mapper.UserMapper;
import com.github.fd.upms.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author mq
 * @since 2018-12-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
