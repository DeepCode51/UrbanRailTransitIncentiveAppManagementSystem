package com.dao;

import com.entity.WanchengjieguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WanchengjieguoVO;
import com.entity.view.WanchengjieguoView;


/**
 * 完成结果
 * 
 * @author 
 * @email 
 * @date 2022-04-07 09:47:18
 */
public interface WanchengjieguoDao extends BaseMapper<WanchengjieguoEntity> {
	
	List<WanchengjieguoVO> selectListVO(@Param("ew") Wrapper<WanchengjieguoEntity> wrapper);
	
	WanchengjieguoVO selectVO(@Param("ew") Wrapper<WanchengjieguoEntity> wrapper);
	
	List<WanchengjieguoView> selectListView(@Param("ew") Wrapper<WanchengjieguoEntity> wrapper);

	List<WanchengjieguoView> selectListView(Pagination page,@Param("ew") Wrapper<WanchengjieguoEntity> wrapper);
	
	WanchengjieguoView selectView(@Param("ew") Wrapper<WanchengjieguoEntity> wrapper);
	

}
