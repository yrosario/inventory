package com.suffolk.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Computer {
	
	@Id
	private String sn;
	
	private String machineName;
	
	private LocalDate purchasedDate;
	
	private LocalDate warrantyDate;
	
	@OneToOne
	@JoinColumn(name="os_id")
	private Os os;
	
	@OneToOne
	@JoinColumn(name="model_id")
	private Model model;

	
	public Computer() {
	}

	public Computer(String sn, String machineName, LocalDate purchasedDate, LocalDate warrantyDate, Os os,
			Model model) {
		this.sn = sn;
		this.machineName = machineName;
		this.purchasedDate = purchasedDate;
		this.warrantyDate = warrantyDate;
		this.os = os;
		this.model = model;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getMachineName() {
		return machineName;
	}

	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}

	public LocalDate getPurchasedDate() {
		return purchasedDate;
	}

	public void setPurchasedDate(LocalDate purchasedDate) {
		this.purchasedDate = purchasedDate;
	}

	public LocalDate getWarrantyDate() {
		return warrantyDate;
	}

	public void setWarrantyDate(LocalDate warrantyDate) {
		this.warrantyDate = warrantyDate;
	}
	
	public Os getOs() {
		return os;
	}

	public void setOs(Os os) {
		this.os = os;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Computer [sn=" + sn + ", machineName=" + machineName + ", purchasedDate=" + purchasedDate
				+ ", warrantyDate=" + warrantyDate + ", os=" + os + ", model=" + model + "]";
	}
	
	
	

}
