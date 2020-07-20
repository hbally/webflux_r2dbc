package com.j2boot.webflux_r2dbc.dao.repository.ad;

import com.j2boot.webflux_r2dbc.dao.bean.ad.AdBean;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * @Author:yichengxian
 * @Date:2020/7/20
 * @desc:
 */
public interface AdRepository extends ReactiveCrudRepository<AdBean,Integer> {


}
