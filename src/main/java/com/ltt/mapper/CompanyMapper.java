package com.ltt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ltt.beans.Company;

public interface CompanyMapper {
	/**
	 * 
	 * @param tname 
	 * @param name 
	 * @Title: getComList 
	 * @Description: 查询+分页
	 * @return
	 * @return: List
	 */
	List getComList(@Param("name")String name, @Param("tname")String tname);

	void add(Company company);

}
