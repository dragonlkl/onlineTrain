package com.aleadin.train.dao.vo;

//课件
public class CoursewareVO {
	//课件类型，大咖课程，菁英课程，职场预演
	private String type;
	
	//课程宣传图片路径
	private String imagePath;
	
	//作者
	private String authorName;
	
	//任职机构
	private String company;
	
	//职位
	private String position;
	
	//课程标题
	private String title;
	
	//课程介绍
	private String introduce;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
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
	

	
}
