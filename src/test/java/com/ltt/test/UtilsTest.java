package com.ltt.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.ltt.beans.Company;
import com.ltt.service.CompanyService;
import com.ltt.utils.DateUtils;
import com.ltt.utils.StringUtils;
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring-beans.xml")
public class UtilsTest {
	@Autowired
	private CompanyService service;
	@Test
	public void test1() {
		List<Company> list = new ArrayList<Company>();
		for (int i = 0; i < 100; i++) {
			String name = StringUtils.getRandomCn(4);
			String corporation = StringUtils.getRandomCn(3);
			String address = StringUtils.getRandomCn(20);
			String capital = StringUtils.generateNumberString(8);
			String regist_no = StringUtils.generateNumberString(6);
			String tid = StringUtils.generateNumberString(1);
			Date date1 = DateUtils.randomdate();
			Company com = new Company();
			com.setName("北京"+name+"股份有限公司");
			com.setCorporation(corporation);
			com.setAddress(address);
			com.setCapital(Integer.parseInt(capital));
			com.setRegist_no("1101"+regist_no);
			com.setTid(Integer.parseInt(tid));
			com.setPeriod(date1);
			Date period = date1;
			Calendar cal = Calendar.getInstance();  
			cal.setTime(period);
			cal.add(Calendar.YEAR, +50);
			java.util.Date time = cal.getTime();
			Date created = new Date(time.getTime());
			com.setCreated(created);
			list.add(com);
			
		}
		
		service.add(list);
		
	}
	@Test
	public void test2() {
		List<Company> list = new ArrayList<Company>();
		for (int i = 0; i < 10000; i++) {
			String name = StringUtils.getRandomCn(4);
			String corporation = StringUtils.getRandomCn(3);
			String address = StringUtils.getRandomCn(20);
			String capital = StringUtils.generateNumberString(8);
			String regist_no = StringUtils.generateNumberString(6);
			String tid = StringUtils.generateNumberString(1);
			Date date1 = DateUtils.randomdate();
			Company com = new Company();
			com.setName("北京"+name+"股份有限公司");
			com.setCorporation(corporation);
			com.setAddress(address);
			com.setCapital(Integer.parseInt(capital));
			com.setRegist_no("1101"+regist_no);
			com.setTid(Integer.parseInt(tid));
			com.setPeriod(date1);
			Date period = date1;
			Calendar cal = Calendar.getInstance();  
			cal.setTime(period);
			cal.add(Calendar.YEAR, +50);
			java.util.Date time = cal.getTime();
			Date created = new Date(time.getTime());
			com.setCreated(created);
			list.add(com);
			
		}
		for (Company company : list) {
			System.out.println(company);
		}
		
	}
}
