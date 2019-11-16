package com.ltt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.ltt.beans.Company;
import com.ltt.service.CompanyService;
/**
 * 
 * @ClassName: CompanyController 
 * @Description: 控制层
 * @author:，liutiantian
 * @date: 2019年11月16日 上午9:21:13
 */
@Controller
public class CompanyController {
	@Autowired
	private CompanyService service;
	/**
	 * 
	 * @Title: getList 
	 * @Description: 查询分页
	 * @param m
	 * @param pageNum
	 * @return
	 * @return: String
	 */
	@RequestMapping("list.do")
	public String getList(Model m,@RequestParam(defaultValue = "1")Integer pageNum,String name,String tname) {
		PageInfo<Company> info = service.getCompanyList(pageNum,name,tname);
		m.addAttribute("info", info);
		m.addAttribute("name", name);
		m.addAttribute("tname", tname);
		return "list";
		
	}
	
}
