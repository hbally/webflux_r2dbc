package com.j2boot.webflux_r2dbc.dao.bean.ad;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

/**
 * @Author:yichengxian
 * @Date:2020/7/20
 * @desc:
 */
@Data
@Table("litemall_ad")
public class AdBean {

    @Id
    private Integer id;

    private String name;

    private String link;

    private String url;

    private String content;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private Byte deleted;
}
