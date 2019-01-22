package com.syiaas.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syiaas.dao.ExhibitioninfoMapper;
import com.syiaas.pojo.Exhibitioninfo;
import com.syiaas.service.ExhibitioninfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {


    @Autowired
    private ExhibitioninfoService exhibitioninfoService;

    @Autowired
    private ExhibitioninfoMapper exhibitioninfoMapper;


    @RequestMapping("/index")
    public Object index(){


        return  exhibitioninfoService.findAllExhibitioninfo(2,4);


    }


}
