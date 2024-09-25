package com.PFM.pfm.project.service;

import com.PFM.pfm.project.payload.ExpenseDto;


import java.util.List;

public interface ExpenseService {


    public ExpenseDto addExpense(ExpenseDto expenseDto);

    List<ExpenseDto> getAllExpenses();

    void deleteExpense(Long id);


}

