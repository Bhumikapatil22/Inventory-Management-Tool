package com.bhumika.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bhumika.dao.IssueProcessedDao;
import com.bhumika.dao.IssueRawMaterialDao;
import com.bhumika.dao.ManagerDao;
import com.bhumika.dao.ProcessedItemDao;
import com.bhumika.dao.RawMaterialDao;
import com.bhumika.model.IssueProcessed;
import com.bhumika.model.IssueRaw;
import com.bhumika.model.Manager;
import com.bhumika.model.ProcessedItem;
import com.bhumika.model.RawMaterial;


@Controller
public class HomeController 
{
	@Autowired
	RawMaterial rawMaterial;
	@Autowired
	RawMaterialDao rawMaterialDao;
	
	@Autowired
	ProcessedItem processedItem;
	@Autowired
	ProcessedItemDao processedItemDao;
	
	@Autowired 
	IssueRaw issueRaw;
	@Autowired 
	IssueRawMaterialDao issueRawMaterialDao;
	
	@Autowired
	IssueProcessed issueProcessed;
	@Autowired
	IssueProcessedDao issueProcessedDao;
	
	@Autowired
	Manager manager;
	@Autowired
	ManagerDao managerDao;
	
	@RequestMapping("/")
	public String homePage()
	{
		return "index";
	}
//login manager
	@RequestMapping("/login")
	public String loginPage()
	{
		return "login";
	}
	
	@RequestMapping(path="/loginManager",method=RequestMethod.POST)
	public String loginManager(HttpServletRequest request)
	{
		Manager manager=managerDao.getInfo("admin@gmail.com");
		String setemail=manager.getMemail();
		String setpass=manager.getMpassword();
		String memail=request.getParameter("memail");
		String mpassword=request.getParameter("mpassword");
		if(memail.equals(setemail)&& mpassword.equals(setpass))
		{
			return "dashboard";
		}
		else
		{
			return "index";
		}
	}
//add raw  material
	@RequestMapping("/add")
	public String add()
	{
		return "addRawMaterial";
	}
	
	@RequestMapping(path="/addRawMaterial",method=RequestMethod.POST)
	public String addRawMaterial(@ModelAttribute RawMaterial rawMaterial,HttpServletRequest request)
	{
		int i=rawMaterialDao.addRawMaterial(rawMaterial);
		return "dashboard";
	}
//view one raw material
		
		@RequestMapping("/viewOne")
		public String viewOneAccount()
		{
			return "viewRawMaterial";
		}
		@RequestMapping(path="/viewRawMaterial",method=RequestMethod.POST)
		public String viewRawMaterial(Model model,HttpServletRequest request)
		{
			
			int mid=Integer.parseInt(request.getParameter("mid"));	
			RawMaterial raw=rawMaterialDao.viewRawMaterial(mid); 
			model.addAttribute("rawList",raw);
			return "welcome";
		}
	
//view raw materials
	
	@RequestMapping("/viewRawMaterial")
	public String viewRawMaterial(Model model)
	{
		List<RawMaterial> rawmaterial=rawMaterialDao.viewRawMaterial();
		model.addAttribute("rawmaterialList",rawmaterial);
		
		return "viewRawMaterial";
	}
//update	
	@RequestMapping("/update")
	public String update()
	{
		return "updateRawMaterial";
	}
	@RequestMapping("/updateRawMaterial")
	public String updateRawMaterial(HttpServletRequest request)
	{
		int mid=Integer.parseInt(request.getParameter("mid"));
		int mquantity=Integer.parseInt(request.getParameter("mquantity"));
		RawMaterial raw=rawMaterialDao.viewRawMaterial(mid);		
		int quantity=raw.getMquantity();
		quantity+=mquantity;	
		raw.setMquantity(quantity);
		rawMaterialDao.updateRawMaterial(raw);
		return "dashboard";
	}
	
	
//delete raw material
	@RequestMapping("/delete")
	public String deleteRawMaterial(HttpServletRequest request)
	{
		int mid=Integer.parseInt(request.getParameter("mid"));
		RawMaterial raw=rawMaterialDao.viewRawMaterial(mid); 
		rawMaterialDao.deleteRawMaterial(raw);
		return "redirect:/viewRawMaterial";
	}

	
//add processed item	
	@RequestMapping("/addProcessedItem")
	public String addProcessedItem()
	{
		return "addProcessedItem";
	}
	
