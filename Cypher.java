
public class Cypher {
	
	private String origional;
	private String encrypted;
	private String decrypted;
	
	Cypher(){
		origional = "cypher";
	}
	
	Cypher(String phrase){
		origional = phrase;
	}
	
	public static void cypherMethod(Cypher c) {
		String result = "";
		String p = c.origional;
		
		for(int i = 0; i <p.length(); i+=2 ) {
			result += p.charAt(i);
		}
		for(int i = 1; i < p.length(); i+=2) {
			result += p.charAt(i);
		}
		
		c.encrypted = result;	
	}
	
	public static void reverseMethod(Cypher c) {
		String p = c.encrypted;
		int length = p.length();
		char[] d = new char[length +1];
		int count = 0;
		
		if(length%2==0) {
			for (int i = 0; i < (length/2); i++) {
			d[count] = p.charAt(i);
			count +=2;
			}
		}else {
			for (int i = 0; i <= (length/2); i++) {
			d[count] = p.charAt(i);
			count +=2;
			}
		}
			
		count = 1;
		
		for (int i = length - (length/2); i <length; i++) {
			d[count] = p.charAt(i);
			count +=2;
		}
		String revResult = new String(d);
		c.decrypted = revResult;
	}
	
	public static String getOrigional(Cypher c) {
		return c.origional;
	}
	
	public static String getEncrypted(Cypher c) {
		return c.encrypted;
	}
	
	public static String getDecrypted(Cypher c) {
		return c.decrypted;
	}
	public static void toString(Cypher c) {
		System.out.print("Origional: " +c.origional 
				+"\nEncrypted: " +c.encrypted
				+"\nDecrypted: " +c.decrypted +"\n\n");
	}
	
}
