package com.aleadin.train.model;

public class EliteCourseViewData {

	private String pageTitle;
	
	private java.util.List<CarouselSlideViewData> eliteCourseslides;
	
	private java.util.List<CourseViewData> eliteCourse;

	
	public String getPageTitle() {
		return pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

	public java.util.List<CarouselSlideViewData> getEliteCourseslides() {
		return eliteCourseslides;
	}

	public void setEliteCourseslides(
			java.util.List<CarouselSlideViewData> eliteCourseslides) {
		this.eliteCourseslides = eliteCourseslides;
	}

	public java.util.List<CourseViewData> getEliteCourse() {
		return eliteCourse;
	}

	public void setEliteCourse(java.util.List<CourseViewData> eliteCourse) {
		this.eliteCourse = eliteCourse;
	}
	
	
}
