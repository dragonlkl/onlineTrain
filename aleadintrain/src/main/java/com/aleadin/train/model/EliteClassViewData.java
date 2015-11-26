package com.aleadin.train.model;

import java.util.List;

public class EliteClassViewData {
	// 课程ID
	private String classid;

	// 课程视频路径
	private String vediopath;

	// 课程标题
	private String title;

	// 课程介绍
	private String introduce;

	// 作者ID
	private String authorID;

	// 作者
	private String authorName;

	// 任职机构
	private String company;

	// 职位
	private String position;

	// 作者简介
	private List<String> authIntroduces;
	
	// 作者头像
	private String authImgPath;

	// 相关课程
	private java.util.List<CourseViewData> relationCourse;

	public String getClassid() {
		return classid;
	}

	public void setClassid(String classid) {
		this.classid = classid;
	}

	public String getVediopath() {
		return vediopath;
	}

	public void setVediopath(String vediopath) {
		this.vediopath = vediopath;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getAuthorID() {
		return authorID;
	}

	public void setAuthorID(String authorID) {
		this.authorID = authorID;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	
	public List<String> getAuthIntroduces() {
		return authIntroduces;
	}

	public void setAuthIntroduces(List<String> authIntroduces) {
		this.authIntroduces = authIntroduces;
	}

	public String getAuthImgPath() {
		return authImgPath;
	}

	public void setAuthImgPath(String authImgPath) {
		this.authImgPath = authImgPath;
	}

	public java.util.List<CourseViewData> getRelationCourse() {
		return relationCourse;
	}

	public void setRelationCourse(java.util.List<CourseViewData> relationCourse) {
		this.relationCourse = relationCourse;
	}

}
