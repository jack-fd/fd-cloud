package com.github.fd.upms.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.fd.common.util.Query;
import com.github.fd.common.util.ValidatorUtils;
import com.github.fd.common.vo.RestResult;
import com.github.fd.upms.model.entity.User;
import com.github.fd.upms.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

/**
 * 用户表 控制器
 *
 * @author mq
 * @date 2018-12-21
 */
@Slf4j
@RestController
@Api(tags = "用户表接口")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 列表
     */
    @ApiOperation("列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public RestResult<IPage<User>> list(@RequestBody Query query) {
        IPage<User> page = query.getPagination();
        QueryWrapper<User> queryWrapper = query.getQueryWrapper();
        return RestResult.ok(userService.page(page, queryWrapper));
    }

    /**
     * 信息
     */
    @ApiOperation("信息")
    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
    public RestResult<User> info(@PathVariable("id") Integer id) {
        User entity = userService.getById(id);
        return RestResult.ok(entity);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public RestResult<String> save(@RequestBody User user) {
        userService.save(user);
        return RestResult.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public RestResult<String> update(@RequestBody User user) {
        ValidatorUtils.validateEntity(user);
        userService.updateById(user);
        return RestResult.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public RestResult<String> delete(@RequestBody Integer[] ids) {
        userService.removeByIds(Arrays.asList(ids));
        return RestResult.ok();
    }

}
