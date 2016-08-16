package org.packt.human.resource.portal.model.data;
// Generated 08 7, 15 10:09:21 AM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * HrmsEmployeeSalary generated by hbm2java
 */
@Entity
@Table(name = "hrms_employee_salary", catalog = "hrms")
public class HrmsEmployeeSalary implements java.io.Serializable {

	private int empId;
	private HrmsEmployeeDetails hrmsEmployeeDetails;
	private String salaryRange;
	private double annualIncome;
	private double taxable;
	private double loans;
	private double insurance;


	@Id

	@Column(name = "empId", unique = true, nullable = false)
	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "empId", unique = true, nullable = false, insertable = false, updatable = false)
	public HrmsEmployeeDetails getHrmsEmployeeDetails() {
		return this.hrmsEmployeeDetails;
	}

	public void setHrmsEmployeeDetails(HrmsEmployeeDetails hrmsEmployeeDetails) {
		this.hrmsEmployeeDetails = hrmsEmployeeDetails;
	}

	@Column(name = "salaryRange", nullable = false, length = 45)
	public String getSalaryRange() {
		return this.salaryRange;
	}

	public void setSalaryRange(String salaryRange) {
		this.salaryRange = salaryRange;
	}

	@Column(name = "annualIncome", nullable = false, precision = 22, scale = 0)
	public double getAnnualIncome() {
		return this.annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	@Column(name = "taxable", nullable = false, precision = 22, scale = 0)
	public double getTaxable() {
		return this.taxable;
	}

	public void setTaxable(double taxable) {
		this.taxable = taxable;
	}

	@Column(name = "loans", nullable = false, precision = 22, scale = 0)
	public double getLoans() {
		return this.loans;
	}

	public void setLoans(double loans) {
		this.loans = loans;
	}

	@Column(name = "insurance", nullable = false, precision = 22, scale = 0)
	public double getInsurance() {
		return this.insurance;
	}

	public void setInsurance(double insurance) {
		this.insurance = insurance;
	}

}