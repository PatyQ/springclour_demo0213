package com.cy.feign;

import com.cy.pojo.TStudent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("SPRING-PROVIDER02")
public interface FeignServer {

    @RequestMapping("provider/getStu/{id}")
    TStudent getStu(@PathVariable Integer id);

}
