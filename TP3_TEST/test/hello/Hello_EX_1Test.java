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

}
