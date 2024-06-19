package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstushuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstushuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstushuxinxiView;


/**
 * 图书信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-20 13:31:53
 */
public interface DiscusstushuxinxiService extends IService<DiscusstushuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstushuxinxiVO> selectListVO(Wrapper<DiscusstushuxinxiEntity> wrapper);
   	
   	DiscusstushuxinxiVO selectVO(@Param("ew") Wrapper<DiscusstushuxinxiEntity> wrapper);
   	
   	List<DiscusstushuxinxiView> selectListView(Wrapper<DiscusstushuxinxiEntity> wrapper);
   	
   	DiscusstushuxinxiView selectView(@Param("ew") Wrapper<DiscusstushuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstushuxinxiEntity> wrapper);
   	
}

