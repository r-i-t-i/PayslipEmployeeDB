package com.myprojects.payslip.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "payslip")
@Component
public class PaySlip {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @ManyToOne()
    @JoinColumn(name ="emp_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler",
            "name",
            "designation",
            "empNo",
            "accountNumber",
            "joiningDate",
            "basicPay",
            "medicalAllowance",
            "specialAllowance",
            "regularBonus",
            "incentives",
            "providentFund",
            "taxDeductions",
            "otherDeductions",
            "grossSalary",
            "netSalary"})
    private Employee employee;

    @Column(name = "payslip")
    private String payslip;

    public PaySlip(){}

    public PaySlip(int id, String template) {
        this.id = id;
        this.payslip = template;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
