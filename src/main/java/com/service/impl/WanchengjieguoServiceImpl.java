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


import com.dao.WanchengjieguoDao;
import com.entity.WanchengjieguoEntity;
import com.service.WanchengjieguoService;
import com.entity.vo.WanchengjieguoVO;
import com.entity.view.WanchengjieguoView;

@Service("wanchengjieguoService")
public class WanchengjieguoServiceImpl extends ServiceImpl<WanchengjieguoDao, WanchengjieguoEntity> implements WanchengjieguoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WanchengjieguoEntity> page = this.selectPage(
                new Query<WanchengjieguoEntity>(params).getPage(),
                new EntityWrapper<WanchengjieguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WanchengjieguoEntity> wrapper) {
		  Page<WanchengjieguoView> page =new Query<WanchengjieguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WanchengjieguoVO> selectListVO(Wrapper<WanchengjieguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WanchengjieguoVO selectVO(Wrapper<WanchengjieguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WanchengjieguoView> selectListView(Wrapper<WanchengjieguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WanchengjieguoView selectView(Wrapper<WanchengjieguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
