 class DataType_Float {
	
	float a = (float) 10.56;
	float b = (float) -23.57;
	
	void add() {
		
		float c = a + b;
		
		System.out.println("The Float Vaue is : " + c);
	}
}
 
class MainClass4 {
	
	public static void main(String args[]) {
		
		DataType_Float obj = new DataType_Float();
		
		obj.add();
	}
}