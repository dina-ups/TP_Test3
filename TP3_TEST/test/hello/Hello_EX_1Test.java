package hello;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Hello_EX_1Test {

	@Test
	void test1() {
		Hello_EX_1 hello=new Hello_EX_1();
		String nom="Bob";
		String res= "Hello, "+nom;
		assertEquals(hello.Hello(nom),res);
	}

	@Test
	void test2() {
		Hello_EX_1 hello=new Hello_EX_1();
		String nom="";
		String nom1=null;
		String nom2="   ";
		String res= "Hello, my friend";
		assertEquals(hello.Hello(nom2),res);
		assertEquals(hello.Hello(nom),res);
		assertEquals(hello.Hello(nom1),res);
	}
	

	@Test
	void test3() {
		Hello_EX_1 hello=new Hello_EX_1();
		String nom="BOB";
		String res= "HELLO, BOB !";
		assertEquals(hello.Hello(nom),res);
	}
}
