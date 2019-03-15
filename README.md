# tourcal


基本搭建 基于springboot2.1.2 + mybatis +druid +gradle 5.1.1+ pagehelper 环境的搭建数据源

开发环境 MacOS idea 2018.2.2 + jdk1.8 + springboot2.1.2.RELEASE +mybatis + gradle5.1.1

使用Mybatis-Generator自动生成Dao、Model、Mapping 

开发环境的搭建 
  ![Image text](https://github.com/shanewds/Image/blob/master/image/tourcal-1.png)
  
  ![Image text](https://github.com/shanewds/Image/blob/master/image/tourcal-2.png)
  
  ![Image text](https://github.com/shanewds/Image/blob/master/image/tourcal-3.png)
  
  ![Image text](https://github.com/shanewds/Image/blob/master/image/tourcal-4.png)
  
  ![Image text](https://github.com/shanewds/Image/blob/master/image/TfourProbe-five.png)



分页代码

 public PageInfo findAllExhibitioninfo(int pageNum, int pageSize) {
 
        //* pageNum 开始页数  * pageSize 每页显示的数据条数
        PageHelper.startPage(pageNum,pageSize);
        List<Exhibitioninfo> exhibitioninfoList = exhibitioninfoMapper.getAllExhibitioninfo();
        PageInfo<Exhibitioninfo> pageInfo = new PageInfo<>(exhibitioninfoList);
        return pageInfo;
        
 }


启动程序

 ![Image text]https://github.com/shanewds/Image/blob/master/image/tourcal-5.png)





