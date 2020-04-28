package com.cy.pj.activity.service;

import java.util.List;

import com.cy.pj.activity.pojo.Activity;

public interface ActivityService {
	//查询数据
	List<Activity> findActivity();
	//删除数据
	int  deleteActivity(Long id);
	//新增数据
	int insertActivity(Activity activity);
	//根据id查询数据
	Activity findById(Long id);
	
}
