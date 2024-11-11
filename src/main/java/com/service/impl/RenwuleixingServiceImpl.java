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


import com.dao.RenwuleixingDao;
import com.entity.RenwuleixingEntity;
import com.service.RenwuleixingService;
import com.entity.vo.RenwuleixingVO;
import com.entity.view.RenwuleixingView;

@Service("renwuleixingService")
public class RenwuleixingServiceImpl extends ServiceImpl<RenwuleixingDao, RenwuleixingEntity> implements RenwuleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenwuleixingEntity> page = this.selectPage(
                new Query<RenwuleixingEntity>(params).getPage(),
                new EntityWrapper<RenwuleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenwuleixingEntity> wrapper) {
		  Page<RenwuleixingView> page =new Query<RenwuleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenwuleixingVO> selectListVO(Wrapper<RenwuleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenwuleixingVO selectVO(Wrapper<RenwuleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenwuleixingView> selectListView(Wrapper<RenwuleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenwuleixingView selectView(Wrapper<RenwuleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
