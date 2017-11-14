 class DataType_Byte {
	
	byte a = 50;
	byte b = (byte) -80;
	
	void add() {
		
		byte c = (byte) (a + b);
		
		System.out.println("The Byte Value is : " + c);
	}
}
 
class MainClass {
	
	public static void main(String args[]) {
		
		DataType_Byte obj = new DataType_Byte();
		
		obj.add();
	}
}
