package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.RenwujiequDao;
import com.entity.RenwujiequEntity;
import com.service.RenwujiequService;
import com.entity.vo.RenwujiequVO;
import com.entity.view.RenwujiequView;

@Service("renwujiequService")
public class RenwujiequServiceImpl extends ServiceImpl<RenwujiequDao, RenwujiequEntity> implements RenwujiequService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenwujiequEntity> page = this.selectPage(
                new Query<RenwujiequEntity>(params).getPage(),
                new EntityWrapper<RenwujiequEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenwujiequEntity> wrapper) {
		  Page<RenwujiequView> page =new Query<RenwujiequView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenwujiequVO> selectListVO(Wrapper<RenwujiequEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenwujiequVO selectVO(Wrapper<RenwujiequEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenwujiequView> selectListView(Wrapper<RenwujiequEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenwujiequView selectView(Wrapper<RenwujiequEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
