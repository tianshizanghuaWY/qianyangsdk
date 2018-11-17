package com.qianyang.base.dao.mapper;

import com.qianyang.base.dao.entity.BaseEntity;

import java.util.List;

/**
 * <br>
 *
 * @author 千阳
 * @date 2018-11-17
 */
public abstract interface BaseMapper<T extends BaseEntity>
{
    @Deprecated
    public static final String PO_KEY = "po";

    public abstract T findById(Long paramLong);

    public abstract Long insert(T paramT);

    public abstract Long update(T paramT);

    public abstract Long deleteById(Long paramLong);

    public abstract List<T> findByIds(List<Long> paramList);

    public abstract Integer insertList(List<T> paramList);

    public abstract Integer updateList(List<T> paramList);

    public abstract Integer deleteByIds(List<Long> paramList);

    public abstract Integer existsById(Long paramLong);
}
