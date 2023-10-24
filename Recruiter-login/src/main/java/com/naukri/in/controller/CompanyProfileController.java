package com.naukri.in.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naukri.in.model.Company;
import com.naukri.in.service.CompanyService;

@Controller
@RequestMapping("/recruiter/user/")
public class CompanyProfileController {

	@Autowired
	private CompanyService companyService;
	
	@RequestMapping("addcompany")
	public String getCompanyView()
	{
		return "company/company_add";
	}
	
	@RequestMapping("savecompany")
	public String getSaveCompanyDetails(Company company, HttpSession ses, Model model )
	{
		model.addAttribute("name",ses.getAttribute("name"));
		companyService.saveCompanyDetails(company);
		return "company/saved_company";
	}
	
	@RequestMapping("companylist")
	public String getCompanyList(Model model)
	{
		List<Company> list=companyService.getCompanyList();
		model.addAttribute("companylist", list);
		return "company/company_list";
	}
	
	
	@RequestMapping("editcompany")
	public String editCompanyList(Company company,Model model, int companyid)
	{
		Company companydetails=companyService.getCompany(companyid);
		model.addAttribute("companydetails",companydetails);
		return "company/edit_company";
	}
	
	
	@RequestMapping("removecompany")
	public String removeCompanyList(int companyid)
	{
		companyService.removeCompanyList(companyid);
		return "redirect:companylist";
	}
	
	
	@RequestMapping("updateCompanydetails")
	public String updateCompanyDetails(Company company)
	{
		companyService.updateCompany(company);
		return "redirect:companylist";
	}
	
}
