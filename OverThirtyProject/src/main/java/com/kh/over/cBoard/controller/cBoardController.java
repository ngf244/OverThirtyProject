package com.kh.over.cBoard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.over.cBoard.model.service.cBoardService;



@Controller
public class cBoardController {
	
	@Autowired
	private cBoardService cBoardService;
	
	
	@RequestMapping("writeView.ch")
	public String boardInsertView() {
		return "cBoardWrite";
	}
}
