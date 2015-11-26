package com.aleadin.train.model;

public class YLHMainViewData {
	
	private String pageTitle;
	
	private java.util.List<CarouselSlideViewData> yLHMainslides;
	
	private java.util.List<CourseViewData> superStarCourse;
	
	private java.util.List<CourseViewData> eliteCourse;

	

	public String getPageTitle() {
		return pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

	public java.util.List<CarouselSlideViewData> getyLHMainslides() {
		return yLHMainslides;
	}

	public void setyLHMainslides(java.util.List<CarouselSlideViewData> yLHMainslides) {
		this.yLHMainslides = yLHMainslides;
	}
	public void setSuperStarCourse(java.util.List<CourseViewData> superStarCourse) {
		this.superStarCourse = superStarCourse;
	}

	public java.util.List<CourseViewData> getEliteCourse() {
		return eliteCourse;
	}

	public void setEliteCourse(java.util.List<CourseViewData> eliteCourse) {
		this.eliteCourse = eliteCourse;
	}

	
}
