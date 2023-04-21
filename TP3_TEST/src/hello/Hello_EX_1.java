package hello;

public class Hello_EX_1 {
	
	public String Hello(String nom) 
	{
		String str= "Hello, "+nom;
		if(nom==null)
			str="Hello, my friend";
		if (nom!=null &&"".equals(nom.trim()))
			str="Hello, my friend";
		return str;
	}

}
