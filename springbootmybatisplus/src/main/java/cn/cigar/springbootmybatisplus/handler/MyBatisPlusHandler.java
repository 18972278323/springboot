package cn.cigar.springbootmybatisplus.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyBatisPlusHandler implements MetaObjectHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyBatisPlusHandler.class);

    @Override
    public void insertFill(MetaObject metaObject) {
        LOGGER.info("start insert fill ....");
        metaObject.setValue("createTime", new Date());
        metaObject.setValue("updateTime", new Date());

    }

    @Override
    public void updateFill(MetaObject metaObject) {
        metaObject.setValue("updateTime", new Date());
    }
}
