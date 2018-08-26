package com.thomas.film.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @创建人 thomas_liu
 * @创建时间 2018/8/27 0:57
 * @描述 日期工具类
 */
@SuppressWarnings("unused")
public class DateUtil {
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

    /**
     * 日期对象转字符串
     * @param date 日期
     * @param format 需要转换的格式
     * @return 日期字符串
     */
    public static String formatDate(Date date, String format){
        String result="";
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        if(date!=null){
            result=sdf.format(date);
        }
        return result;
    }

    /**
     * 字符串转日期对象
     * @param str 字符串
     * @param format 需要转换的格式
     * @return 日期对象
     * @throws Exception 异常信息
     */
    public static Date formatString(String str,String format) throws Exception{
        if(StringUtil.isEmpty(str)){
            return null;
        }
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        return sdf.parse(str);
    }

    @SuppressWarnings("RedundantThrows")
    public static String getCurrentDateStr()throws Exception{
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
        return sdf.format(date);
    }

    // ===========================================================
    // Methods
    // ===========================================================

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}