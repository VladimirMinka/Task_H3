package ru.vladimirminka.task_h3.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vladimirminka.task_h3.entity.Company;
import ru.vladimirminka.task_h3.repo.CompanyRepo;

import java.util.List;

@Service
@AllArgsConstructor
public class CompanyService {

    private final CompanyRepo companyRepo;

    @Transactional
    public Company addCompany(Company company) {
        return companyRepo.save(company);
    }

    @Transactional
    public void deleteCompany(Long id) {
        companyRepo.deleteById(id);
    }


    public List<Company> getAllCompanies() {
        return companyRepo.findAll();
    }
}