package com.dengjunw.enums;

import lombok.Getter;

/**
 * Created by dengjunwu on 2018/12/13.
 */
@Getter
public enum ProductStatus {
    UP(0, "在售"),
    DOWN(1, "下架")
    ;

    private Integer status;
    private String desc;

    ProductStatus(Integer status, String desc){
        this.status = status;
        this.desc = desc;
    }
}
