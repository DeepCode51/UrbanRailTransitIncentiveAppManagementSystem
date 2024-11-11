package com.entity.view;

import com.entity.FabuzheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 发布者
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-07 09:47:18
 */
@TableName("fabuzhe")
public class FabuzheView  extends FabuzheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FabuzheView(){
	}
 
 	public FabuzheView(FabuzheEntity fabuzheEntity){
 	try {
			BeanUtils.copyProperties(this, fabuzheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
