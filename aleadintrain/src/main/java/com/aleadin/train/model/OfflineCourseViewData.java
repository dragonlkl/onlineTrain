package com.aleadin.train.model;

import java.util.List;

public class OfflineCourseViewData 
{
	private String pageTitle;

	private java.util.List<CarouselSlideViewData> slides;
	
	private List<OfflineClassSurveyViewData> classes;
	
	public String getPageTitle() {
		return pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

	public java.util.List<CarouselSlideViewData> getSlides() {
		return slides;
	}

	public void setSlides(java.util.List<CarouselSlideViewData> slides) {
		this.slides = slides;
	}

	public List<OfflineClassSurveyViewData> getClasses() {
		return classes;
	}

	public void setClasses(List<OfflineClassSurveyViewData> classes) {
		this.classes = classes;
	}
	
	
}
