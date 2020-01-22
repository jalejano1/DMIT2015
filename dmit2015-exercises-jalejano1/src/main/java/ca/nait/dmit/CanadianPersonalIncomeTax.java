package ca.nait.dmit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class CanadianPersonalIncomeTax {
	private int taxYear = LocalDate.now().getYear();
	private double taxableIncome = 50000;
	private CanadianProvince province = CanadianProvince.AB;
	
	public CanadianPersonalIncomeTax( ) {
		super();
		loadData();
	}
	public CanadianPersonalIncomeTax(int taxYear, double taxableIncome, CanadianProvince province) {
		super();
		this.taxYear = taxYear;
		this.taxableIncome = taxableIncome;
		this.province = province;
		loadData();
	}
	private final List<FederalIncomeTaxBracket> federalTaxBrackets = new ArrayList<>();
	private final List<ProvincialIncomeTaxBracket> provincialTaxBracket = new ArrayList<>();
	private void loadData() {
		
	}
	
	public double getFederalIncomeTaxAmount () {
		double taxAmount = 0;
		return taxAmount;
	}
	
	public double getProvinceIncomeTaxAmout() {
		double taxAmount = 0;
		return taxAmount;
	}
	public double getTotalIncomeTaxAmount() {
		return getFederalIncomeTaxAmount() + getProvinceIncomeTaxAmount();
	}
}
