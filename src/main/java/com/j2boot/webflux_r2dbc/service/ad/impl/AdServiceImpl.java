package com.j2boot.webflux_r2dbc.service.ad.impl;

import com.j2boot.webflux_r2dbc.dao.repository.ad.AdRepository;
import com.j2boot.webflux_r2dbc.service.ad.AdService;
import com.j2boot.webflux_r2dbc.vo.ad.AdVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;




/**
 * @Author:yichengxian
 * @Date:2020/7/20
 * @desc:
 */
@Service
public class AdServiceImpl implements AdService {


    @Autowired
    private AdRepository adRepository;

    /**
     * 查询现在的的广告
     *
     * @return
     */
    @Override
    public Flux<AdVo> findAll() {


        return adRepository.findAll().map(
                adBean -> AdVo.builder()
                        .name(adBean.getName()).link(adBean.getLink())
                        .url(adBean.getUrl()).content(adBean.getContent())
                        .build()
        );
    }
}
