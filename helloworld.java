public class classA {
	int z=90;//instance variable
	static int m=100;//static variable

	public static void main(String[] args) {
		classA obj=new classA();
		// TODO Auto-generated method stub
System.out.println("hello world");
  obj.show();
  obj.play();
	}

	
	 void show()
	{
		int a=10;//local variable
		a++;
		m--;
		System.out.println(a);
		System.out.println(m);
	}
	
	
	void play()
	{
		int b=20;
		z--;
		
	}
}
