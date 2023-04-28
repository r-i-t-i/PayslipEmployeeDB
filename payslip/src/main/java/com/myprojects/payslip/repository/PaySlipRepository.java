package com.myprojects.payslip.repository;

import com.myprojects.payslip.entity.PaySlip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaySlipRepository extends JpaRepository<PaySlip, Integer> {
}
