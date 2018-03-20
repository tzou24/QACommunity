package com.qac.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseAffichecontent<M extends BaseAffichecontent<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public M setTitle(java.lang.String title) {
		set("title", title);
		return (M)this;
	}
	
	public java.lang.String getTitle() {
		return getStr("title");
	}

	public M setCategoryId(java.lang.Long categoryId) {
		set("categoryId", categoryId);
		return (M)this;
	}
	
	public java.lang.Long getCategoryId() {
		return getLong("categoryId");
	}

	public M setPublish(java.util.Date publish) {
		set("publish", publish);
		return (M)this;
	}
	
	public java.util.Date getPublish() {
		return get("publish");
	}

	public M setCreateUer(java.lang.Long createUer) {
		set("createUer", createUer);
		return (M)this;
	}
	
	public java.lang.Long getCreateUer() {
		return getLong("createUer");
	}

	public M setContent(java.lang.String content) {
		set("content", content);
		return (M)this;
	}
	
	public java.lang.String getContent() {
		return getStr("content");
	}

	public M setOrderNo(java.lang.Integer orderNo) {
		set("orderNo", orderNo);
		return (M)this;
	}
	
	public java.lang.Integer getOrderNo() {
		return getInt("orderNo");
	}

	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}
	
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

}