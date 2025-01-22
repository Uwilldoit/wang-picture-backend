package com.wang.wangpicturebackend.model.dto.picture;

import lombok.Data;

import java.util.List;

/**
 * creator: Shajia Wang
 * createTime:2025/1/22---23:13
 * description:
 */
@Data
public class PictureTagCategory {
    List<String> CategoryList;

    List<String>TagList;
}
