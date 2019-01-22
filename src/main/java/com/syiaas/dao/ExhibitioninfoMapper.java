package com.syiaas.dao;


import com.syiaas.pojo.Exhibitioninfo;

import java.util.List;

public interface ExhibitioninfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Exhibitioninfo record);

    int insertSelective(Exhibitioninfo record);

    Exhibitioninfo selectByPrimaryKey(Long id);

    List<Exhibitioninfo> getAllExhibitioninfo();

    int updateByPrimaryKeySelective(Exhibitioninfo record);

    int updateByPrimaryKey(Exhibitioninfo record);
}