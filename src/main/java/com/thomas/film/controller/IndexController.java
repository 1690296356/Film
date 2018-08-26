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
    public static Logger LOG = LoggerFactory.getLogger(IndexController.class);

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
     * @return
     */
    @RequestMapping("/")
    public ModelAndView root(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("title","首页");
        mav.setViewName("index");
        return mav;
    }


    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}