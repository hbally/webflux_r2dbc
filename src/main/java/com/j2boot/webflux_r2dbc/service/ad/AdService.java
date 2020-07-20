package com.j2boot.webflux_r2dbc.service.ad;

import com.j2boot.webflux_r2dbc.vo.ad.AdVo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @Author:yichengxian
 * @Date:2020/7/20
 * @desc:
 */
public interface AdService {

    /**
     * 查询现在的的广告
     * @return
     */
    Flux<AdVo> findAll();
}
