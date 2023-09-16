package pojo;

public class Purchase_units {
	
	private Amount amount;
	private String reference_id;
	
	public Purchase_units(String currency_code, String value,String reference_id)
	{
		this.amount=new Amount(currency_code,value);
		this.reference_id=reference_id;
	}
	public Amount getAmount() {
		return amount;
	}
	public void setAmount(Amount amount) {
		this.amount = amount;
	}
	public String getReference_id() {
		return reference_id;
	}
	public void setReference_id(String reference_id) {
		this.reference_id = reference_id;
	}

}
