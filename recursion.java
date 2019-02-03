import java.util.ArrayList;
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
  public static boolean makeAllSums(int n,int sum,ArrayList<Integer> result){
    if(n==0) {
    // System.out.println(sum);
     result.add(sum);
     return  false;

    }
    else {
      return makeAllSums(n-1,sum+n,result) || makeAllSums(n-1,sum,result);
    }

  }
  public static ArrayList<Integer> makeAllSums(int n){
    ArrayList<Integer> result= new ArrayList<Integer>();
    makeAllSums(n,0,result);
    return result;
  }
  public static void main(String[]args){
    System.out.println(sqrt(0.04,0.0001));
		System.out.println(sqrt(4,0.01));
    ArrayList<Integer>a= new ArrayList<Integer>();
    makeAllSums(3,0,a);
    System.out.println(makeAllSums(3));
  }
}
