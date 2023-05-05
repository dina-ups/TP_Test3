package hello;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Hello_EX_1Test {

	@BeforeEach
	public void initialisation()
	{
	System.out.println("Lancement des tests");

	}
	@Test
	void test1() {
	assertEquals(Hello_EX_1.affichage("bob"),"Hello,bob");
	}
	void test2() 
	{
	assertEquals(Hello_EX_1.affichage(" "),"Hello, my friend");
	assertEquals(Hello_EX_1.affichage("bob"),"Hello,Bob");
	assertEquals(Hello_EX_1.affichage("  "),"Hello, my friend");
	}
	void test3() 
	{
	assertEquals(Hello_EX_1.affichage("JERRY"),"HELLO, JERRY");
	}

	void test4() 
	{
	assertEquals(Hello_EX_1.affichage("Amy,Bob"),"Hello, Amy, Bob”");
	}
	void test5() 
	{
	assertEquals(Hello_EX_1.affichage("Amy,Bob,Jerry"),"Hello, Amy, Bob, Jerry”");
	assertEquals(Hello_EX_1.affichage("Amy,Bob,Jerry,Tom,Bambi"),"Hello, Amy, Bob, Jerry, Tom, Bambi");
	}
	void test6() 
	{
	assertEquals(Hello_EX_1.affichage("Amy, BOB, Jerry"),"Hello, Amy, Jerry. AND HELLO, BOB !");
	assertEquals(Hello_EX_1.affichage("Amy, BOB, TOM, Jerry"),"Hello, Amy, Jerry. AND HELLO, BOB, TOM !");
	}
	void test7() 
	{
	assertEquals(Hello_EX_1.affichage("Bob, Amy, Jerry"),"Hello, Amy and Jerry!");
	assertEquals(Hello_EX_1.affichage("Bob, AMY, Jerry, JACK"),"Hello, bob and jerry AND HELLO AMY AND JACK !");
	assertEquals(Hello_EX_1.affichage("Bob, AMY, Jerry, JACK, TOM, Aminata"),"Hello, bob,jerry and Aminata. AND HELLO AMY AND JACK AND TOM !");
	}


}
