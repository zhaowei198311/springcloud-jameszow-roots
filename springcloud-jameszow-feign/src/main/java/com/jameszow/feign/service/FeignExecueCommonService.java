package com.jameszow.feign.service;

import com.jameszow.feign.serviceimpl.FeignExecueCommonErrorServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 描述:
 * Feign Service层
 * 此接口是掉用sping-cloud-common服务
 *
 * @author James Zow
 * @create 2019-01-19 18:38
 */
@FeignClient(value = "spring-cloud-common",fallbackFactory = FeignExecueCommonErrorServiceImpl.class)
public interface FeignExecueCommonService {

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam(value = "name") String name);
}
