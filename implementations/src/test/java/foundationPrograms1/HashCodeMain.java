package foundationPrograms1;

public class HashCodeMain {

	public static void main(String[] args) {
		HashCode emp1=new HashCode(918,"Sagar");
		HashCode emp2=new HashCode(918,"Sagar");
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp1.equals(emp2));
		emp1.setName("Naik");
		System.out.println(emp1.name());
		emp1.setRollNum(8);
		System.out.println(emp1.getRollNum());

	}

}
