package practicePojo1;

import java.util.ArrayList;

public class Order {

	String intent;
	ArrayList<Purchase_units> purchase_units;

	public Order(String intent, ArrayList<Purchase_units> purchase_units) {
		this.intent = intent;
		this.purchase_units = purchase_units;
	}

	public String getIntent() {
		return intent;
	}

	public void setIntent(String intent) {
		this.intent = intent;
	}

	public ArrayList<Purchase_units> getPurchase_units() {
		return purchase_units;
	}

	public void setPurchase_units(ArrayList<Purchase_units> purchase_units) {
		this.purchase_units = purchase_units;
	}

	

}
