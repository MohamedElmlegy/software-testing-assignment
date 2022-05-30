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
import java.util.Arrays;

public class statistics_operation {
    private int [] arr ;
    private arithmetic_operation a ;
    
    public statistics_operation(){
        this.a = new arithmetic_operation() ;
    }
    public statistics_operation(int [] array){
        this.arr = array ;
        this.a = new arithmetic_operation() ;
    }
    public double getMean (int [] array){
        this.arr = array ;
        return ((a.sigma_cx_pwr_p(0,arr.length-1,1,arr,1))/arr.length);
    }
    public double getMean (){
        return ((a.sigma_cx_pwr_p(0,arr.length-1,1,arr,1))/arr.length);
    }
    public double getMedian(int [] array){
        this.arr = array ;
        Arrays.sort(arr);
        switch(arr.length%2) {
            case 1 :
                return (arr[arr.length/2]);
            case 0 : 
                return ((double)(arr[arr.length/2]+arr[(arr.length/2)-1])/2);
            default: 
                return 0;
        }
    }
    public double getMedian(){
        Arrays.sort(arr);
        switch(arr.length%2) {
            case 1 :
                return (arr[arr.length/2]);

            case 0 : 
                return ((double)(arr[arr.length/2]+arr[(arr.length/2)-1])/2);
                
            default: 
                return 0; 
        }
    }
    public List<Integer> getMode(int [] array){
        this.arr = array ;
        int target = 0 ;
        int maxTarget = -1 ;
        List<Integer> e = new ArrayList<Integer>() ;
        HashMap<Integer, Integer> map = new HashMap<>();
         
        for (int element : arr) {   
            if(map.get(element) == null){
                map.put(element, 1);
            }
            else{
                map.put(element, map.get(element)+1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            target = entry.getValue();
            if(target > maxTarget) {
                maxTarget = target ;
            }
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            target = entry.getValue();
            int key = entry.getKey();
            if(target == maxTarget) {
                e.add(key);
            }
        }
        return e ;
    }
    
    public List<Integer> getMode(){
        int target = 0 ;
        int maxTarget = -1 ;
        List<Integer> e = new ArrayList<Integer>() ;
        HashMap<Integer, Integer> map = new HashMap<>();
         
        for (int element :  arr ) {   
            if(map.get(element) == null){
                map.put(element, 1);
            }
            else{
                map.put(element, map.get(element)+1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            target = entry.getValue();
            if(target > maxTarget) {
                maxTarget = target ;
            }
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            target = entry.getValue();
            int key = entry.getKey();
            if(target == maxTarget) {
                e.add(key);
            }
        }
        return e ;
    }
    public List<Integer> getQuartiles (int [] array){
        List<Integer> e = new ArrayList<Integer>() ;
        if (array == null || array.length == 0)
            return e;
        this.arr = array ;
        Arrays.sort(arr);
        int q2 = arr.length/2 ;
        int q1 = q2 / 2 ;
        int q3 = arr.length - q2 + q1 ;
        e.add(arr[q1]);
        e.add(arr[q2]);
        e.add(arr[q3]);
        return e ;
    }
    public List<Integer> getQuartiles (){
        List<Integer> e = new ArrayList<Integer>() ;
        if (this.arr == null || this.arr.length == 0)
            return e;
        Arrays.sort(arr);
        int q2 = arr.length/2 ;
        int q1 = q2 / 2 ;
        int q3 = arr.length - q2 + q1 ;
        e.add(arr[q1]);
        e.add(arr[q2]);
        e.add(arr[q3]);
        return e ;
    }
    public int getMax(int [] array){
        this.arr = array ;
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public int getMax(){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public int getMin(int [] array){
        this.arr = array ;
        Arrays.sort(arr);
        return arr[0];
    }
    public int getMin(){
        Arrays.sort(arr);
        return arr[0];
    }
    public List<Integer> getRange(int [] array){
        this.arr = array ; 
        List<Integer> e = new ArrayList<Integer>() ;
        e.add(getMin(arr));
        e.add(getMax(arr));
        
        return e ;
    }
    public List<Integer> getRange(){
        List<Integer> e = new ArrayList<Integer>() ;
        e.add(getMin(arr));
        e.add(getMax(arr));
        
        return e ;
    }
    public String list_to_string(List<Integer> l){
        String s ="" ;
        for(int i = 0 ; i <l.size();i++){
            s=s+"  " +Integer.toString(l.get(i));
        }
        
        return s ;
    }
    public int getInterquartileRange (int [] array){
        if (array == null || array.length == 0)
            return -1;
        this.arr = array ; 
        List<Integer> e = new ArrayList<Integer>() ;
        e = getQuartiles(arr) ;
        return e.get(2)- e.get(0);
    }
    public int getInterquartileRange (){
        if (this.arr == null || this.arr.length == 0)
            return -1;
        List<Integer> e = new ArrayList<Integer>() ;
        e = getQuartiles(arr) ;
        return e.get(2)- e.get(0);
    }
    public List<Integer> getOutliers(int [] array){
        this.arr = array ; 
        List<Integer> e = new ArrayList<Integer>() ;
        e = getQuartiles(arr) ;
        double upper_fence = e.get(2) + 1.5* getInterquartileRange(arr);
        double lower_fence = e.get(0) - 1.5* getInterquartileRange(arr);
        e.remove(2);
        e.remove(1);
        e.remove(0);
        for (int i : arr){
            if (i>upper_fence || i < lower_fence){
                e.add(i);
            }
        }
        return e ;
    }
    public List<Integer> getOutliers(){
        List<Integer> e = new ArrayList<Integer>() ;
        e = getQuartiles(arr) ;
        double upper_fence = e.get(2) + 1.5* getInterquartileRange(arr);
        double lower_fence = e.get(0) - 1.5* getInterquartileRange(arr);
        e.remove(2);
        e.remove(1);
        e.remove(0);
        for (int i : arr){
            if (i>upper_fence || i < lower_fence){
                e.add(i);
            }
        }
        return e ;
    }
}