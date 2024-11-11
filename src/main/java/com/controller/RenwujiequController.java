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

import com.entity.RenwujiequEntity;
import com.entity.view.RenwujiequView;

import com.service.RenwujiequService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 任务接取
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-07 09:47:18
 */
@RestController
@RequestMapping("/renwujiequ")
public class RenwujiequController {
    @Autowired
    private RenwujiequService renwujiequService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,RenwujiequEntity renwujiequ, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fabuzhe")) {
			renwujiequ.setFabuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			renwujiequ.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<RenwujiequEntity> ew = new EntityWrapper<RenwujiequEntity>();
		PageUtils page = renwujiequService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, renwujiequ), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,RenwujiequEntity renwujiequ, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fabuzhe")) {
			renwujiequ.setFabuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			renwujiequ.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<RenwujiequEntity> ew = new EntityWrapper<RenwujiequEntity>();
		PageUtils page = renwujiequService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, renwujiequ), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( RenwujiequEntity renwujiequ){
       	EntityWrapper<RenwujiequEntity> ew = new EntityWrapper<RenwujiequEntity>();
      	ew.allEq(MPUtil.allEQMapPre( renwujiequ, "renwujiequ")); 
        return R.ok().put("data", renwujiequService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(RenwujiequEntity renwujiequ){
        EntityWrapper< RenwujiequEntity> ew = new EntityWrapper< RenwujiequEntity>();
 		ew.allEq(MPUtil.allEQMapPre( renwujiequ, "renwujiequ")); 
		RenwujiequView renwujiequView =  renwujiequService.selectView(ew);
		return R.ok("查询任务接取成功").put("data", renwujiequView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        RenwujiequEntity renwujiequ = renwujiequService.selectById(id);
        return R.ok().put("data", renwujiequ);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        RenwujiequEntity renwujiequ = renwujiequService.selectById(id);
        return R.ok().put("data", renwujiequ);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RenwujiequEntity renwujiequ, HttpServletRequest request){
    	renwujiequ.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(renwujiequ);

        renwujiequService.insert(renwujiequ);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody RenwujiequEntity renwujiequ, HttpServletRequest request){
    	renwujiequ.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(renwujiequ);
    	renwujiequ.setUserid((Long)request.getSession().getAttribute("userId"));

        renwujiequService.insert(renwujiequ);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody RenwujiequEntity renwujiequ, HttpServletRequest request){
        //ValidatorUtils.validateEntity(renwujiequ);
        renwujiequService.updateById(renwujiequ);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        renwujiequService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<RenwujiequEntity> wrapper = new EntityWrapper<RenwujiequEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fabuzhe")) {
			wrapper.eq("fabuzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = renwujiequService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
