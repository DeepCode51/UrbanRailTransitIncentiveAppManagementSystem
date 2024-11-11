package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenwuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenwuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenwuxinxiView;


/**
 * 任务信息
 *
 * @author 
 * @email 
 * @date 2022-04-07 09:47:18
 */
public interface RenwuxinxiService extends IService<RenwuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenwuxinxiVO> selectListVO(Wrapper<RenwuxinxiEntity> wrapper);
   	
   	RenwuxinxiVO selectVO(@Param("ew") Wrapper<RenwuxinxiEntity> wrapper);
   	
   	List<RenwuxinxiView> selectListView(Wrapper<RenwuxinxiEntity> wrapper);
   	
   	RenwuxinxiView selectView(@Param("ew") Wrapper<RenwuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenwuxinxiEntity> wrapper);
   	

}

