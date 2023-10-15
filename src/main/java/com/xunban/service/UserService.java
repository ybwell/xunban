package com.xunban.service;

import com.xunban.pojo.entity.User;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

/**
 * 用户服务
 */
public interface UserService {

    /**
     * 用户脱敏
     * @param originUser
     * @return
     */
     User getSafetyUser(User originUser);

    /**
     * 用户注册
     * @param userAccount
     * @param userPassword
     * @param checkPassword
     * @return
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     * @param userAccount
     * @param userPassword
     * @param request
     * @return
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户注销
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);

    /**
     * 根据标签搜索用户（MySQL查询）
     * @param tagNameList
     * @return
     */
     List<User> searchUsersByTagsBySQL(List<String> tagNameList);

    /**
     * 根据标签搜索用户（内存查询）
     * @param tagNameList
     * @return
     */
     List<User> searchUsersByTags(List<String> tagNameList);

    /**
     * 获取当前用户信息
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 更新用户信息
     * @param user
     * @param loginUser
     * @return
     */
    int updateUser(User user, User loginUser);

    /**
     * 是否为管理员
     * @param loginUser
     * @return
     */
    public boolean isAdmin(User loginUser);

    /**
     * 是否为管理员
     * @param request
     * @return
     */
    public boolean isAdmin(HttpServletRequest request);
}
