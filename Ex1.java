package dsum.pr1;

class Ex2{
	
}


public class Ex1 {
	int data;
	Ex1 next;
	public static void main(String[] args) {
		Ex1 test = new Ex1(); //Ex1 *node= (EX*) malloc(sizeof(Ex1))
		System.out.println(test);
		test.data = 3;
		System.out.println(test.data);
		int c = test.data;
		System.out.println(c);
	}
}