package com.ybwell.xunban.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybwell.xunban.model.domain.Team;
import com.ybwell.xunban.model.domain.User;

/**
 *  队伍服务实现
*/
public interface TeamService extends IService<Team> {

    /**
     * 创建队伍
     *
     * @param team
     * @param loginUser
     * @return
     */
    long addTeam(Team team, User loginUser);

}
