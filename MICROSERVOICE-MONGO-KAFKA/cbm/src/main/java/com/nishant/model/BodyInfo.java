package com.nishant.model;

import java.util.List;

import org.springframework.data.annotation.Id;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BodyInfo {

	@Id
	private String id;
	
	private String type;
	
	private String thickness;
	
	private List<EngineInfo> engine;
}
