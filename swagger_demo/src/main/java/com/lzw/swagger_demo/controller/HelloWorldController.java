package com.lzw.swagger_demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author LZW
 * @Description
 * @Date 2022-03-27 22:05
 * @Version 1.0
 */
@Api(tags = "Hello 控制器")
@RestController
public class HelloWorldController {

    @ApiOperation("hello 方法")
    @GetMapping("hello")
    public String hello() {
        return "Hello World";
    }


    /**
     * @param name
     * @param age
     * @return
     */
    @ApiOperation("查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "姓名", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "age", value = "年龄", required = true, paramType = "query", dataType = "Integer")
    })
    @PostMapping("query")
    public String query(String name, int age) {
        return "name = " + name + " age = " + age;
    }
}
