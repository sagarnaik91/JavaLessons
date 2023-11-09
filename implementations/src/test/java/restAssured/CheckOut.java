package restAssured;

import java.util.ArrayList;

public class CheckOut {

	private String intent;
	private ArrayList<Purchase_Units> purchase_units;

	CheckOut(String intent, ArrayList<Purchase_Units> purchase_units) {
		this.intent = intent;
		this.purchase_units = purchase_units;
	}

	public String getIntent() {
		return intent;
	}

	public void setIntent(String intent) {
		this.intent = intent;
	}

	public ArrayList<Purchase_Units> getPurchase_units() {
		return purchase_units;
	}

	public void setPurchase_units(ArrayList<Purchase_Units> purchase_units) {
		this.purchase_units = purchase_units;
	}

}
