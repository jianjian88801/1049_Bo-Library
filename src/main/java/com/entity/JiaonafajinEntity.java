package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 缴纳罚金
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-20 13:31:53
 */
@TableName("jiaonafajin")
public class JiaonafajinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaonafajinEntity() {
		
	}
	
	public JiaonafajinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 借阅单号
	 */
					
	private String jieyuedanhao;
	
	/**
	 * 图书编号
	 */
					
	private String tushubianhao;
	
	/**
	 * 图书名称
	 */
					
	private String tushumingcheng;
	
	/**
	 * 罚款说明
	 */
					
	private String fakuanshuoming;
	
	/**
	 * 罚款金额
	 */
					
	private Integer fakuanjine;
	
	/**
	 * 罚款日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fakuanriqi;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：借阅单号
	 */
	public void setJieyuedanhao(String jieyuedanhao) {
		this.jieyuedanhao = jieyuedanhao;
	}
	/**
	 * 获取：借阅单号
	 */
	public String getJieyuedanhao() {
		return jieyuedanhao;
	}
	/**
	 * 设置：图书编号
	 */
	public void setTushubianhao(String tushubianhao) {
		this.tushubianhao = tushubianhao;
	}
	/**
	 * 获取：图书编号
	 */
	public String getTushubianhao() {
		return tushubianhao;
	}
	/**
	 * 设置：图书名称
	 */
	public void setTushumingcheng(String tushumingcheng) {
		this.tushumingcheng = tushumingcheng;
	}
	/**
	 * 获取：图书名称
	 */
	public String getTushumingcheng() {
		return tushumingcheng;
	}
	/**
	 * 设置：罚款说明
	 */
	public void setFakuanshuoming(String fakuanshuoming) {
		this.fakuanshuoming = fakuanshuoming;
	}
	/**
	 * 获取：罚款说明
	 */
	public String getFakuanshuoming() {
		return fakuanshuoming;
	}
	/**
	 * 设置：罚款金额
	 */
	public void setFakuanjine(Integer fakuanjine) {
		this.fakuanjine = fakuanjine;
	}
	/**
	 * 获取：罚款金额
	 */
	public Integer getFakuanjine() {
		return fakuanjine;
	}
	/**
	 * 设置：罚款日期
	 */
	public void setFakuanriqi(Date fakuanriqi) {
		this.fakuanriqi = fakuanriqi;
	}
	/**
	 * 获取：罚款日期
	 */
	public Date getFakuanriqi() {
		return fakuanriqi;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
