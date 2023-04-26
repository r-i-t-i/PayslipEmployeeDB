package com.myprojects.storemanager.products;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
@Component
public class product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "Designation")
	private String designation;
	
	@Column(name = "EmpNo")
	private String empNo;
	
	@Column(name = "AccountNumber")
	private String accountNumber;
	
	@Column(name = "JoiningDate")
	private String joiningDate;
	
	@Column(name = "BasicPay")
	private String basicPay;
	
	@Column(name = "MedicalAllowance")
	private String medicalAllowance;
	
	@Column(name = "SpecialAllowance")
	private String specialAllowance;
	
	@Column(name = "RegularBonus")
	private String regularBonus;
	
	@Column(name = "VariableComponent")
	private String variableComponent;
	
	@Column(name = "ProvidentFund")
	private String providentFund;
	
	@Column(name = "TaxDeductions")
	private String taxDeductions;
	
	@Column(name = "OtherDeductions")
	private String otherDeductions;
	
	@Column(name = "GrossSalary")
	private String grossSalary;
	
	@Column(name = "TotalDeductions")
	private String totalDeduction;
	
	@Column(name = "NetSalary")
	private String netSalary;

	public product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public product(long id, String name, String designation, String empNo, String accountNumber, String joiningDate,
			String basicPay, String medicalAllowance, String specialAllowance, String regularBonus,
			String variableComponent, String providentFund, String taxDeductions, String otherDeductions,
			String grossSalary, String totalDeduction, String netSalary) {
		super();
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
		this.variableComponent = variableComponent;
		this.providentFund = providentFund;
		this.taxDeductions = taxDeductions;
		this.otherDeductions = otherDeductions;
		this.grossSalary = grossSalary;
		this.totalDeduction = totalDeduction;
		this.netSalary = netSalary;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(String basicPay) {
		this.basicPay = basicPay;
	}

	public String getMedicalAllowance() {
		return medicalAllowance;
	}

	public void setMedicalAllowance(String medicalAllowance) {
		this.medicalAllowance = medicalAllowance;
	}

	public String getSpecialAllowance() {
		return specialAllowance;
	}

	public void setSpecialAllowance(String specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

	public String getRegularBonus() {
		return regularBonus;
	}

	public void setRegularBonus(String regularBonus) {
		this.regularBonus = regularBonus;
	}

	public String getVariableComponent() {
		return variableComponent;
	}

	public void setVariableComponent(String variableComponent) {
		this.variableComponent = variableComponent;
	}

	public String getProvidentFund() {
		return providentFund;
	}

	public void setProvidentFund(String providentFund) {
		this.providentFund = providentFund;
	}

	public String getTaxDeductions() {
		return taxDeductions;
	}

	public void setTaxDeductions(String taxDeductions) {
		this.taxDeductions = taxDeductions;
	}

	public String getOtherDeductions() {
		return otherDeductions;
	}

	public void setOtherDeductions(String otherDeductions) {
		this.otherDeductions = otherDeductions;
	}

	public String getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(String grossSalary) {
		this.grossSalary = grossSalary;
	}

	public String getTotalDeduction() {
		return totalDeduction;
	}

	public void setTotalDeduction(String totalDeduction) {
		this.totalDeduction = totalDeduction;
	}

	public String getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(String netSalary) {
		this.netSalary = netSalary;
	}
	
	
}