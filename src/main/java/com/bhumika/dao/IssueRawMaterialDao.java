package com.bhumika.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.bhumika.model.IssueRaw;
import com.bhumika.model.RawMaterial;

@Component
public class IssueRawMaterialDao 
{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Autowired
	private RawMaterial rawMaterial;
	@Autowired
	private RawMaterialDao rawMaterialDao;
	@Transactional
	public int addIssueRawMaterial(IssueRaw issueRaw)
	{
		int i=(Integer) hibernateTemplate.save(issueRaw);
		int quantity=issueRaw.getQuantity();	
		int rawId=issueRaw.getRawId();
		RawMaterial raw=rawMaterialDao.viewRawMaterial(rawId);
		int mquantity=raw.getMquantity();
		mquantity-=quantity;
		
		raw.setMquantity(mquantity);
		rawMaterialDao.updateRawMaterial(raw);
		return i;
	}
	
	public List<IssueRaw> viewIssueRawMaterial()
	{
		List<IssueRaw> list=hibernateTemplate.loadAll(IssueRaw.class);
		return list;
	}
	
}
