package com.thomas.film.vo;

import javax.persistence.*;

/**
 * @创建人 thomas_liu
 * @创建时间 2018/8/26 22:23
 * @描述 电影网站实体类
 */
@Entity
@Table(name = "t_website")
public class WebSite {
    // ===========================================================
    // Constants
    // ===========================================================


    // ===========================================================
    // Fields
    // ===========================================================
    @Id
    @GeneratedValue
    private Integer id;//编号

    @Column(length=300)
    private String url;//网站地址

    @Column(length=100)
    private String name;//网站名称

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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