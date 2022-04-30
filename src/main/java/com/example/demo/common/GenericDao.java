package com.example.demo.common;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class GenericDao {
	
	@Resource
	private SqlSessionTemplate sqlSession;
	
	public List<Map<String, Object>> getList(String queryId, Map<String, Object> paramMap) {
		return sqlSession.selectList(queryId, paramMap);
	}
}
