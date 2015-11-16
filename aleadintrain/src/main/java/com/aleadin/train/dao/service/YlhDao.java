package com.aleadin.train.dao.service;

import java.util.List;
import java.util.Map;

import com.aleadin.train.dao.vo.SlideVO;

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
}
