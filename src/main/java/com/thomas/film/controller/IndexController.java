package com.thomas.film.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @创建人 thomas_liu
 * @创建时间 2018/8/27 0:27
 * @描述 根路径以及其他请求处理
 */
@Controller
public class IndexController {
    // ===========================================================
    // Constants
    // ===========================================================
    private static Logger LOG = LoggerFactory.getLogger(IndexController.class);

    // ===========================================================
    // Fields
    // ===========================================================

    // ===========================================================
    // Constructors
    // ===========================================================


    // ===========================================================
    // Getter &amp; Setter
    // ===========================================================

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================


    // ===========================================================
    // Methods
    // ===========================================================
    /**
     * 网页根目录请求
     * @return mav
     */
    @RequestMapping("/")
    public ModelAndView root(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("title","首页");
        mav.setViewName("index");
        return mav;
    }

    /**
     * 登录请求
     * @return str
     */
    @RequestMapping("/login")
    public String login(){
        LOG.info( "login [{}]",true);
        return "/login";
    }

    /**
     * 进入后台管理请求
     * @return str
     */
    @RequestMapping("/admin")
    public String toAdmin(){
        return "/admin/main";
    }

    /**
     * 进入添加电影页面
     * @return str
     */
    @RequestMapping("/add/film")
    public String addFilm(){
        return "/admin/add-film";
    }

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}