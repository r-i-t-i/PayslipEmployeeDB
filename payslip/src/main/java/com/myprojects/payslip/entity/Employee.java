package com.myprojects.payslip.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "employee")
@Component
public class Employee {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "emp_name")
	private String name;
	
	@Column(name = "designation")
	private String designation;
	
	@Column(name = "emp_no")
	private String empNo;
	
	@Column(name = "account_no")
	private String accountNumber;
	
	@Column(name = "joining_date")
	private Date joiningDate;
	
	@Column(name = "basic_pay")
	private int basicPay;
	
	@Column(name = "medical_allowance")
	private int medicalAllowance;
	
	@Column(name = "special_allowance")
	private int specialAllowance;
	
	@Column(name = "regular_bonus")
	private int regularBonus;
	
	@Column(name = "incentives")
	private int incentives;
	
	@Column(name = "provident_fund")
	private int providentFund;
	
	@Column(name = "tax_deductions")
	private int taxDeductions;
	
	@Column(name = "other_deductions")
	private int otherDeductions;
	
	@Column(name = "gross_salary")
	private int grossSalary;
	
	@Column(name = "net_salary")
	private int netSalary;

	@OneToMany( mappedBy = "employee",cascade = CascadeType.REMOVE)
	@JsonIgnore
	private List<PaySlip> paySlips;

	public Employee() {
		super();
	}

	public Employee(int id, String name,
					String designation,
					String empNo,
					String accountNumber,
					Date joiningDate,
					int basicPay,
					int medicalAllowance,
					int specialAllowance,
					int regularBonus,
					int incentives,
					int providentFund,
					int taxDeductions,
					int otherDeductions,
					int grossSalary,
					int netSalary) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.empNo = empNo;
		this.accountNumber = accountNumber;
		this.joiningDate = joiningDate;
		this.basicPay = basicPay;
		this.medicalAllowance = medicalAllowance;
		this.specialAllowance = specialAllowance;
		this.regularBonus = regularBonus;
		this.incentives = incentives;
		this.providentFund = providentFund;
		this.taxDeductions = taxDeductions;
		this.otherDeductions = otherDeductions;
		this.grossSalary = grossSalary;
		this.netSalary = netSalary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public int getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(int basicPay) {
		this.basicPay = basicPay;
	}

	public int getMedicalAllowance() {
		return medicalAllowance;
	}

	public void setMedicalAllowance(int medicalAllowance) {
		this.medicalAllowance = medicalAllowance;
	}

	public int getSpecialAllowance() {
		return specialAllowance;
	}

	public void setSpecialAllowance(int specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

	public int getRegularBonus() {
		return regularBonus;
	}

	public void setRegularBonus(int regularBonus) {
		this.regularBonus = regularBonus;
	}

	public int getIncentives() {
		return incentives;
	}

	public void setIncentives(int incentives) {
		this.incentives = incentives;
	}

	public int getProvidentFund() {
		return providentFund;
	}

	public void setProvidentFund(int providentFund) {
		this.providentFund = providentFund;
	}

	public int getTaxDeductions() {
		return taxDeductions;
	}

	public void setTaxDeductions(int taxDeductions) {
		this.taxDeductions = taxDeductions;
	}

	public int getOtherDeductions() {
		return otherDeductions;
	}

	public void setOtherDeductions(int otherDeductions) {
		this.otherDeductions = otherDeductions;
	}

	public int getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(int grossSalary) {
		this.grossSalary = grossSalary;
	}

	public int getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(int netSalary) {
		this.netSalary = netSalary;
	}
}