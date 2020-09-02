
public class testCypher {
	public static void main(String[] args) {
		Cypher test1 = new Cypher();
		Cypher test2 = new Cypher(" See the good in that which is evil, and the evil in that which is good.");
		
		Cypher.cypherMethod(test1);
		Cypher.cypherMethod(test2);
		Cypher.reverseMethod(test1);
		Cypher.reverseMethod(test2);
		Cypher.toString(test1);
		Cypher.toString(test2);
		
	}

}
