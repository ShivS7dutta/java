package String;

public class StringReverseUsingloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello India";
		//String str="radar";
	//	String  a="221";
		String result="";
		
		for(int i=str.length()-1;i>=0;i--)
			result +=str.charAt(i);

		System.out.println(result);
	}
	


}
