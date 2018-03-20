package com.qac.platform.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseTest<M extends BaseTest<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setTestName(java.lang.String testName) {
		set("testName", testName);
		return (M)this;
	}
	
	public java.lang.String getTestName() {
		return getStr("testName");
	}

	public M setTestContent(java.lang.String testContent) {
		set("testContent", testContent);
		return (M)this;
	}
	
	public java.lang.String getTestContent() {
		return getStr("testContent");
	}

}