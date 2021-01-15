package com.zga.framework.domain.res;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhangguangan on 2021/1/15
 * description:
 */
public class Page<T extends Serializable> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码
     */
    private int page;

    /**
     * 页大小
     */
    private int pageSize;

    /**
     * 总页数
     */
    private int pages;

    /**
     * 总记录数
     */
    private long total;

    /**
     * 页内容
     */
    private List<T> rows;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
