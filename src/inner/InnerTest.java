package inner;

public class InnerTest {
	private int key=20;  //my secret key
	
	//AN inner class
	public class InnerProc{
		public String encode (String input)
		{
			StringBuffer sb=new StringBuffer();
			for(char c: input.toCharArray())
			{
				char c2=(char)(c^key); //XOR- Exclusive OR 
				sb.append(c2); //Add the encoded character to the buffer
			}
			return sb.toString();    //return the encoded buffer
		}
	}
	
	/**
	 * Constructor -this is the constructor of my class
	 * @param key the secret encryption key
	 */
	public InnerTest(int key) {
		this.key=key;
		
		InnerProc iProc=new InnerProc();
		
		String str0="My secret message 123";
		System.out.println("Str0:" + str0);
		
		String str1=iProc.encode(str0);   //Initial encode
		System.out.println("Str1:" + str1);
		
		String str2=iProc.encode(str1);  //Reverse the encoding due to XOR
		System.out.println("Str2:" + str2);
	}
/**
 * My main method
 * @param args input arguments
 */
	
	
	public static void main(String[] args) {
		InnerTest inTest=new InnerTest(30);

	}

}
