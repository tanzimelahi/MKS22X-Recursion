public class recursion{
  public static double sqrtHelp(double n,double guess,double tolerance) {
		if(n==0) {
			return 0;
		}
		else if(Math.abs(Math.pow(guess,2)/n-1)<tolerance/100){
			return guess;
		}
		else {
			guess=((n/guess)+guess)/2;
			return sqrtHelp(n,guess,tolerance);
		}
	}
  public static double sqrt(double n,double tolerance) {
		return sqrtHelp(n,n/2,tolerance);
	}
  public static void main(String[]args){
    System.out.println(sqrt(0.04,0.0001));
		System.out.println(sqrt(4,0.01));
  }
}
