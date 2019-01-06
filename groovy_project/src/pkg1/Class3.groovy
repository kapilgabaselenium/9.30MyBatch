package pkg1

class Class3 {
	
	public def sum(def a,def b)
	{
		def c;
		c=a+b;
		return c;
	}
	
	public def sub(def a,def b)
	{
		def c;
		c=a-b;
		return c;
	}
	
	public void mul(def a,def b)
	{
		def c;
		c=a*b;
		println("Result is "+c)
	}
	
	public static void main(String[] args)
	{
		def ob=new Class3()
		def sum_result=ob.sum(12, 10)
		def sub_result=ob.sub(13, 2)
		ob.mul(sum_result,sub_result)
		
		
	}

}
