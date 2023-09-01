package foundationPrograms1;

public class HashCode {

	int regNo;
	String name;

	HashCode(int rollNum, String stName) {
		this.regNo = rollNum;
		this.name = stName;
		System.out.println(regNo);
		System.out.println(name);

	}

	public void setName(String nme) {
		this.name = nme;
	}

	public String name() {
		return name;
	}

	public void setRollNum(int a) {
		this.regNo = a;
	}

	public int getRollNum() {
		return regNo;
	}

}
