package com.bhumika.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.LockMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.bhumika.model.RawMaterial;

@Component
public class RawMaterialDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int addRawMaterial(RawMaterial rawMaterial)
	{
		int i=(Integer) hibernateTemplate.save(rawMaterial);
		return i;
	}
	
	public List<RawMaterial> viewRawMaterial()
	{
		return hibernateTemplate.loadAll(RawMaterial.class);
	}
	
	@Transactional
	public void deleteRawMaterial(RawMaterial rawMaterial)
	{
		hibernateTemplate.delete(rawMaterial);

	}
	@Transactional
	public void updateRawMaterial(RawMaterial urawMaterial)
	{
		hibernateTemplate.update(urawMaterial);
		
	}
//view one raw item
	public RawMaterial viewRawMaterial(int mid)
	{
		RawMaterial rawMaterial=hibernateTemplate.get(RawMaterial.class, mid);
		return rawMaterial;
	}
//view unavailable raw item
	public List<RawMaterial> showUnavailableRawMaterials()
	{
		return hibernateTemplate.loadAll(RawMaterial.class);
	}
//	public List<RawMaterial> getRawMaterialsByQuantity(Integer mquantity) {
//        return rawMaterialRepository.findByMquantity(mquantity);
//    }
}
