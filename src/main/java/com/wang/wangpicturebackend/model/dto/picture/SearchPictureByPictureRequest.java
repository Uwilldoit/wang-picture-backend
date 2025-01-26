package com.wang.wangpicturebackend.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

/**
 * creator: Shajia Wang
 * createTime:2025/1/26---15:37
 * description:
 */
@Data
public class SearchPictureByPictureRequest implements Serializable {

    /**
     * 图片 id
     */
    private Long pictureId;

    private static final long serialVersionUID = 1L;
}

