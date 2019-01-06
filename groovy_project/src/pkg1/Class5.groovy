package pkg1

class Class5 {
	
	public Class5()
	{
		println "Default constructor"
	}
	
	public Class5(def a)
	{
		this()
		println "one parameter constructor"
	}
	
	public Class5(def a,def b)
	{
		this(34)
		println "two parameter constructor"
	}
	
	public static void main(String[] args)
	{
		def ob=new Class5(34,12);
	}

}
