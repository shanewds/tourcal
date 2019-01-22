package com.syiaas.service;

import com.github.pagehelper.PageInfo;
import com.syiaas.pojo.Exhibitioninfo;

public interface ExhibitioninfoService {

    Exhibitioninfo getExhibitioninfoById(Long id);
    public PageInfo findAllExhibitioninfo(int pageNum, int pageSize);
}
