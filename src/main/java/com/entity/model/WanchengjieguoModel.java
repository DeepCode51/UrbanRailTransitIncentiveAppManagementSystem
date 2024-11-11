package com.entity.model;

import com.entity.WanchengjieguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 完成结果
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-07 09:47:18
 */
public class WanchengjieguoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 任务类型
	 */
	
	private String renwuleixing;
		
	/**
	 * 所在城市
	 */
	
	private String suozaichengshi;
		
	/**
	 * 完成结果
	 */
	
	private String wanchengjieguo;
		
	/**
	 * 完成时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date wanchengshijian;
		
	/**
	 * 完成图片
	 */
	
	private String wanchengtupian;
		
	/**
	 * 发布账号
	 */
	
	private String fabuzhanghao;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：任务类型
	 */
	 
	public void setRenwuleixing(String renwuleixing) {
		this.renwuleixing = renwuleixing;
	}
	
	/**
	 * 获取：任务类型
	 */
	public String getRenwuleixing() {
		return renwuleixing;
	}
				
	
	/**
	 * 设置：所在城市
	 */
	 
	public void setSuozaichengshi(String suozaichengshi) {
		this.suozaichengshi = suozaichengshi;
	}
	
	/**
	 * 获取：所在城市
	 */
	public String getSuozaichengshi() {
		return suozaichengshi;
	}
				
	
	/**
	 * 设置：完成结果
	 */
	 
	public void setWanchengjieguo(String wanchengjieguo) {
		this.wanchengjieguo = wanchengjieguo;
	}
	
	/**
	 * 获取：完成结果
	 */
	public String getWanchengjieguo() {
		return wanchengjieguo;
	}
				
	
	/**
	 * 设置：完成时间
	 */
	 
	public void setWanchengshijian(Date wanchengshijian) {
		this.wanchengshijian = wanchengshijian;
	}
	
	/**
	 * 获取：完成时间
	 */
	public Date getWanchengshijian() {
		return wanchengshijian;
	}
				
	
	/**
	 * 设置：完成图片
	 */
	 
	public void setWanchengtupian(String wanchengtupian) {
		this.wanchengtupian = wanchengtupian;
	}
	
	/**
	 * 获取：完成图片
	 */
	public String getWanchengtupian() {
		return wanchengtupian;
	}
				
	
	/**
	 * 设置：发布账号
	 */
	 
	public void setFabuzhanghao(String fabuzhanghao) {
		this.fabuzhanghao = fabuzhanghao;
	}
	
	/**
	 * 获取：发布账号
	 */
	public String getFabuzhanghao() {
		return fabuzhanghao;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
