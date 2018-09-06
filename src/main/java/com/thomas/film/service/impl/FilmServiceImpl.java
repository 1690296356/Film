package com.thomas.film.service.impl;

import com.thomas.film.repository.FilmRepository;
import com.thomas.film.service.FilmService;
import com.thomas.film.vo.Film;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @创建人 thomas_liu
 * @创建时间 2018/9/6 23:06
 * @描述 电影Service接口实现类
 */
@Service("filmService")
public class FilmServiceImpl implements FilmService {
    // ===========================================================
    // Constants
    // ===========================================================


    // ===========================================================
    // Fields
    // ===========================================================

    @Resource
    private FilmRepository filmRepository;

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

    @Override
    public void save(Film pFilm) {
        filmRepository.save(pFilm);
    }

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}