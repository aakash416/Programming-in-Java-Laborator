 class DataType_Long {
	
	long a = 1000L;
	long b = -2000L;
	
	void add() {
		
		long c = a + b;
		
		System.out.println("The Long Value is : " + c);
	}
}
 
class MainClass3 {
	
	public static void main(String args[]) {
		
		DataType_Long obj = new DataType_Long();
		
		obj.add();
	}
}