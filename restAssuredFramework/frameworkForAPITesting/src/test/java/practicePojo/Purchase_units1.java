package practicePojo;

public class Purchase_units1 {

	private String reference_id;
	private Amount amount;

	public Purchase_units1(String reference_id, String currency_code, String value) {
		this.reference_id = reference_id;
		this.amount = new Amount(currency_code, value);
	}

	public String getReference_id() {
		return reference_id;
	}

	public void setReference_id(String reference_id) {
		this.reference_id = reference_id;
	}

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}

}
