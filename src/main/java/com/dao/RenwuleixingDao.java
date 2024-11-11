package com.dao;

import com.entity.RenwuleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenwuleixingVO;
import com.entity.view.RenwuleixingView;


/**
 * 任务类型
 * 
 * @author 
 * @email 
 * @date 2022-04-07 09:47:18
 */
public interface RenwuleixingDao extends BaseMapper<RenwuleixingEntity> {
	
	List<RenwuleixingVO> selectListVO(@Param("ew") Wrapper<RenwuleixingEntity> wrapper);
	
	RenwuleixingVO selectVO(@Param("ew") Wrapper<RenwuleixingEntity> wrapper);
	
	List<RenwuleixingView> selectListView(@Param("ew") Wrapper<RenwuleixingEntity> wrapper);

	List<RenwuleixingView> selectListView(Pagination page,@Param("ew") Wrapper<RenwuleixingEntity> wrapper);
	
	RenwuleixingView selectView(@Param("ew") Wrapper<RenwuleixingEntity> wrapper);
	

}
