package com.wang.wangpicturebackend.sevice;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wang.wangpicturebackend.model.dto.picture.PictureQueryRequest;
import com.wang.wangpicturebackend.model.dto.picture.PictureUploadRequest;
import com.wang.wangpicturebackend.model.entity.Picture;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.wangpicturebackend.model.entity.User;
import com.wang.wangpicturebackend.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
* @author le'boss
* @description 针对表【picture(图片)】的数据库操作Service
* @createDate 2025-01-22 20:07:27
*/
public interface PictureService extends IService<Picture> {
    /**
     * 上传图片
     *
     * @param multipartFile
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    PictureVO uploadPicture(MultipartFile multipartFile,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);


    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);

    PictureVO getPictureVO(Picture picture, HttpServletRequest request);

    void validPicture(Picture picture);
}
