package ru.vladimirminka.task_h3.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.vladimirminka.task_h3.entity.Company;
import ru.vladimirminka.task_h3.service.CompanyService;

import java.util.List;

    @RestController
    @RequestMapping("company")

    public class CompanyController {

        private final CompanyService companyService;

        public CompanyController(CompanyService companyService) {
            this.companyService = companyService;
        }

        // Добавляю компаниию
        @PostMapping
        public ResponseEntity<Company> addCompany(@RequestBody Company company) {
            Company savedCompany = companyService.addCompany(company);
            return ResponseEntity.status(201).body(savedCompany);
        }

        // Удаляю  компаниию по ID
        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteCompany(@PathVariable Long id) {
            companyService.deleteCompany(id);
            return ResponseEntity.noContent().build();
        }

        // получаем все компании
        @GetMapping
        public ResponseEntity<List<Company>> getAllCompanies() {
            List<Company> companies = companyService.getAllCompanies();
            return ResponseEntity.ok(companies);
        }
}

