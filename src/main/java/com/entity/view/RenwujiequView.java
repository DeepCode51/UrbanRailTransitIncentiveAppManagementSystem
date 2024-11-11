package com.entity.view;

import com.entity.RenwujiequEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 任务接取
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-07 09:47:18
 */
@TableName("renwujiequ")
public class RenwujiequView  extends RenwujiequEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RenwujiequView(){
	}
 
 	public RenwujiequView(RenwujiequEntity renwujiequEntity){
 	try {
			BeanUtils.copyProperties(this, renwujiequEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
