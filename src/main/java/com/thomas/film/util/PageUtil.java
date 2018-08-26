package com.thomas.film.util;

/**
 * @创建人 thomas_liu
 * @创建时间 2018/8/27 1:09
 * @描述 分页工具类
 */
@SuppressWarnings("unused")
public class PageUtil {
    // ===========================================================
    // Constants
    // ===========================================================


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
     * 生成分页代码
     * @param targetUrl 目标地址
     * @param totalNum 总记录数
     * @param currentPage 当前页
     * @param pageSize 每页大小
     * @return  分页拼接字符串
     */
    public static String genPagination(String targetUrl,long totalNum,int currentPage,int pageSize){
        long totalPage=totalNum%pageSize==0?totalNum/pageSize:totalNum/pageSize+1;
        if(totalPage==0){
            return "未查询到数据";
        }else{
            StringBuilder pageCode=new StringBuilder();
            pageCode.append("<li><a href='").append(targetUrl).append("/1'>首页</a></li>");
            if(currentPage>1){
                pageCode.append("<li><a href='").append(targetUrl).append("/").append(currentPage - 1).append("'>上一页</a></li>");
            }else{
                pageCode.append("<li class='disabled'><a href='#'>上一页</a></li>");
            }
            for(int i=currentPage-2;i<=currentPage+2;i++){
                if(i<1||i>totalPage){
                    continue;
                }
                if(i==currentPage){
                    pageCode.append("<li class='active'><a href='").append(targetUrl).append("/").append(i).append("'>").append(i).append("</a></li>");
                }else{
                    pageCode.append("<li><a href='").append(targetUrl).append("/").append(i).append("'>").append(i).append("</a></li>");
                }
            }
            if(currentPage<totalPage){
                pageCode.append("<li><a href='").append(targetUrl).append("/").append(currentPage + 1).append("'>下一页</a></li>");
            }else{
                pageCode.append("<li class='disabled'><a href='#'>下一页</a></li>");
            }
            pageCode.append("<li><a href='").append(targetUrl).append("/").append(totalPage).append("'>尾页</a></li>");
            return pageCode.toString();
        }
    }

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}