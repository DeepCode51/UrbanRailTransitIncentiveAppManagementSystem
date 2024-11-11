package com.dao;

import com.entity.DiscussrenwuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussrenwuxinxiVO;
import com.entity.view.DiscussrenwuxinxiView;


/**
 * 任务信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-07 09:47:18
 */
public interface DiscussrenwuxinxiDao extends BaseMapper<DiscussrenwuxinxiEntity> {
	
	List<DiscussrenwuxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussrenwuxinxiEntity> wrapper);
	
	DiscussrenwuxinxiVO selectVO(@Param("ew") Wrapper<DiscussrenwuxinxiEntity> wrapper);
	
	List<DiscussrenwuxinxiView> selectListView(@Param("ew") Wrapper<DiscussrenwuxinxiEntity> wrapper);

	List<DiscussrenwuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussrenwuxinxiEntity> wrapper);
	
	DiscussrenwuxinxiView selectView(@Param("ew") Wrapper<DiscussrenwuxinxiEntity> wrapper);
	

}
