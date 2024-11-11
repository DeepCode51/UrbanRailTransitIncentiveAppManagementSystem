package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WanchengjieguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WanchengjieguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WanchengjieguoView;


/**
 * 完成结果
 *
 * @author 
 * @email 
 * @date 2022-04-07 09:47:18
 */
public interface WanchengjieguoService extends IService<WanchengjieguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WanchengjieguoVO> selectListVO(Wrapper<WanchengjieguoEntity> wrapper);
   	
   	WanchengjieguoVO selectVO(@Param("ew") Wrapper<WanchengjieguoEntity> wrapper);
   	
   	List<WanchengjieguoView> selectListView(Wrapper<WanchengjieguoEntity> wrapper);
   	
   	WanchengjieguoView selectView(@Param("ew") Wrapper<WanchengjieguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WanchengjieguoEntity> wrapper);
   	

}

