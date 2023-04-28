package com.myprojects.payslip.controller;

import com.myprojects.payslip.entity.PaySlip;
import com.myprojects.payslip.exception.ResourceNotFoundException;
import com.myprojects.payslip.exception.Response;
import com.myprojects.payslip.service.PaySlipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payslip")
@CrossOrigin(origins = "*")
public class PaySlipController {

    @Autowired
    private PaySlipService paySlipService;

    @GetMapping("")
    public List<PaySlip> getAllPaySlips(){
        return this.paySlipService.getAllPaySlips();
    }

    @PostMapping("")
    public Response createPaySlip(@RequestBody PaySlip paySlip){
        return this.paySlipService.createPaySlip(paySlip);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getPaySlipById(@PathVariable int id) throws ResourceNotFoundException{
        try{
            PaySlip paySlip = this.paySlipService.getPaySlipByEmpId(id);
            return ResponseEntity.ok(paySlip);
        }catch(Exception e){
            throw new ResourceNotFoundException("PaySlip not found");
        }
    }


}
