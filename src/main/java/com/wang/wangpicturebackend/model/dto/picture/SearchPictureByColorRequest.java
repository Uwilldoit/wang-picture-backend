package com.wang.wangpicturebackend.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

/**
 * creator: Shajia Wang
 * createTime:2025/1/26---15:57
 * description:
 */
@Data
public class SearchPictureByColorRequest implements Serializable {

    /**
     * 图片主色调
     */
    private String picColor;

    /**
     * 空间 id
     */
    private Long spaceId;

    private static final long serialVersionUID = 1L;
}

