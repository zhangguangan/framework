package com.zga.framework.util;

import com.github.pagehelper.PageHelper;
import com.zga.framework.domain.req.PageQueryParam;
import com.zga.framework.domain.res.Page;

import java.io.Serializable;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PageUtil {

    public static <T, R extends Serializable, P extends PageQueryParam> Page<R> query(
            final P param, final Function<P, List<T>> queryListFunc,
            final Function<T, R> convertFunc) {
        PageHelper.startPage(param.getPageNum(), param.getLength());
        List<T> list = queryListFunc.apply(param);
        Page<R> page = toPage(list);
        page.setRows(list.stream().map(convertFunc).collect(Collectors.toList()));
        return page;
    }

    public static <T extends Serializable, P extends PageQueryParam> Page<T> query(
            final P param, final Function<P, List<T>> queryListFunc) {
        PageHelper.startPage(param.getPageNum(), param.getLength());
        List<T> list = queryListFunc.apply(param);
        Page<T> page = toPage(list);
        page.setRows(list);
        return page;
    }

    private static <T, R extends Serializable> Page<R> toPage(final List<T> list) {
        Page<R> page = new Page<>();
        if (list instanceof com.github.pagehelper.Page) {
            com.github.pagehelper.Page pageHelperPage = (com.github.pagehelper.Page) list;
            page.setPage(pageHelperPage.getPageNum());
            page.setPageSize(pageHelperPage.getPageSize());
            page.setTotal(pageHelperPage.getTotal());
            page.setPages(pageHelperPage.getPages());
        }
        return page;
    }

}
