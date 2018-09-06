package com.thomas.film.controller.admin;

import com.thomas.film.service.FilmService;
import com.thomas.film.util.DateUtil;
import com.thomas.film.vo.Film;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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

    @SuppressWarnings("unused")
    @Resource
    private FilmService filmService;
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
        assert fileName != null;
        String suffixName = fileName.substring(fileName.lastIndexOf("."));//获取文件的后缀
        String newFileName = DateUtil.getCurrentDateStr()+suffixName;
        FileUtils.copyInputStreamToFile(file.getInputStream(),new File(imageFilePath+newFileName));

        StringBuilder sb=new StringBuilder();
        sb.append("<script type=\"text/javascript\">");
        sb.append("window.parent.CKEDITOR.tools.callFunction(").append(CKEditorFuncNum).append(",'").append("/static/filmImage/").append(newFileName).append("','')");
        sb.append("</script>");

        return sb.toString();
    }

    /**
     * 添加或修改电影信息
     * @param film film
     * @param file imageFile
     * @return map map
     * @throws Exception exception
     */
    @RequestMapping("/save")
    public Map<String, Object> save(Film film , @RequestParam("imageFile") MultipartFile file) throws Exception{

        if(!file.isEmpty()){
            String fileName = file.getOriginalFilename();// 获取文件名
            assert fileName != null;
            String sufixName = fileName.substring(fileName.lastIndexOf("."));//获取文件的后缀
            String newFileName = DateUtil.getCurrentDateStr()+sufixName;
            FileUtils.copyInputStreamToFile(file.getInputStream(),new File(imageFilePath+newFileName));
            film.setImageName(newFileName);
        }
        film.setPublishDate(new Date());
        Map<String, Object> map = new HashMap<>();
        filmService.save(film);
        map.put("success",true);
        return map;
    }
    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}