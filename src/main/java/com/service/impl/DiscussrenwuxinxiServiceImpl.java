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


import com.dao.DiscussrenwuxinxiDao;
import com.entity.DiscussrenwuxinxiEntity;
import com.service.DiscussrenwuxinxiService;
import com.entity.vo.DiscussrenwuxinxiVO;
import com.entity.view.DiscussrenwuxinxiView;

@Service("discussrenwuxinxiService")
public class DiscussrenwuxinxiServiceImpl extends ServiceImpl<DiscussrenwuxinxiDao, DiscussrenwuxinxiEntity> implements DiscussrenwuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussrenwuxinxiEntity> page = this.selectPage(
                new Query<DiscussrenwuxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussrenwuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussrenwuxinxiEntity> wrapper) {
		  Page<DiscussrenwuxinxiView> page =new Query<DiscussrenwuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussrenwuxinxiVO> selectListVO(Wrapper<DiscussrenwuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussrenwuxinxiVO selectVO(Wrapper<DiscussrenwuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussrenwuxinxiView> selectListView(Wrapper<DiscussrenwuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussrenwuxinxiView selectView(Wrapper<DiscussrenwuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
