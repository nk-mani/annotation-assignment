public class CustomAnnotationQue1 {

	@interface Test {
		int test_case();

	}

	@Test(test_case = 1)
	public static void meth1() {
		System.out.println("this is method 1");

	}

	@Test(test_case = 2)
	public static void meth2() {
		System.out.println("this is method 2");
	}

	public static void main(String[] args) {
		meth1();
		meth2();

	}
}
