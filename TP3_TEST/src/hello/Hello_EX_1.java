package hello;

public class Hello_EX_1 {
	
	public static String affichage(String nom) {
		StringBuilder retour = new StringBuilder();
		StringBuilder maj= new StringBuilder();
		retour.append("Hello,");
		maj.append(". AND HELLO,");
		/////////////
		if (isempty(nom))
		{
			retour.append("my friend");
		}
		// Suppress ion des espaces inutiles :) 
		nom = nom.trim().replaceAll("\\s+", " ");
		String[] nameList = nom.split(",");
		
		if (nameList.length==1) 
		{
			if (nameList[0].equals(nameList[0].toUpperCase())) 
				{
					retour.toString().toUpperCase();
					retour.append(nom);
				}
			retour.append(nameList[0]);
		}
		///////
		else 
		{
			for (int i=0;i<(nameList.length)-1;i++) 
				{
					if (nameList[i].equals(nameList[i].toUpperCase()))
						{
							maj.append(nameList[i]);
						}
					else 
					{
						retour.append(nameList[i]);
					} 
				}
			//maj.app end("!");
			retour.append("and");
			retour.append(nameList[-1]);
			retour.append(maj);
		}
		return retour.toString();

		}
	
		public static boolean isempty(String input) 
		{
			boolean res=false;
			if (input.equals(" ") || input==null) 
			{
				res=true;
			}
			return res;
		}
		}




