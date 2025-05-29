package ru.vladimirminka.task_h3.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vladimirminka.task_h3.entity.Business;

@Repository
public interface BusinessRepo extends JpaRepository<Business, Long> {
}
