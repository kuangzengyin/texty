package com.cy.pj.activity.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.cy.pj.activity.pojo.Activity;

@Mapper
public interface ActivityDao {
	@Select("select*from tb_activity")
	List<Activity> findActivity();
	@Delete("delete from tb_activity where id=#{id}")
	int  deleteActivity(Long id);
	@Insert("insert into tb_activity(title,category,startTime,endTime,createdTime) values(#{title},#{category},#{startTime},#{endTime},now())")
	int insertActivity(Activity activity);
	
	@Select("select title,category,startTime,endTime from tb_activity where id=#{id}")
	Activity findById(Long id);

}
