package com.naukri.in.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naukri.in.model.Company;
import com.naukri.in.repository.CompanyRepository;
import com.naukri.in.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService{
	
	
	@Autowired
	private CompanyRepository companyRepository;

	public void saveCompanyDetails(Company company) {
		companyRepository.save(company);
	}

	public List<Company> getCompanyList() {
		return companyRepository.findAll();
	}

	public void removeCompanyList(int companyid) {
		
		companyRepository.deleteById(companyid);
	}

	public Company getCompany(int companyid) {
		return companyRepository.findById(companyid).orElse(null);
	}

	
	public void updateCompany(Company company) {
		companyRepository.save(company);
	}


}
