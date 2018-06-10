package pers.hanchao.springbootdemo.mybatis.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.hanchao.springbootdemo.mybatis.mapper.AppleMapper;
import pers.hanchao.springbootdemo.mybatis.model.Apple;
import pers.hanchao.springbootdemo.mybatis.service.AppleServcie;

import java.util.List;

@Service
public class AppleServiceImpl implements AppleServcie {

    @Autowired
    private AppleMapper appleMapper;

    @Override
    public List<Apple> selectAllApple(int pageNum, int pageSize) {
        //设置分页参数
        PageHelper.startPage(pageNum,pageSize);
        return appleMapper.selectAllApple();
    }
}
