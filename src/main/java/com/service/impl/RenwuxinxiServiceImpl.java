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


import com.dao.RenwuxinxiDao;
import com.entity.RenwuxinxiEntity;
import com.service.RenwuxinxiService;
import com.entity.vo.RenwuxinxiVO;
import com.entity.view.RenwuxinxiView;

@Service("renwuxinxiService")
public class RenwuxinxiServiceImpl extends ServiceImpl<RenwuxinxiDao, RenwuxinxiEntity> implements RenwuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenwuxinxiEntity> page = this.selectPage(
                new Query<RenwuxinxiEntity>(params).getPage(),
                new EntityWrapper<RenwuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenwuxinxiEntity> wrapper) {
		  Page<RenwuxinxiView> page =new Query<RenwuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenwuxinxiVO> selectListVO(Wrapper<RenwuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenwuxinxiVO selectVO(Wrapper<RenwuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenwuxinxiView> selectListView(Wrapper<RenwuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenwuxinxiView selectView(Wrapper<RenwuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
