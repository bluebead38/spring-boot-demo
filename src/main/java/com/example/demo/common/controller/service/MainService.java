package com.example.demo.common.controller.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.common.GenericDao;
 
@Service
public class MainService {
    @Autowired
    private GenericDao genericDao;
    
    public List<Map<String, Object>> getList() throws Exception {
        return genericDao.getList("DemoMapper.getList", null);
    }
}