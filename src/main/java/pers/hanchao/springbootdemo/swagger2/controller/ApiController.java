package pers.hanchao.springbootdemo.swagger2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import pers.hanchao.springbootdemo.mybatis.model.Apple;

@Api("测试Controller")
@RestController
public class ApiController {

    @ApiOperation(value = "打招呼")
    @ApiImplicitParam(name = "name",value = "姓名",required = true)
    @GetMapping("/hey/{name}")
    public String hey(@PathVariable("name") String name){
        return "hey, " + name;
    }

    @ApiOperation(value = "添加一个苹果")
    @PostMapping("/hey")
    public String postHey(@RequestBody Apple apple){
        return "success";
    }

}
