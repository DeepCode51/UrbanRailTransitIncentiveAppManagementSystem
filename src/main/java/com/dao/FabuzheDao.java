package com.dao;

import com.entity.FabuzheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FabuzheVO;
import com.entity.view.FabuzheView;


/**
 * 发布者
 * 
 * @author 
 * @email 
 * @date 2022-04-07 09:47:18
 */
public interface FabuzheDao extends BaseMapper<FabuzheEntity> {
	
	List<FabuzheVO> selectListVO(@Param("ew") Wrapper<FabuzheEntity> wrapper);
	
	FabuzheVO selectVO(@Param("ew") Wrapper<FabuzheEntity> wrapper);
	
	List<FabuzheView> selectListView(@Param("ew") Wrapper<FabuzheEntity> wrapper);

	List<FabuzheView> selectListView(Pagination page,@Param("ew") Wrapper<FabuzheEntity> wrapper);
	
	FabuzheView selectView(@Param("ew") Wrapper<FabuzheEntity> wrapper);
	

}
