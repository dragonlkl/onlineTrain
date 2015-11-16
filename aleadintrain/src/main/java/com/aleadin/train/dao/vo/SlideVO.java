package com.aleadin.train.dao.vo;

import java.sql.Date;

public class SlideVO {

	//slideID
	private String ID;
	
	//滚动屏位置
	private int position;
	
	//目标对象ID
    private String objectID;
	
    //slide 介绍
	private String introduce;
	
	//图片路径
	private String imgPath;
	
	//Slide index
	private String slideindex;
	
	private Date createTime;
	
	private Date updateTime;
	
	private Date deleteTime;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getObjectID() {
		return objectID;
	}

	public void setObjectID(String objectID) {
		this.objectID = objectID;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getSlideindex() {
		return slideindex;
	}

	public void setSlideindex(String slideindex) {
		this.slideindex = slideindex;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getDeleteTime() {
		return deleteTime;
	}

	public void setDeleteTime(Date deleteTime) {
		this.deleteTime = deleteTime;
	}
	
	
}
