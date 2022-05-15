/**
 * 
 */

/**
 * @author Dell
 *
 */
import java.util.HashMap;
import java.io.*;
import java.util.*;  
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

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
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error Dialog");
			alert.setHeaderText(null);
			alert.setContentText("the denominator cannot be zero!\nignor the result shown and try again!. ");
			alert.showAndWait();  
			
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
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Error Dialog");
				alert.setHeaderText(null);
				alert.setContentText("the result is too big!\ncannot solve. ");
				alert.showAndWait();  
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
		if(a<0){
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error Dialog");
			alert.setHeaderText(null);
			alert.setContentText("There is no Factorial for negative numbers!");
			alert.showAndWait();  
			return -1 ;
		}
		while (a>0) {
			previous_result = result;
			result = (result * a) ;
			a-- ;
			if (result < previous_result) {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Error Dialog");
				alert.setHeaderText(null);
				alert.setContentText("the result is too big!\ncannot solve. ");
				alert.showAndWait();  
				return 0;
			}
		}
		return result;
	}
	public double sigma_cx_pwr_p (int i , int n ,int c , int [] x , int p) {
		double result = 0 ;
		if(i<0){
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error Dialog");
			alert.setHeaderText(null);
			alert.setContentText("the start index cannot be negative!\ncannot solve. ");
			alert.showAndWait();  
			return 0;
		}
		else if (n<i){
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error Dialog");
			alert.setHeaderText(null);
			alert.setContentText("the end index cannot be less than the starting index!\ncannot solve. ");
			alert.showAndWait();  
			return 0;
		}
		else if (n>x.length || i < x.length){
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error Dialog");
			alert.setHeaderText(null);
			alert.setContentText("the indexes given cannot be used on the data as there is overflow!\ncannot solve. ");
			alert.showAndWait();  
			return 0;
		}
		else {
			for ( int j = i  ; j <= n ; j++ ) {
				result = result + Math.pow( x[j] , p )  ;
			}
			return result* c;
		}
		
	} 
	public double sigma_ci_pwr_p (int i , int n ,int  c ,  int p) {
		double result = 0 ;
		if(i<0){
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error Dialog");
			alert.setHeaderText(null);
			alert.setContentText("the start index cannot be negative!\ncannot solve. ");
			alert.showAndWait();  
			return 0;
		}
		else if (n<i){
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error Dialog");
			alert.setHeaderText(null);
			alert.setContentText("the end index cannot be less than the starting index!\ncannot solve. ");
			alert.showAndWait();  
			return 0;
		}
		
		else {
			while (  i <= n ) {
				
				result = result + Math.pow(i, p)  ;
				i++;
			}
			return result * c;
		}
	} 
}
