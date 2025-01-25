package com.wang.wangpicturebackend.sevice;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wang.wangpicturebackend.model.dto.space.SpaceAddRequest;
import com.wang.wangpicturebackend.model.dto.space.SpaceQueryRequest;
import com.wang.wangpicturebackend.model.entity.Picture;
import com.wang.wangpicturebackend.model.entity.Space;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.wangpicturebackend.model.entity.User;
import com.wang.wangpicturebackend.model.vo.PictureVO;
import com.wang.wangpicturebackend.model.vo.SpaceVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author le'boss
* @description 针对表【space(空间)】的数据库操作Service
* @createDate 2025-01-24 20:00:20
*/
public interface SpaceService extends IService<Space> {

    /**
     * 校验空间数据
     * @param space
     * @param add
     */
    void validSpace(Space space, boolean add);

    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);


    /**
     * 校验空间权限
     *
     * @param loginUser
     * @param space
     */
    void checkSpaceAuth(User loginUser, Space space);

    /**
     * 根据空间级别，自动填充限额
     * @param space
     */
    void fillSpaceBySpaceLevel(Space space);

    /**
     * 获取空间包装类（单条）
     *
     * @param space
     * @param request
     * @return
     */
    SpaceVO getSpaceVO(Space space, HttpServletRequest request);

    /**
     * 获取空间包装类（分页）
     *
     * @param spacePage
     * @param request
     * @return
     */
    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);

    /**
     * 获取查询对象
     *
     * @param spaceQueryRequest
     * @return
     */
    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);
}
