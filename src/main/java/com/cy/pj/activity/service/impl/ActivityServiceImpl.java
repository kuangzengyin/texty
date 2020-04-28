package com.cy.pj.activity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.pj.activity.dao.ActivityDao;
import com.cy.pj.activity.pojo.Activity;
import com.cy.pj.activity.service.ActivityService;
@Service
public class ActivityServiceImpl implements ActivityService {
	@Autowired
	private ActivityDao activityDao;
	@Override
	public List<Activity> findActivity() {
		
		return activityDao.findActivity();
	}
	@Override
	public int deleteActivity(Long id) {
		return activityDao.deleteActivity(id);
	}
	@Override
	public int insertActivity(Activity activity) {
		
		return activityDao.insertActivity(activity);
	}
	@Override
	public Activity findById(Long id) {
		
		return activityDao.findById(id);
	}
	
	
}
