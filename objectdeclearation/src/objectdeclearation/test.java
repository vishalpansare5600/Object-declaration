package objectdeclearation;

   class  test
{

	 int max(int x,int y)
	 {
		if(x>y)
			return(x);
		else
			return(y);
	 }
	 int min(int x, int y)
	 {
		 if(x<y)
			 return(x);
		 else
			 return(y);
	 }


 
 
	 public static void main(String[] args)
	 {
		 int mx,mn;
		 int c[]={10,20,40,50};
		 
		 int a=(c[0]);
		 int b=(c[1]);
		 test t=new test();
		 mx=t.max(a,b);
		 mn=t.min(a,b);
		 System.out.println("maximum="+mx);
		 System.out.println("minmum=" +mn);
	 }

	 }


