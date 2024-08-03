package com.bhumika.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.bhumika.model.IssueProcessed;
import com.bhumika.model.IssueRaw;
import com.bhumika.model.ProcessedItem;
import com.bhumika.model.RawMaterial;

@Component
public class IssueProcessedDao 
{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Autowired
	ProcessedItem processedItem;
	@Autowired
	ProcessedItemDao processedItemDao;
	
	@Transactional
	public int addIssueProcessedItem(IssueProcessed issueProcessed)
	{
		int i=(Integer) hibernateTemplate.save(issueProcessed);
		int quantity=issueProcessed.getQuantity();	
		int pId=issueProcessed.getProcessedId();
		ProcessedItem pitem=processedItemDao.viewOneProcessedItem(pId);
		int pquantity=pitem.getPquantity();
		pquantity-=quantity;
		pitem.setPquantity(pquantity);
		processedItemDao.updateProcessedItem(pitem);
		return i;
	}
	public List<IssueProcessed> viewIssueProcessedItem()
	{
		List<IssueProcessed> list=hibernateTemplate.loadAll(IssueProcessed.class);
		return list;
	}
}