	@RequestMapping(path="/addItem",method=RequestMethod.POST)
	public String addItem(@ModelAttribute ProcessedItem processedItem,HttpServletRequest request)
	{
		int i=processedItemDao.addProcessedItem(processedItem);
		return "dashboard";
	}
	
//view Processed Item	
	@RequestMapping("/viewProcessedItem")
	public String viewProcessedItem(Model model)
	{
		List<ProcessedItem> processedItem=processedItemDao.viewProcessedItem();
		model.addAttribute("processedItemList",processedItem);
		return "viewProcessedItem";
	}
//update Processed Item
	@RequestMapping("/updatePItem")
	public String updateProcessItem()
	{
		return "updateProcessedItem";
	}
	@RequestMapping(path="/updateProcessedItem",method=RequestMethod.POST)
	public String updateProcessedItem(HttpServletRequest request)
	{
		int pid=Integer.parseInt(request.getParameter("pid"));
		int pquantity=Integer.parseInt(request.getParameter("pquantity"));
		ProcessedItem pitem=processedItemDao.viewOneProcessedItem(pid);	
		int quantity=pitem.getPquantity();
		quantity+=pquantity;	
		pitem.setPquantity(quantity);
		processedItemDao.updateProcessedItem(pitem);
		return "dashboard";
		
	}
	
//delete Processed Item
	@RequestMapping("/deleteProcessedItem")
	public String deleteProcessedItem(HttpServletRequest request)
	{
		int pid=Integer.parseInt(request.getParameter("pid"));
		ProcessedItem pitem=processedItemDao.viewOneProcessedItem(pid);	
		processedItemDao.deleteProcessedItem(pitem);
		return "redirect:/viewProcessedItem";
	}
//add issue Raw Material
	@RequestMapping("/issue")
	public String issue()
	{
		return "issueRawMaterial";
	}
	@RequestMapping(path="/issueRawMaterial",method=RequestMethod.POST)
	public String issueRawMaterial(@ModelAttribute IssueRaw issueRaw)
	{
		int i=issueRawMaterialDao.addIssueRawMaterial(issueRaw);
		return "dashboard";
	}
	
//view issue Raw Material	
	@RequestMapping("/viewIssueRawMaterial")
	public String viewIssueRawMaterial(Model model)
	{
		List<IssueRaw> issueRaws=issueRawMaterialDao.viewIssueRawMaterial();
		model.addAttribute("issueRawList",issueRaws);
		return "viewIssueRawMaterial";
	}
	
//add issue Processed Item
	@RequestMapping("/issuePItem")
	public String issuePItem()
	{
		return "issueProcessedItem";
	}
	@RequestMapping(path="/IssueProcessedItem",method=RequestMethod.POST)
	public String issueProcessedItem(@ModelAttribute IssueProcessed issueProcessed)
	{
		int i=issueProcessedDao.addIssueProcessedItem(issueProcessed);
		return "dashboard";
	}

//view Issue Processed Item
	@RequestMapping("/viewIssueProcessedItem")
	public String viewIssueProcessedItem(Model model)
	{
		List<IssueProcessed> issueProcessed=issueProcessedDao.viewIssueProcessedItem();
		model.addAttribute("issueProcessedList",issueProcessed);
		return "viewIssueProcessedItem";
	}
	
//view unavailable Raw Material
	@RequestMapping("/viewunavailableRawMaterial")
	public String showUnavailableRawMaterials(Model model)
	{
		List<RawMaterial> rawmaterial=rawMaterialDao.viewRawMaterial();
		model.addAttribute("rawmaterialList",rawmaterial);
		return "viewunavailableRawMaterial";
	}

//view unavailablep item
		@RequestMapping("/viewunavailableProcessedItem")
		public String showUnavailableProcessedItem(Model model)
		{
			List<ProcessedItem> processedItem=processedItemDao.viewProcessedItem();
			model.addAttribute("processedItemList",processedItem);
			return "viewunavailableProcessedItem";
		}
//change password
	@RequestMapping("/change")
	public String change()
	{
		return "changePassword";
	}
	@RequestMapping(path="/changePassword",method=RequestMethod.POST)
	public String changePassword(HttpServletRequest request)
	{
		String memail=request.getParameter("memail");
		String npassword=request.getParameter("npassword");
		Manager manager=managerDao.getInfo(memail);
		String setpass=manager.getMpassword();
		setpass=npassword;
		manager.setMpassword(setpass);
		managerDao.setPassword(manager);
		return "dashboard";
	}
	
//dashboard
	@RequestMapping("/dashboard")
	public String dashboard()
	{
		return "dashboard";
	}
	@RequestMapping("/error")
	public String error()
	{
		return "error";
	}
	
}
