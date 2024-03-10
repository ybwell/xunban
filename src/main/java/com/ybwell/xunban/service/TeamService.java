package com.ybwell.xunban.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybwell.xunban.model.domain.Team;
import com.ybwell.xunban.model.domain.User;
import com.ybwell.xunban.model.dto.TeamQuery;
import com.ybwell.xunban.model.vo.TeamUserVO;
import com.ybwell.xunban.model.request.TeamJoinRequest;
import com.ybwell.xunban.model.request.TeamQuitRequest;
import com.ybwell.xunban.model.request.TeamUpdateRequest;

import java.util.List;

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

    /**
     * 查询队伍列表
     * @param teamQuery
     * @param isAdmin
     * @return
     */
    List<TeamUserVO> listTeams(TeamQuery teamQuery, boolean isAdmin);

    /**
     * 更新队伍信息
     * @param teamUpdateRequest
     * @param loginUser
     * @return
     */
    boolean updateTeam(TeamUpdateRequest teamUpdateRequest, User loginUser);

    /**
     * 加入队伍
     * @param teamJoinRequest
     * @param loginUser
     * @return
     */
    boolean joinTeam(TeamJoinRequest teamJoinRequest, User loginUser);

    /**
     * 删除队伍
     * @param id
     * @param loginUser
     * @return
     */
    boolean deleteTeam(long id, User loginUser);

    /**
     * 离开队伍
     * @param teamQuitRequest
     * @param loginUser
     * @return
     */
    boolean quitTeam(TeamQuitRequest teamQuitRequest, User loginUser);
}
