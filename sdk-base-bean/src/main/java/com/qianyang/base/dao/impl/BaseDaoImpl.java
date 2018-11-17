package com.qianyang.base.dao.impl;

import com.qianyang.base.dao.api.BaseDAO;
import com.qianyang.base.dao.entity.BaseEntity;
import com.qianyang.base.dao.mapper.BaseMapper;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 千阳
 * @date 2018-11-17
 */
public abstract class BaseDaoImpl<M extends BaseMapper<T>, T extends BaseEntity>
        implements BaseDAO<T> {
    protected M entityMapper;

    public abstract void setEntityMapper(M paramM);

    @Override
    public T findById(Long id) {
        return this.entityMapper.findById(id);
    }

    @Override
    public Long insert(T t) {
        this.entityMapper.insert(t);
        return t.getId();
    }

    @Override
    public boolean update(T t) {
        return this.entityMapper.update(t).longValue() == 1L;
    }

    @Override
    public boolean deleteById(Long id){
        return this.entityMapper.deleteById(id).longValue() == 1L;
    }

    @Override
    public List<T> findByIds(List<Long> ids){
        return this.entityMapper.findByIds(ids);
    }

    @Override
    public Map<Long, T> findByIdsToMap(List<Long> ids){
        List<T> list = findByIds(ids);
        LinkedHashMap<Long, T> linkedMap = new LinkedHashMap();
        if (!list.isEmpty()) {
            for (T t : list) {
                linkedMap.put(t.getId(), t);
            }
        }
        return linkedMap;
    }

    @Override
    public Integer insertList(List<T> list){
        return this.entityMapper.insertList(list);
    }

    @Override
    public Integer updateList(List<T> list)
    {
        return this.entityMapper.updateList(list);
    }

    @Override
    public Integer deleteByIds(List<Long> ids)
    {
        return this.entityMapper.deleteByIds(ids);
    }

    @Override
    public boolean existsById(Long id) {
        Integer exists = this.entityMapper.existsById(id);
        return (exists != null) && (exists.intValue() != 0);
    }
}
