package com.meetcity.payment.mapper;

import com.meetcity.payment.core.model.batch.SettleMent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;



/**
 * Created by ${崔帅} on 2017/9/12.
 */
@Component
@Mapper
public interface SettleMentMapper {

    //添加数据
    void insertSettleMent(SettleMent settleMent);
}
