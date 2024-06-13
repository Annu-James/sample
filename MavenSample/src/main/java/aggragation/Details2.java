package aggragation;

public class Details2 {
	int rank;
	Details a;
	public Details2(int rank,Details a)
	{
		this.rank=rank;
		this.a=a;
		
	}
	public void show()
	{
		System.out.println(a.name+" "+a.mark);
		System.out.println(rank);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Details obj=new Details("Arya",450);
Details2 obj2=new Details2(3,obj);//1st class obj
obj2.show();
	}

}
