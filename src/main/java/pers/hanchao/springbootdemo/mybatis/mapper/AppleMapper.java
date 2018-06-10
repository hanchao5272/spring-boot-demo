package pers.hanchao.springbootdemo.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import pers.hanchao.springbootdemo.mybatis.model.Apple;

import java.util.List;

/**
 * 苹果映射类
 */
public interface AppleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Apple record);

    int insertSelective(Apple record);

    Apple selectByPrimaryKey(Integer id);

    List<Apple> selectAllApple();

    int updateByPrimaryKeySelective(Apple record);

    int updateByPrimaryKey(Apple record);
}