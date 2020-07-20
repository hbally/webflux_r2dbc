package com.j2boot.webflux_r2dbc.controller.ad;

import com.j2boot.webflux_r2dbc.service.ad.AdService;
import com.j2boot.webflux_r2dbc.vo.ad.AdVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * @Author:yichengxian
 * @Date:2020/7/20
 * @desc:
 */
@RestController
@RequestMapping("/api/ad")
public class AdController {

    @Autowired
    private AdService adService;

    @GetMapping("/findAll")
    public Flux<AdVo> findNowAd() {
        return adService.findAll();
    }
}
