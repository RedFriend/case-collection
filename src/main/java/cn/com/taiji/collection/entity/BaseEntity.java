package cn.com.taiji.collection.entity;

import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 基础信息
 *
 * @author Ryan.Peng
 * @since 2018-8-16 17:06:48
 */
public class BaseEntity implements Serializable {

    @Transient
    protected Integer page = 1;

    @Transient
    protected Integer rows = 10;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
}
