package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussrenwuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussrenwuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussrenwuxinxiView;


/**
 * 任务信息评论表
 *
 * @author 
 * @email 
 * @date 2022-04-07 09:47:18
 */
public interface DiscussrenwuxinxiService extends IService<DiscussrenwuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussrenwuxinxiVO> selectListVO(Wrapper<DiscussrenwuxinxiEntity> wrapper);
   	
   	DiscussrenwuxinxiVO selectVO(@Param("ew") Wrapper<DiscussrenwuxinxiEntity> wrapper);
   	
   	List<DiscussrenwuxinxiView> selectListView(Wrapper<DiscussrenwuxinxiEntity> wrapper);
   	
   	DiscussrenwuxinxiView selectView(@Param("ew") Wrapper<DiscussrenwuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussrenwuxinxiEntity> wrapper);
   	

}

