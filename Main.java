/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.HashMap;
import java.io.*;
import java.util.*;  
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);
	    int i ;

		System.out.println("good day,sir");
		
		
		do{ 
		    System.out.println("do you need any help in your task?");
		    System.out.println(" 1- yes i need help in some statistics ");
		    System.out.println(" 2- yes i need help in simple arithmetic operations.... i forgot my calculator at home ");
		    System.out.println(" 3- exit the program");
		    System.out.println(" type in the console either 1 , 2 or 3 ");
		    i = myObj.nextInt();
	    	if (i == 1 ){
	    	    int counter ;
	    	    int e ;
	    	    int y ;
	    	    System.out.println(" please enter the number of the data elements  ");
	    	    counter = myObj.nextInt();
	    	    int a [] = new int[i];
	    	    System.out.println(" please enter the data elements one by one  ");
	    	    for (int j = 0 ; j < counter ; j++){
	    	        e = myObj.nextInt();
	    	        a[j] = e ;
	    	    }
	    	    do{
	    	        statistics_operation statistics = new statistics_operation() ;
	    	        System.out.println(" what type of statistics operation do you need?  ");
	    	        System.out.println(" 1- calculating the mean of the data");
	    	        System.out.println(" 2- calculating the median of the data");
	    	        System.out.println(" 3- calculating the mode of the data");
	    	        System.out.println(" 4- finding the range of the data");
	    	        System.out.println(" 5- finding the minimum value of the data");
	    	        System.out.println(" 6- finding the maximum value of the data");
	    	        System.out.println(" 7- finding the Quartiles of the data");
	    	        System.out.println(" 8- calculating the Interquartile Range of the data");
	    	        System.out.println(" 9- finding the outliers in the data");
	    	        System.out.println(" 10- exit the program");
	    	        System.out.println(" type in the console the number of the operation you require");
	    	        y = myObj.nextInt();
                    switch(y){
                        case 1:
                            System.out.println(statistics.getMean(a));
                            break;
                        case 2:
                            System.out.println(statistics.getMedian(a));
                            break;
                        case 3:
                            System.out.println(statistics.getMode(a));
                            break;
                        case 4:
                            System.out.println(statistics.getRange(a));
                            break;
                        case 5:
                            System.out.println(statistics.getMin(a));
                            break;
                        case 6:
                            System.out.println(statistics.getMax(a));
                            break;
                        case 7:
                            System.out.println(statistics.getQuartiles(a));
                            break;
                        case 8:
                            System.out.println(statistics.getInterquartileRange(a));
                            break;
                        case 9:
                            System.out.println(statistics.getOutliers(a));
                            break;
                        case 10:
                            return;
                        default: System.out.println("you should choose again");
                    }
	    	    }while (y < 1 || y > 10);
	    	}
	    	else if (i == 2 ){
	    	    arithmetic_operation arithmetic = new arithmetic_operation() ;
	    	    int counter ;
	    	    int e ;
    	    	int y ;
	    	    do {
	    	        
    	    	    System.out.println(" please choose which arithmetic oeration you want to use  ");
    	    	    System.out.println(" 1- addition  ");
    	    	    System.out.println(" 2- subtraction  ");
    	    	    System.out.println(" 3- multiplication  ");
    	    	    System.out.println(" 4- division  ");
    	    	    System.out.println(" 5- x to the power of y  ");
    	    	    System.out.println(" 6- x to the power of y ( can calculate bigger numbers)  ");
    	    	    System.out.println(" 7- factorial  ");
    	    	    System.out.println(" 8- log a to the base of b  ");
    	    	    System.out.println(" 9- sigma from i to n c(i) to the power of p ");
    	    	    System.out.println(" 10- sigma from i to n c(x) to the power of p ");
    	    	    System.out.println(" 11- exit the program");
    	    	    System.out.println(" type in the console the number of the operation you require");
    	    	    y = myObj.nextInt();
                    switch(y){
                        case 1:
                            System.out.println("enter a and b");
                            int x, z;
                            x = myObj.nextInt();
                            z = myObj.nextInt();
                            System.out.println("the result is");
                            System.out.println(arithmetic.addition(x , z ));
                            break;
                        case 2:
                            System.out.println("enter a and b");
                      //      int x, z;
                            x = myObj.nextInt();
                            z = myObj.nextInt();
                            System.out.println("the result is");
                            System.out.println(arithmetic.subtraction(x,z));
                            break;
                        case 3:
                            System.out.println("enter a and b");
                      //      int x, z;
                            x = myObj.nextInt();
                            z = myObj.nextInt();
                            System.out.println("the result is");
                            System.out.println(arithmetic.multiplication(x,z));
                            break;
                        case 4:
                            System.out.println("enter a and b");
                      //      int x, z;
                            x = myObj.nextInt();
                            z = myObj.nextInt();
                            System.out.println("the result is");
                            System.out.println(arithmetic.division(x,z));
                            break;
                        case 5:
                            System.out.println("enter x and n");
                           int  n;
                            x = myObj.nextInt();
                            n = myObj.nextInt();
                            System.out.println("the result is");
                            System.out.println(arithmetic.tothepower(x,n));
                            break;
                        case 6:
                            System.out.println("enter x and n");
                       //     int x, n;
                            x = myObj.nextInt();
                            n = myObj.nextInt();
                            System.out.println("the result is");
                            System.out.println(arithmetic.bigpower(x,n));
                            break;
                        case 7:
                            System.out.println("enter x");
                             x = myObj.nextInt();
                            System.out.println(arithmetic.factorial(x));
                            break;
                        case 8:
                            System.out.println("enter a and b");
                        //    int x, z;
                            x = myObj.nextInt();
                            z = myObj.nextInt();
                            System.out.println("the result is");
                            System.out.println(arithmetic.logarthim(x,z));
                            break;
                        case 9:
                            System.out.println("enter the start and end and the coefficient and the power of the elements");
                            int start, end,c,p;
                            start = myObj.nextInt();
                            end = myObj.nextInt();
                            c = myObj.nextInt();
                            p = myObj.nextInt();
                            System.out.println("the result is");
                            System.out.println(arithmetic.sigma_ci_pwr_p(start,end,c,p));
                            break;
                        case 10:
                            System.out.println("enter the start and end and the coefficient and the power of the elements");
                          //  int start, end,c,p;
                            start = myObj.nextInt();
                            end = myObj.nextInt();
                            c = myObj.nextInt();
                            p = myObj.nextInt();
                            System.out.println(" please enter the number of the data elements  ");
    	    	            counter = myObj.nextInt();
    	    	            int a [] = new int[i];
    	    	            System.out.println(" please enter the data elements one by one  ");
    	    	            for (int j = 0 ; j < counter ; j++){
    	    	                e = myObj.nextInt();
    	    	                a[j] = e ;
    	    	            }
                            System.out.println("the result is");
                            System.out.println(arithmetic.sigma_cx_pwr_p(start,end,c,a,p));
                            break;
                        case 11:
                            return;
                            default: System.out.println("you should choose again");
                            
                        }
	    	    }while (y < 1 || y > 11);
	    	    }
	    	else {
	    	    return;
	    	}
		}while (i < 1||  i > 3 );
	}
"سلام عليكم"
}
