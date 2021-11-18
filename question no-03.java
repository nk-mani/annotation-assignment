import java.lang.annotation.*;

import java.lang.annotation.Target;

@Target( ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute {
	int sequence() default 0;
}

public class CustomAnnotationQue3 {
	public static void main(String[] args) {
		Test s=new Test(56);
		Class t=s.getClass();
		Annotation a=t.getAnnotation(Execute.class);
		Execute x=(Execute)a;
		System.out.println(x.sequence());
	}
}

class Test {
	public int pin;

	public Test(int pin) {
		this.pin = pin;
	}


	@Execute()
	public static void run2() {
	}

	@Execute()
	public static void run() {
	}
}
