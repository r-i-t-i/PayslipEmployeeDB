package com.myprojects.payslip.service;

import com.myprojects.payslip.entity.PaySlip;
import com.myprojects.payslip.exception.Response;
import com.myprojects.payslip.repository.PaySlipRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PaySlipService {
    @Autowired
    private PaySlipRepository paySlipRepository;

    public List<PaySlip> getAllPaySlips() {
        return this.paySlipRepository.findAll();
    }

    public Response createPaySlip(PaySlip payS) {
        PaySlip paySlip = this.paySlipRepository.save(payS);
        if (paySlip == null) {
            return new Response(500, "Cannot create PaySlip", System.currentTimeMillis(), false);
        }
        return new Response(200, "Ok", System.currentTimeMillis(), true);
    }
    public PaySlip getPaySlipByEmpId(int id){
        // change the logic here , currently return find by id rather than find by empid;
        PaySlip paySlip= this.paySlipRepository.findById(id).orElse(null);
        return paySlip;
    }
}