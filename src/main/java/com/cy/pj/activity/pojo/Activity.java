package com.cy.pj.activity.pojo;

import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
@Data
public class Activity {
	
	private Long id;
	private String title;
	private String category;
	@DateTimeFormat(pattern = "yyyy/MM/dd HH:mm")
	@JsonFormat(pattern = "yyyy/MM/dd HH:mm")
	private LocalDateTime startTime;
	@DateTimeFormat(pattern = "yyyy/MM/dd HH:mm")
	@JsonFormat(pattern = "yyyy/MM/dd HH:mm")
	private LocalDateTime endTime;
	private String remark;
	private Integer tinyint=1;
	private LocalDateTime createdTime;
	private String createdUser;
		
}
