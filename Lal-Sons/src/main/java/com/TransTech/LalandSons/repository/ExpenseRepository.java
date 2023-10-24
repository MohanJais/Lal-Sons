package com.TransTech.LalandSons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TransTech.LalandSons.entity.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
