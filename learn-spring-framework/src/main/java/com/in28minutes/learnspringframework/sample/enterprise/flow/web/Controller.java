package com.in28minutes.learnspringframework.sample.enterprise.flow.web;

import com.in28minutes.learnspringframework.sample.enterprise.flow.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//올바른 형식으로 응답 보내기
@RestController

public class Controller {
    @Autowired
 private BusinessService businessService;//
        //"/sum" => 100
    @GetMapping("/sum")
    public long displaySum() {
        return businessService.calculateSum();
    }

}
//비즈니스 로직



//데이터 가져오기
