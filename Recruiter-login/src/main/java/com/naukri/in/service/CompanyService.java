package com.naukri.in.service;

import java.util.List;

import com.naukri.in.model.Company;

public interface CompanyService {

	void saveCompanyDetails(Company company);

	List<Company> getCompanyList();

	void removeCompanyList(int companyid);

	Company getCompany(int companyid);

	void updateCompany(Company company);

}
