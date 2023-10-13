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
}
