package com.entity.view;

import com.entity.DiscussrenwuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 任务信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-07 09:47:18
 */
@TableName("discussrenwuxinxi")
public class DiscussrenwuxinxiView  extends DiscussrenwuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussrenwuxinxiView(){
	}
 
 	public DiscussrenwuxinxiView(DiscussrenwuxinxiEntity discussrenwuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussrenwuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
