package pers.hanchao.springbootdemo.mybatis.service;

import pers.hanchao.springbootdemo.mybatis.model.Apple;

import java.util.List;

/**
 * 服务层
 */
public interface AppleServcie {
    List<Apple> selectAllApple(int pageNum,int pageSize);
}
