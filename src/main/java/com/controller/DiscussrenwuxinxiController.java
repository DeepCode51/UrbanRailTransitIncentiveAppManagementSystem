package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscussrenwuxinxiEntity;
import com.entity.view.DiscussrenwuxinxiView;

import com.service.DiscussrenwuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 任务信息评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-07 09:47:18
 */
@RestController
@RequestMapping("/discussrenwuxinxi")
public class DiscussrenwuxinxiController {
    @Autowired
    private DiscussrenwuxinxiService discussrenwuxinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussrenwuxinxiEntity discussrenwuxinxi, 
		HttpServletRequest request){

        EntityWrapper<DiscussrenwuxinxiEntity> ew = new EntityWrapper<DiscussrenwuxinxiEntity>();
		PageUtils page = discussrenwuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussrenwuxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussrenwuxinxiEntity discussrenwuxinxi, 
		HttpServletRequest request){
        EntityWrapper<DiscussrenwuxinxiEntity> ew = new EntityWrapper<DiscussrenwuxinxiEntity>();
		PageUtils page = discussrenwuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussrenwuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussrenwuxinxiEntity discussrenwuxinxi){
       	EntityWrapper<DiscussrenwuxinxiEntity> ew = new EntityWrapper<DiscussrenwuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussrenwuxinxi, "discussrenwuxinxi")); 
        return R.ok().put("data", discussrenwuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussrenwuxinxiEntity discussrenwuxinxi){
        EntityWrapper< DiscussrenwuxinxiEntity> ew = new EntityWrapper< DiscussrenwuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussrenwuxinxi, "discussrenwuxinxi")); 
		DiscussrenwuxinxiView discussrenwuxinxiView =  discussrenwuxinxiService.selectView(ew);
		return R.ok("查询任务信息评论表成功").put("data", discussrenwuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussrenwuxinxiEntity discussrenwuxinxi = discussrenwuxinxiService.selectById(id);
        return R.ok().put("data", discussrenwuxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussrenwuxinxiEntity discussrenwuxinxi = discussrenwuxinxiService.selectById(id);
        return R.ok().put("data", discussrenwuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussrenwuxinxiEntity discussrenwuxinxi, HttpServletRequest request){
    	discussrenwuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussrenwuxinxi);

        discussrenwuxinxiService.insert(discussrenwuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussrenwuxinxiEntity discussrenwuxinxi, HttpServletRequest request){
    	discussrenwuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussrenwuxinxi);

        discussrenwuxinxiService.insert(discussrenwuxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscussrenwuxinxiEntity discussrenwuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussrenwuxinxi);
        discussrenwuxinxiService.updateById(discussrenwuxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussrenwuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscussrenwuxinxiEntity> wrapper = new EntityWrapper<DiscussrenwuxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discussrenwuxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
