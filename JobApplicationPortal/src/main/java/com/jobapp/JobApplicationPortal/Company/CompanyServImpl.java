package com.jobapp.JobApplicationPortal.Company;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServImpl implements CompanyService{

    CompanyRepo companyRepo;

    //depended on repo, now we can access all the methods
    public CompanyServImpl(CompanyRepo companyRepo) {
        this.companyRepo = companyRepo;
    }

    @Override
    public List<Company> getAllCompanies() {
        List<Company> companyList = companyRepo.findAll();
        System.out.println(companyList.toString());

        return companyList;

    }

    @Override
    public boolean createCompany(Company company) {
        Company createdCompany = companyRepo.save(company);
        return true;
    }

    @Override
    public boolean deleteCompany(Long id) {

        Company company = companyRepo.findById(id).orElse(null);

        if(company != null){
            companyRepo.deleteById(id);
            return true;
        }

        return false;
    }

    @Override
    public boolean updateCompany(Long id, Company company) {

        Company oldCompany = companyRepo.findById(id).orElse(null);
        if(oldCompany!= null){
            //we need daata for new company
            oldCompany.setAddress(company.getAddress());
            oldCompany.setDepartment(company.getDepartment());
            oldCompany.setDescription(company.getDescription());
            oldCompany.setName(company.getName());
            oldCompany.setRevenue(company.getRevenue());
            oldCompany.setNumberOfEmployees(company.getNumberOfEmployees());
            oldCompany.setJobList(company.getJobList());
            companyRepo.save(oldCompany);
            return true;
        }
        return false;
    }

    @Override
    public Company getCompanyById(Long id) {

        return companyRepo.findById(id).orElse(null);

    }
}
