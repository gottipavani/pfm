package com.PFM.pfm.project.service.impl;

import com.PFM.pfm.project.entity.Expense;
import com.PFM.pfm.project.payload.ExpenseDto;
import com.PFM.pfm.project.repository.ExpenseRepository;
import com.PFM.pfm.project.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Override
    public ExpenseDto addExpense(ExpenseDto expenseDto) {
        Expense expense = mapToEntity(expenseDto);
        Expense savedExpense = expenseRepository.save(expense);

        ExpenseDto dto1=mapToDto(savedExpense);
        return dto1;

    }

    ExpenseDto mapToDto(Expense expense) {
        ExpenseDto dto=new ExpenseDto();
        dto.setId(expense.getId());
        dto.setCategory(expense.getCategory());
        dto.setDescription(expense.getDescription());
        dto.setAmount(expense.getAmount());
        dto.setDate(expense.getDate());

        return dto;
    }

    Expense mapToEntity(ExpenseDto expenseDto) {
        Expense expense=new Expense();
        expense.setId(expenseDto.getId());
        expense.setCategory(expenseDto.getCategory());
        expense.setDescription(expenseDto.getDescription());
        expense.setAmount(expenseDto.getAmount());
        expense.setDate(expenseDto.getDate());
        return expense;
    }

    @Override
    public List<ExpenseDto> getAllExpenses() {
            List<Expense> expenses = expenseRepository.findAll();
            return expenses.stream()
                    .map(this::mapToDto)
                    .collect(Collectors.toList());
        }

    @Override
    public void deleteExpense( Long id) {
            expenseRepository.deleteById(id);
        }
    }



