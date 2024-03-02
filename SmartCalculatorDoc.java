package assignment;
//calculations using smart calculator
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
       
    //non parameterized constructor
       
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
	/**
	 * parameterized constructor
	 * @param total
	 * @param obtained
	 * @param p
	 * @param t
	 * @param r
	 * @param input
	 * @param principal
	 * @param rate
	 * @param time
	 */
	
	
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
	/**
	 * getter method
	 * @return t is total marks
	 */

	public int getTotal() {
		return total;
	}
	/**
	 * setter method
	 * @param total
	 */

	public void setTotal(int total) {
		this.total = total;
	}
	/**
	 * getter method
	 * @return marks obtained by the student
	 */

	public int getObtained() {
		return obtained;
	}
	/**
	 * setter method
	 * @param marks obtained by the student
	 */

	public void setObtained(int obtained) {
		this.obtained = obtained;
	}
	/**
	 * getter method 
	 * @return p is principal amount
	 */

	public int getP() {
		return p;
	}
	/**
	 * setter method
	 * @param p is principal amount
	 */

	public void setP(int p) {
		this.p = p;
	}
	/**
	 * getter method
	 * @return t is time
	 */
	public int getT() {
		return t;
	}
	/**
	 * setter method
	 * @param t is time
	 */

	public void setT(int t) {
		this.t = t;
	}
	/**
	 * getter method
	 * @return r is rate
	 */
	public int getR() {
		return r;
	}
	/**
	 * setter method
	 * @param r is rate
	 */

	public void setR(int r) {
		this.r = r;
	}
	/**
	 * calculation of simple interest
	 * @return simple interest
	 */

	public static  double simpleInterest()
	{ 
		return (p*t*r)/100;
		
	}
	/**
	 * calculation of compound interest
	 * @param principal
	 * @param rate
	 * @param time
	 * @return compound interest
	 */
	public static  double compoundInterest(int principal,int rate,int time)
	{
		rate=rate/100;
	  return principal*(Math.pow((1 + rate / 4), 4*time)); 
	  
	}
	/**
	 * calculation of mean of a given number
	 * @param input number
	 * @return mean mean of a number
	 */
	public static int mean(int[] input)
	{  int sum = 0;
       for (int i = 0; i < input.length; i++)
       {
        sum = sum + input[i];
         }
      return sum / input.length;
	}
	/**
	 * calculation of factorial of the given number
	 * @param num number
	 * @return fact factorial
	 */
	public static int factorial(int num)
	{ int i;
	  for (i = 1; i <= num; ++i)
	  {
        fact = fact*i;
	  }
	  return fact;
	}
	/**
	 * calculation of percentage of a student
	 * @return percentage
	 */
	public static  double percent()
	{
		
		return (obtained*100)/total;
	}


	

}
