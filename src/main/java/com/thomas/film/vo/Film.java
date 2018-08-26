package com.thomas.film.vo;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

/**
 * @创建人 thomas_liu
 * @创建时间 2018/8/26 21:44
 * @描述 电影实体
 */
@Entity
@Table(name = "t_film")
public class Film {
    // ===========================================================
    // Constants
    // ===========================================================


    // ===========================================================
    // Fields
    // ===========================================================
    @Id
    @GeneratedValue
    private Integer id;//编号

    @NotEmpty(message = "请输入您要搜索的电影！")
    @Column(length = 200)
    private String name;//电影名称

    @Column(length = 500)
    private String title;//帖子名称

    @Lob
    @Column(columnDefinition ="TEXT")
    private String content;//帖子内容

    @Column(length = 300)
    private String imageName;//电影图片

    private Integer hot;//是否热门电影 1热门 0非热门

    private Date publishDate;//发布日期


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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Integer getHot() {
        return hot;
    }

    public void setHot(Integer hot) {
        this.hot = hot;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
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