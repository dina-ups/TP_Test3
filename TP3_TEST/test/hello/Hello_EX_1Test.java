package hello;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Hello_EX_1Test {

	@Test
	void test() {
		Hello_EX_1 hello=new Hello_EX_1();
		String nom="Bob";
		String res= "Hello, "+nom;
		assertEquals(hello.Hello(nom),res);
	}

}
