package com.wang.wangpicturebackend.model.dto.space;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * creator: Shajia Wang
 * createTime:2025/1/22---22:37
 * description:
 */
@Data
public class SpaceEditRequest implements Serializable {

    /**
     * 空间 id
     */
    private Long id;

    /**
     * 空间名称
     */
    private String spaceName;

    private static final long serialVersionUID = 1L;
}


