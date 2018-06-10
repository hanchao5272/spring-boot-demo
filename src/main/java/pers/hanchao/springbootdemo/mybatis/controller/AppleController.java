package pers.hanchao.springbootdemo.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pers.hanchao.springbootdemo.mybatis.service.AppleServcie;

@RestController()
public class AppleController {

    @Autowired
    private AppleServcie appleServcie;

    @GetMapping("/all/{pageNum}/{pageSize}")
    public Object findAllApple(@PathVariable("pageNum") int pageNum,@PathVariable("pageSize") int pageSize){
        return appleServcie.selectAllApple(pageNum,pageSize);
    }
}
