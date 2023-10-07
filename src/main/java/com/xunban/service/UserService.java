package com.xunban.service;

import com.xunban.pojo.entity.User;

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
     * 根据标签搜索用户
     * @param tagNameList
     * @return
     */
     List<User> searchUsersByTagsBySQL(List<String> tagNameList);
}
