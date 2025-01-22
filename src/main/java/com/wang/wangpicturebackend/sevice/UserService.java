package com.wang.wangpicturebackend.sevice;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wang.wangpicturebackend.model.dto.user.UserQueryRequest;
import com.wang.wangpicturebackend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.wangpicturebackend.model.vo.LoginUserVO;
import com.wang.wangpicturebackend.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author le'boss
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-01-21 16:05:42
*/
public interface UserService extends IService<User> {
    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获取当前登录用户
     *
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);


    String getEncryptPassword(String userPassword);

    LoginUserVO getLoginUserVO(User user);

    UserVO getUserVO(User user);

    List<UserVO> getUserVOList(List<User> userList);

    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);

    boolean isAdmin(User user);
}
