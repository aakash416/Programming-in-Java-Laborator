 class DataType_Short {
	
	short a = 1000;
	short b = -1500;
	
	void add() {
		
		short c = (short) (a + b);
		
		System.out.println("The Short Value is : " + c);
	}
}
 
class MainClass1 {
	
	public static void main(String args[]) {
		
		DataType_Short obj = new DataType_Short();
		
		obj.add();
	}
}