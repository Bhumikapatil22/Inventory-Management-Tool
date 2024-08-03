package com.bhumika.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.bhumika.model.Manager;
import com.bhumika.model.RawMaterial;

@Component
public class ManagerDao 
{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public Manager getInfo(String memail)
	{
		Manager manager=hibernateTemplate.get(Manager.class,memail);
		return manager;
	}
	
	@Transactional
	public void setPassword(Manager manager)
	{
		hibernateTemplate.update(manager);
		
	}
}
