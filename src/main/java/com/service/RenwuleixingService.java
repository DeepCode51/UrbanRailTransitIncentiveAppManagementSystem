package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenwuleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenwuleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenwuleixingView;


/**
 * 任务类型
 *
 * @author 
 * @email 
 * @date 2022-04-07 09:47:18
 */
public interface RenwuleixingService extends IService<RenwuleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenwuleixingVO> selectListVO(Wrapper<RenwuleixingEntity> wrapper);
   	
   	RenwuleixingVO selectVO(@Param("ew") Wrapper<RenwuleixingEntity> wrapper);
   	
   	List<RenwuleixingView> selectListView(Wrapper<RenwuleixingEntity> wrapper);
   	
   	RenwuleixingView selectView(@Param("ew") Wrapper<RenwuleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenwuleixingEntity> wrapper);
   	

}

