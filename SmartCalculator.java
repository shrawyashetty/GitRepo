package assignment;

public class SmartCalculator 
{     static int fact=1;
     private static int total;
	private static int obtained;
	 private static int p;
	private static int t;
	private static int r;
      int[] input;
      int principal,rate;
       int time;
    
	public SmartCalculator()
	{
		fact=1;
		total=500;
		obtained=400;
		t=5;
		p=500;
		r=3;
		principal=10;
		rate=4;
		time=2;
		
		/*this.fact = fact;
		this.total = total;
		this.obtained = obtained;
		this.t = t;
		this.p = p;
		this.r = r;
		this.input = input;
		this.principal = principal;
		this.rate = rate;
		this.time = time;*/
	}
	
	
	public SmartCalculator(int total, int obtained, int p, int t, int r,
			int[] input, int principal, int rate, int time) {
		
		this.total = total;
		this.obtained = obtained;
		this.p = p;
		this.t = t;
		this.r = r;
		this.input = input;
		this.principal = principal;
		this.rate = rate;
		this.time = time;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public int getObtained() {
		return obtained;
	}


	public void setObtained(int obtained) {
		this.obtained = obtained;
	}


	public int getP() {
		return p;
	}


	public void setP(int p) {
		this.p = p;
	}


	public int getT() {
		return t;
	}


	public void setT(int t) {
		this.t = t;
	}


	public int getR() {
		return r;
	}


	public void setR(int r) {
		this.r = r;
	}


	public static  double simpleInterest()
	{ 
		return (p*t*r)/100;
		
	}
	public static  double compoundInterest(int principal,int rate,int time)
	{
		rate=rate/100;
	  return principal*(Math.pow((1 + rate / 4), 4*time)); 
	  
	}
	public static int mean(int[] input)
	{  int sum = 0;
       for (int i = 0; i < input.length; i++)
       {
        sum = sum + input[i];
         }
      return sum / input.length;
	}
	public static int factorial(int num)
	{ int i;
	  for (i = 1; i <= num; ++i)
	  {
        fact = fact*i;
	  }
	  return fact;
	}
	public static  double percent()
	{
		
		return (obtained*100)/total;
	}


	

}
