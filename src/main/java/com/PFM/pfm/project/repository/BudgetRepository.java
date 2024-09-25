package com.PFM.pfm.project.repository;

import com.PFM.pfm.project.entity.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget,Long> {
}
