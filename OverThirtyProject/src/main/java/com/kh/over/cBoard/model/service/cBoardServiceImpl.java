package com.kh.over.cBoard.model.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.over.cBoard.model.dao.cBoardDAO;

@Service("cBoardService")
public class cBoardServiceImpl implements cBoardService{

	@Autowired
	private cBoardDAO cBoardDAO;
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	

}
