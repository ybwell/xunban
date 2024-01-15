package com.ybwell.xunban.controller;

import com.ybwell.xunban.common.BaseResponse;
import com.ybwell.xunban.common.ErrorCode;
import com.ybwell.xunban.common.ResultUtils;
import com.ybwell.xunban.exception.BusinessException;
import com.ybwell.xunban.model.domain.Team;
import com.ybwell.xunban.model.domain.User;
import com.ybwell.xunban.request.TeamAddRequest;
import com.ybwell.xunban.service.TeamService;
import com.ybwell.xunban.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 队伍接口
 */

@RestController
@Slf4j
@RequestMapping("/team")
@CrossOrigin(origins = {"http://localhost:3000"})
public class TeamController {

    @Resource
    private UserService userService;

    @Resource
    private TeamService teamService;

    /**
     * 创建队伍
     * @param teamAddRequest
     * @param request
     * @return
     */
    @PostMapping("/add")
    public BaseResponse<Long> addTeam(@RequestBody TeamAddRequest teamAddRequest, HttpServletRequest request) {
        if (teamAddRequest == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        User loginUser = userService.getLoginUser(request);
        Team team = new Team();
        BeanUtils.copyProperties(teamAddRequest, team);
        long teamId = teamService.addTeam(team, loginUser);
        return ResultUtils.success(teamId);
    }



}
