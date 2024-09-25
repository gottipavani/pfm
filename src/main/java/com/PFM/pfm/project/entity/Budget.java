package com.PFM.pfm.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "budgets")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Budget
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category;
    private double limit;
    private double spent;

}
