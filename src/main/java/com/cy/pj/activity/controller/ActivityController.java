package com.cy.pj.activity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cy.pj.activity.pojo.Activity;
import com.cy.pj.activity.service.ActivityService;
import com.fasterxml.jackson.core.JsonProcessingException;

@Controller
@RequestMapping("activity")
public class ActivityController {
	@Autowired
	private ActivityService activityService;
	/**
	 * @throws JsonProcessingException 
	 * @ResponseBody 可以描述类也可以描述方法。假如添加到类上，表示类中
	 * 所有方法上都相当于有一个@reponseBody注解。
	 * 此注解描述的方法会由spring mvc将其返回值转换为json格式的字符串(前提
	 * 是返回值可以转为这样的串)。
	 * json是什么？一种数据格式。
	 * json定义的是一种什么样的格式:{"key1":value1,"key2":value2}
	 * 为什么要使用这样格式呢？客户端(浏览器，手机端app)与服务端进行通讯时的一种轻量级数据格式标准。
	 */
	//根据Id删除信息
	@RequestMapping("dodeleteById")
	@ResponseBody
	public String dodeleteById(Long id) {
		activityService.deleteActivity(id);
		return "delelte 成功";
	}
	// 新增数据
	@RequestMapping("doSaveActivity")
	@ResponseBody
	public String doSaveActivity(Activity activity) {
		activityService.insertActivity(activity);
		return "save 成功";
	}
	
	//查询信息
	@RequestMapping("doFindActivitys")
	@ResponseBody
	public List<Activity> doFindActivitys(){
		List<Activity> list=
		 activityService.findActivity();
		return list;
	}
	
	@RequestMapping("doActivityUI")
	public String doActivityUI() {
		//return "activity";
		return "Jquery-01.html";
	}

}
