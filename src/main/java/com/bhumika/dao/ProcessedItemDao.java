package com.bhumika.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.bhumika.model.ProcessedItem;
import com.bhumika.model.RawMaterial;

@Component
public class ProcessedItemDao 
{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
//add	
	@Transactional
	public int addProcessedItem(ProcessedItem processedItem)
	{
		int i=(Integer) hibernateTemplate.save(processedItem);
		return i;
	}
	
	
//view all	
	public List<ProcessedItem> viewProcessedItem()
	{
		return hibernateTemplate.loadAll(ProcessedItem.class);
	}
	
	
//get one processed item
	public ProcessedItem viewOneProcessedItem(int pid)
	{
		
		ProcessedItem processedItem=hibernateTemplate.get(ProcessedItem.class, pid);
		return processedItem;
	}
	
	
//update
	@Transactional
	public void updateProcessedItem(ProcessedItem processedItem)
	{
		hibernateTemplate.update(processedItem);

	}
	
	
//delete	
	@Transactional
	public void deleteProcessedItem(ProcessedItem processedItem)
	{
		hibernateTemplate.delete(processedItem);

	}
}
