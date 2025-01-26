package com.wang.wangpicturebackend.api.imagesearch.model;

import lombok.Data;

/**
 * creator: Shajia Wang
 * createTime:2025/1/26---15:25
 * description:
 */
@Data
public class ImageSearchResult {

    /**
     * 缩略图地址
     */
    private String thumbUrl;

    /**
     * 来源地址
     */
    private String fromUrl;
}

