package com.ltt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ltt.beans.Company;
import com.ltt.mapper.CompanyMapper;
import com.ltt.service.CompanyService;
@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	private CompanyMapper mapper;
	/**
	 * 查询+分页
	 */
		
	@Override
	public PageInfo<Company> getCompanyList(Integer pageNum,String name,String tname) {
		PageHelper.startPage(pageNum, 3);
		List list = mapper.getComList(name,tname);
		PageInfo info = new PageInfo(list);
		return info;
	}
	@Override
	public void add(List<Company> list) {
		for (Company company : list) {
			mapper.add(company);
		}
		
		
	}
	
}
