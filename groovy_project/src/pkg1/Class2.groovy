package pkg1

class Class2 {
	
	def a;
	
	public void method1()
	{
		println("Welcome all of you")
	}
	
	public static void main(String[] args)
	{
		def ref=new Class2();  // Object creation
		ref.a=12;
		
		println ref.a
		
		ref.method1()
	}
	

}
