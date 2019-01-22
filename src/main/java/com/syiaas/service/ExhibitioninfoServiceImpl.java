package com.syiaas.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syiaas.dao.ExhibitioninfoMapper;
import com.syiaas.pojo.Exhibitioninfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExhibitioninfoServiceImpl implements ExhibitioninfoService {

    @Autowired
    private ExhibitioninfoMapper exhibitioninfoMapper;

    @Override
    public Exhibitioninfo getExhibitioninfoById(Long id) {


        return  exhibitioninfoMapper.selectByPrimaryKey(id);




    }

//    实现分页查询
    @Override
    public PageInfo findAllExhibitioninfo(int pageNum, int pageSize) {

        //* pageNum 开始页数  * pageSize 每页显示的数据条数
        PageHelper.startPage(pageNum,pageSize);
        List<Exhibitioninfo> exhibitioninfoList = exhibitioninfoMapper.getAllExhibitioninfo();
        PageInfo<Exhibitioninfo> pageInfo = new PageInfo<>(exhibitioninfoList);




        return pageInfo;



    }


}
