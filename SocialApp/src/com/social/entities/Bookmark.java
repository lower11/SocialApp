package com.social.entities;

import com.social.constants.ChildSafeStatus;

public abstract class Bookmark {
	
	private long id;
	private String title;
	private String profileUrl;
	private String childSafeStatus = ChildSafeStatus.UNKNOWN;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getProfileUrl() {
		return profileUrl;
	}
	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}
	
	public abstract boolean isChildSafe();
	
	public String getChildSafeStatus() {
		return childSafeStatus;
	}
	public void setChildSafeStatus(String childSafeStatus) {
		this.childSafeStatus = childSafeStatus;
	}
	

}
