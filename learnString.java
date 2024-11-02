package day9;

public class learnString {

	public static void main(String[] args) 
	{
		String str="TestLeaf123";
		//String replacAll = str.replaceAll("Tes", "123");
		//System.out.println(replacAll);
		
		//eg2
		String replacAll2 = str.replaceAll("[^0-9]", " ");//^this symbol represents except
		System.out.println(replacAll2);//        123
		
		String replacAll = str.replaceAll("[A-z]", "@");
		System.out.println(replacAll);//@@@@@@@@123
		
		String replac3All = str.replaceAll("[^A-z]", "@");
		System.out.println(replac3All);//TestLeaf@@@
		
		
		
	}

}
