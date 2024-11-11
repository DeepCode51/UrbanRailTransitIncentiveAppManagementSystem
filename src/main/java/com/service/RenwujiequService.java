package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenwujiequEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenwujiequVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenwujiequView;


/**
 * 任务接取
 *
 * @author 
 * @email 
 * @date 2022-04-07 09:47:18
 */
public interface RenwujiequService extends IService<RenwujiequEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenwujiequVO> selectListVO(Wrapper<RenwujiequEntity> wrapper);
   	
   	RenwujiequVO selectVO(@Param("ew") Wrapper<RenwujiequEntity> wrapper);
   	
   	List<RenwujiequView> selectListView(Wrapper<RenwujiequEntity> wrapper);
   	
   	RenwujiequView selectView(@Param("ew") Wrapper<RenwujiequEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenwujiequEntity> wrapper);
   	

}

