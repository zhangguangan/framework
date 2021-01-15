package com.zga.framework.service.impl;

import com.zga.framework.domain.BaseDomain;
import com.zga.framework.domain.req.PageQueryParam;
import com.zga.framework.domain.res.Page;
import com.zga.framework.orm.BaseEntity;
import com.zga.framework.util.PageUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by zhangguangan on 2020/6/17
 * description:
 */
@Log4j2
public class BaseService<T extends BaseEntity, R extends BaseDomain> {
    Class<R> voType;
    Class<T> entityType;

    protected <P extends PageQueryParam> Page<R> queryPageByFunction(P p, final Function<P, List<T>> queryListFunc) {
        return PageUtil.query(p, queryListFunc, this::entity2Vo);
    }

    public List<R> entityList2VoList(List<T> t) {
        if (CollectionUtils.isEmpty(t)) {
            return new ArrayList<>();
        }
        List<R> domainList = t.stream().map(this::entity2Vo).collect(Collectors.toList());
        return domainList;
    }

    public List<T> voList2EntityList(List<R> r) {
        if (CollectionUtils.isEmpty(r)) {
            return new ArrayList<>();
        }
        List<T> domainList = r.stream().map(this::vo2Entity).collect(Collectors.toList());
        return domainList;
    }

    public R entity2Vo(T t) {
        try {
            if (t == null) {
                return null;
            }
            if (voType == null) {
                ParameterizedType superClass = (ParameterizedType) getClass().getGenericSuperclass();
                voType = (Class<R>) superClass.getActualTypeArguments()[1];
            }
            R r = voType.newInstance();
            BeanUtils.copyProperties(t, r);
            return r;
        } catch (Exception e) {
            log.error("entity2Vo类型转换遇到异常，异常信息：", e);
        }
        return null;
    }

    protected T vo2Entity(R r) {
        try {
            if (r == null) {
                return null;
            }

            ParameterizedType superClass = (ParameterizedType) getClass().getGenericSuperclass();
            entityType = (Class<T>) superClass.getActualTypeArguments()[0];

            T t = entityType.newInstance();
            BeanUtils.copyProperties(r, t);
            return t;
        } catch (Exception e) {
            log.error("vo2Entity类型转换遇到异常，异常信息：", e);
        }
        return null;
    }

}
