package com.j2boot.webflux_r2dbc.vo.ad;

import lombok.Builder;
import lombok.Data;

/**
 * @Author:yichengxian
 * @Date:2020/7/20
 * @desc:
 */
@Data
@Builder
public class AdVo {

    private String name;

    private String link;

    private String url;

    private String content;
}
