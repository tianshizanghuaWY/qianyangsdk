package com.qianyang.base.dao.api;

import com.qianyang.base.dao.entity.BaseEntity;

import java.util.List;
import java.util.Map;

/**
 * <br>
 *
 * @author 千阳
 * @date 2018-11-17
 */
public abstract interface BaseDAO<T extends BaseEntity>{
    abstract T findById(Long paramLong);

    abstract Long insert(T paramT);

    abstract boolean update(T paramT);

    abstract boolean deleteById(Long paramLong);

    abstract List<T> findByIds(List<Long> paramList);

    abstract Map<Long, T> findByIdsToMap(List<Long> paramList);

    abstract Integer insertList(List<T> paramList);

    abstract Integer updateList(List<T> paramList);

    abstract Integer deleteByIds(List<Long> paramList);

    abstract boolean existsById(Long paramLong);
}
