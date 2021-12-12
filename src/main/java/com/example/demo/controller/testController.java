package com.example.demo.controller;

import com.example.demo.dto.ResultData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class testController {

    @PostMapping("/check")
    public ResultData getMapping() {
        log.info("qqqqqqqqq");
        ResultData<Object> result = new ResultData<>();
        result.setCode(4000);
        result.setMessage("value不能为空");
        return result;

    }

}
