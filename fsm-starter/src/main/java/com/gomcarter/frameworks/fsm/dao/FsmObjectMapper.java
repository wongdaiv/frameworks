package com.gomcarter.frameworks.fsm.dao;

import com.gomcarter.frameworks.fsm.entity.FsmObject;
import com.gomcarter.frameworks.mybatis.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;

/**
 * @author 李银
 */
public interface FsmObjectMapper<T extends FsmObject> extends BaseMapper<T> {

    void $fsmUpdateState(@Param(value = "id") Serializable id, @Param(value = "state") Serializable state);
}
