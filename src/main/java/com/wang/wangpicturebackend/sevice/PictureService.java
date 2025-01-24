package com.wang.wangpicturebackend.sevice;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wang.wangpicturebackend.model.dto.picture.PictureQueryRequest;
import com.wang.wangpicturebackend.model.dto.picture.PictureReviewRequest;
import com.wang.wangpicturebackend.model.dto.picture.PictureUploadByBatchRequest;
import com.wang.wangpicturebackend.model.dto.picture.PictureUploadRequest;
import com.wang.wangpicturebackend.model.entity.Picture;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.wangpicturebackend.model.entity.User;
import com.wang.wangpicturebackend.model.vo.PictureVO;
import org.springframework.scheduling.annotation.Async;
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
     * @param inputSource
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    PictureVO uploadPicture(Object inputSource,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);


    @Async
    void clearPictureFile(Picture oldPicture);

    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);

    PictureVO getPictureVO(Picture picture, HttpServletRequest request);

    void validPicture(Picture picture);
    /**
     * 图片审核
     *
     * @param pictureReviewRequest
     * @param loginUser
     */
    void doPictureReview(PictureReviewRequest pictureReviewRequest, User loginUser);

    /**
     * 自动填充审核状态
     * @param picture
     * @param loginUser
     */
    void fillReviewParams(Picture picture, User loginUser);
    /**
     * 批量抓取和创建图片
     *
     * @param pictureUploadByBatchRequest
     * @param loginUser
     * @return 成功创建的图片数
     */
    Integer uploadPictureByBatch(
            PictureUploadByBatchRequest pictureUploadByBatchRequest,
            User loginUser
    );

}
