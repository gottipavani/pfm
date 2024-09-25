package com.PFM.pfm.project.repository;

import com.PFM.pfm.project.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {
}
