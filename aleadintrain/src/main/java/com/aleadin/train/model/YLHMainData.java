package com.aleadin.train.model;

import com.aleadin.train.dao.vo.CarouselSlideVO;
import com.aleadin.train.dao.vo.CoursewareVO;

public class YLHMainData {
	
	private String title;
	
	private java.util.List<CarouselSlideVO> YLHMainslides;
	
	private java.util.List<CoursewareVO> superStarCourse;
	
	private java.util.List<CoursewareVO> eliteCourse;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public java.util.List<CarouselSlideVO> getYLHMainslides() {
		return YLHMainslides;
	}

	public void setYLHMainslides(java.util.List<CarouselSlideVO> yLHMainslides) {
		YLHMainslides = yLHMainslides;
	}

	public java.util.List<CoursewareVO> getSuperStarCourse() {
		return superStarCourse;
	}

	public void setSuperStarCourse(java.util.List<CoursewareVO> superStarCourse) {
		this.superStarCourse = superStarCourse;
	}

	public java.util.List<CoursewareVO> getEliteCourse() {
		return eliteCourse;
	}

	public void setEliteCourse(java.util.List<CoursewareVO> eliteCourse) {
		this.eliteCourse = eliteCourse;
	}
	
	
}
