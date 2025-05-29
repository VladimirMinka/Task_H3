package ru.vladimirminka.task_h3.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vladimirminka.task_h3.entity.Business;
import ru.vladimirminka.task_h3.repo.BusinessRepo;

@RequestMapping("/business")
@RestController
@AllArgsConstructor
public class BusinessController {
    private final BusinessRepo businessRepo;
    @PostMapping("/add")
    public ResponseEntity<Business> addCompany(@RequestBody Business business) {
        Business saveBusiness = businessRepo.save(business);
        return ResponseEntity.status(201).body(saveBusiness);
    }
}
