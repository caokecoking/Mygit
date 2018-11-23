package com.zking.pojo.xtgl;

import com.zking.pojo.BasePojo;

import java.util.HashSet;
import java.util.Set;

public class Menu  extends BasePojo {
	public String MenuId;
	
	public String text;
	
	public String MenuParent;
	
	public String MenuPath;

	public transient Set<Jop> sj=new HashSet<>();

	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Menu(String menuId, String text, String menuParent, String menuPath, Set<Jop> sj) {
		super();
		MenuId = menuId;
		this.text = text;
		MenuParent = menuParent;
		MenuPath = menuPath;
		this.sj = sj;
	}

	public String getMenuId() {
		return MenuId;
	}

	public void setMenuId(String menuId) {
		MenuId = menuId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getMenuParent() {
		return MenuParent;
	}

	public void setMenuParent(String menuParent) {
		MenuParent = menuParent;
	}

	public String getMenuPath() {
		return MenuPath;
	}

	public void setMenuPath(String menuPath) {
		MenuPath = menuPath;
	}

	public Set<Jop> getSj() {
		return sj;
	}

	public void setSj(Set<Jop> sj) {
		this.sj = sj;
	}
	
	
}
