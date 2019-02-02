public class recursion{
  public static double sqrtHelp(double n,double guess) {
		if(n==0) {
			return 0;
		}
		else if(Math.abs(Math.pow(guess,2)/n-1)<0.00001){
			return guess;
		}
		else {
			guess=((n/guess)+guess)/2;
			return sqrtHelp(n,guess);
		}
	}
}
