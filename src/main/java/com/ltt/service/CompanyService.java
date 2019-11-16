package com.ltt.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.ltt.beans.Company;

public interface CompanyService {
	/**
	 * 
	 * @Title: getCompanyList 
	 * @Description: 查询+分页
	 * @param pageNum
	 * @param tname 
	 * @param name 
	 * @return
	 * @return: PageInfo<Company>
	 */
	PageInfo<Company> getCompanyList(Integer pageNum, String name, String tname);

	void add(List<Company> list);

}
