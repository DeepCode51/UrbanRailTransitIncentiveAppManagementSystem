package com.dao;

import com.entity.RenwujiequEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenwujiequVO;
import com.entity.view.RenwujiequView;


/**
 * 任务接取
 * 
 * @author 
 * @email 
 * @date 2022-04-07 09:47:18
 */
public interface RenwujiequDao extends BaseMapper<RenwujiequEntity> {
	
	List<RenwujiequVO> selectListVO(@Param("ew") Wrapper<RenwujiequEntity> wrapper);
	
	RenwujiequVO selectVO(@Param("ew") Wrapper<RenwujiequEntity> wrapper);
	
	List<RenwujiequView> selectListView(@Param("ew") Wrapper<RenwujiequEntity> wrapper);

	List<RenwujiequView> selectListView(Pagination page,@Param("ew") Wrapper<RenwujiequEntity> wrapper);
	
	RenwujiequView selectView(@Param("ew") Wrapper<RenwujiequEntity> wrapper);
	

}
