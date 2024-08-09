package arraysEx1;

public class ArrayTest11 {

	public static void main(String[] args) {
		char[] copyfrom = {'a','e','i','o','u','y','g','l','j','r'};
		char[] copyto = new char[3];
		System.arraycopy(copyfrom, 4, copyto, 0, 2);
		System.out.println(String.valueOf(copyto));

	}

}
