package com.ybwell.xunban.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybwell.xunban.model.domain.User;

import java.util.List;

/**
 * 用户服务实现
*/
public interface UserService extends IService<User> {
    /**
     * 用户脱敏
     *
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

    /**
     * 根据标签搜索用户
     *
     * @param tagNameList
     * @return
     */
    List<User> searchUsersByTags(List<String> tagNameList);
}
