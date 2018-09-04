package com.thomas.film.controller.admin;

import com.thomas.film.util.DateUtil;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @创建人 thomas_liu
 * @创建时间 2018/9/3 23:12
 * @描述 TODO
 */
@RestController
@RequestMapping("/admin/film")
public class FilmAdminController {
    // ===========================================================
    // Constants
    // ===========================================================


    // ===========================================================
    // Fields
    // ===========================================================
    @Value("${imageFilePath}")
    private String imageFilePath;
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
    @RequestMapping("/ckeditor/upload")
    public String ckeditorUpload(@RequestParam("upload")MultipartFile file, String CKEditorFuncNum) throws Exception {
        String fileName = file.getOriginalFilename();//获取文件名称
        String suffixName = fileName.substring(fileName.lastIndexOf("."));//获取文件的后缀
        String newFileName = DateUtil.getCurrentDateStr()+suffixName;
        FileUtils.copyInputStreamToFile(file.getInputStream(),new File(imageFilePath+newFileName));

        StringBuffer sb=new StringBuffer();
        sb.append("<script type=\"text/javascript\">");
        sb.append("window.parent.CKEDITOR.tools.callFunction("+ CKEditorFuncNum + ",'" +"/static/filmImage/"+ newFileName + "','')");
        sb.append("</script>");

        return sb.toString();
    }
    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}