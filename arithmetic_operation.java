/**
 * 
 */

/**
 * @author Dell
 *
 */
public class arithmetic_operation {
	public double addition (double a , double b) {
		return a+b;
	}
	public double subtraction (double a , double b) {
		return a-b;
	}
	public double multiplication (double a , double b) {
		return a*b;
	}
	public double division  (double a , double b) {
		if (b != 0 ) {
			return a /b ;
		}
		else {
			System.out.println("the denominator cannot be zero") ;
			System.out.println("ignor the result shown and try again!") ;
			
			return 0 ;
		}
	}
	public double tothepower (double a , double b) {
		return Math.pow(a, b);
	}
	public long bigpower (double a , double b) {
		long result = 1  ;
		long previous_result ; 
		for (int i =1 ; i <= b ; i ++) {
			previous_result = result ;
			result = (long) (result * a) ;
			if (result < previous_result ) {
				System.out.println("the result is too big! ");
				System.out.println("cannot solve ");
				return 0;
			}
		}
		return result;
	}
	public double logarthim (double a , double b) {
		return (Math.log10(a)/Math.log10(b));
	}
	public long factorial (long a) {
		long result = 1 ;
		long previous_result = 1;
		while (a>0) {
			previous_result = result;
			result = (result * a) ;
			a-- ;
			if (result < previous_result) {
				System.out.println("the result is too big! ");
				System.out.print("cannot solve ");
				return 0;
			}
		}
		return result;
	} 
	public double segma_cx_pwr_p (int i , int n ,int c , int [] x , int p) {
		double result = 0 ;
		for ( int j = i  ; j <= n ; j++ ) {
			
			result = result + Math.pow( x[j] , p )  ;
		}
		return result* c;
	} 
	public double segma_ci_pwr_p (int i , int n ,int  c ,  int p) {
		double result = 0 ;
		for ( int j = i  ; j <= n ; i++ ) {
			
			result = result + Math.pow(i, p)  ;
			
		}
		return result * c;
	} 
}
