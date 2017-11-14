 class DataType_Double {
	
	double a = 123.456;
	double b = -45.894;
	
	void add() {
		
		double c = a + b;
		System.out.println("The Double Value is : " + c);
	}
 
}
 
class MainClass5 {
	
	public static void main(String args[]) {
		
		DataType_Double obj = new DataType_Double();
		
		obj.add();
	}
}