package com.PFM.pfm.project.controller;

import com.PFM.pfm.project.payload.ExpenseDto;
import com.PFM.pfm.project.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    //http://localhost:8080/api/expenses
    @PostMapping
    public ResponseEntity<ExpenseDto> addExpense(@RequestBody ExpenseDto expenseDto) {
        ExpenseDto dto1 = expenseService.addExpense(expenseDto);
        return new ResponseEntity<>(dto1, HttpStatus.CREATED);
    }


    @GetMapping
    public List<ExpenseDto> getAllExpenses() {
        return expenseService.getAllExpenses();
    }


    @DeleteMapping("/delete/{id}")
    public void deleteExpense(@PathVariable Long id) {
        expenseService.deleteExpense(id);


    }
}

