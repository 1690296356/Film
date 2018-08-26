package com.thomas.film.vo;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;

/**
 * @创建人 thomas_liu
 * @创建时间 2018/8/26 21:56
 * @描述 友情链接实体
 */
@Entity
@Table(name="t_link")
public class Link {
    // ===========================================================
    // Constants
    // ===========================================================


    // ===========================================================
    // Fields
    // ===========================================================
    @Id
    @GeneratedValue
    private Integer id;//编号

    @Column(length = 500)
    private String name;//名称

    @Column(length = 500)
    private String url;//地址

    @Column
    private Integer sort;//排列序号






    // ===========================================================
    // Constructors
    // ===========================================================


    // ===========================================================
    // Getter &amp; Setter
    // ===========================================================

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================


    // ===========================================================
    // Methods
    // ===========================================================

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}