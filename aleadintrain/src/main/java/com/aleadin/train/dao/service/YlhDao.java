package com.aleadin.train.dao.service;

import java.util.List;
import java.util.Map;

import com.aleadin.train.dao.vo.ClassDetailVo;
import com.aleadin.train.dao.vo.ClassSurveyVO;
import com.aleadin.train.dao.vo.SlideVO;
import com.aleadin.train.dao.vo.OfflineClassSurveyVO;

public interface YlhDao {
	/**
	 * 查询AD数据
	 * @param appId
	 * @param startDate
	 * @param endDate
	 * @param adCode
	 * @return
	 */
	List<SlideVO> querySlideByPosition(Map<String,Object> params);
	
	/**
	 * 查询课程摘要
	 * @param params
	 * @return
	 */
	List<ClassSurveyVO> queryClassSurvey(Map<String,Object> params);
	
	/**
	 * 查询详细课程
	 * @param params
	 * @return
	 */
	List<ClassDetailVo> queryClassDetail(Map<String,Object> params);

	/**
	 * 查询相关课程摘要
	 * @param params
	 * @return
	 */
	List<ClassSurveyVO> queryRelationClassSurvey(Map<String,Object> params);
	
	/**
	 * 查询相关课程摘要
	 * @param params
	 * @return
	 */
	List<OfflineClassSurveyVO> queryOfflineClassSurvey(Map<String,Object> params);
	
}
