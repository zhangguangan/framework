package com.zga.framework.domain.req;

import lombok.ToString;

import java.io.Serializable;


@ToString
public class PageQueryParam implements Serializable {

    private Integer start;
    private Integer length;
    private String searchText;

    public Integer getPageNum() {
        return (start==null ? 0 : start)/(length == null ? 10 : length) + 1;
    }
    public Integer getStart() {
        return start;
    }

    public void setStart(final Integer start) {
        this.start = start;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(final Integer length) {
        this.length = length;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(final String searchText) {
        this.searchText = searchText;
    }
}
