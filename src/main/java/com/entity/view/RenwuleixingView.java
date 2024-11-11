package com.entity.view;

import com.entity.RenwuleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 任务类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-07 09:47:18
 */
@TableName("renwuleixing")
public class RenwuleixingView  extends RenwuleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RenwuleixingView(){
	}
 
 	public RenwuleixingView(RenwuleixingEntity renwuleixingEntity){
 	try {
			BeanUtils.copyProperties(this, renwuleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
