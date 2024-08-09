package encapsulationEx2;

public class Test1 {

	private long acc_no;
	private String name, email;
	private float amount;

	public void setacc_no(long actno) {
		this.acc_no = actno;
	}

	public long getacc_no() {
		return acc_no;
	}

	public void setname(String nm) {
		this.name = nm;
	}

	public String getname() {
		return name;
	}

	public void setemail(String em) {
		this.email = em;
	}

	public String getemail() {
		return email;
	}

	public void setamount(float amt) {
		this.amount = amt;
	}

	public float getamount() {
		return amount;
	}

}
