package com.wang.wangpicturebackend.model.dto.picture;

import lombok.Data;

/**
 * creator: Shajia Wang
 * createTime:2025/1/24---00:45
 * description:
 */
@Data
public class PictureUploadByBatchRequest {

    /**
     * 搜索词
     */
    private String searchText;

    /**
     * 名称前缀
     */
    private String namePrefix;


    /**
     * 抓取数量
     */
    private Integer count = 10;
}

