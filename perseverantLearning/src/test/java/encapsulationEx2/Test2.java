package encapsulationEx2;

public class Test2 {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.setacc_no(123456789);
		t1.setamount(98);
		t1.setemail("abc@test.com");
		t1.setname("xyz");
		System.out.println(t1.getacc_no() + "--" + t1.getamount() + "---" + t1.getemail() + "---" + t1.getname());

	}

}
