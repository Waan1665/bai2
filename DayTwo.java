/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daytwo;

public class DayTwo {
    
    public static long getTotalpoints(long level, long BONUS, long points){
        long totalpoints;
        if((level >= 1) || (level <= 5)) {
            
            totalpoints = points + (long)(Math.sqrt(level))*BONUS;
            System.out.println("Total points:" + totalpoints);
        return totalpoints;
        } else{
            System.out.println("Khong thuc hien");
            return -1;            
        }               
    }
    public static long getTotalpoints(long level, long points){
        final long BONUS = 100;
        return getTotalpoints(level, BONUS, points);                
    }
    
       
    public static void main(String[] args) {                       
        long level;
        long points;
        final long BONUS = 100;
        long totalpoints = 0;
        int x;
        for(level=1;level<=5;level++){
            points=100;
            System.out.println("Level:" + level);
            for(x=0;x<=3;x++){
                System.out.println("Points:" + points);
                //getTotalpoints(level,BONUS,points)
                getTotalpoints(level,points);
                points+=100;
            }                         
        }
        
        
        Person ahus = new Person("My Name", 25, "hq@hus.edu.vn", 'F');
        System.out.println("Name:" + ahus.getName());
        System.out.println("Age:" + ahus.getAge());
        System.out.println("email:" + ahus.getEmailAddress());
        System.out.println("Gender:" + ahus.getGender());
        
        Person ahus1 = new Person("defaultName", 20, "defaultEmail", 'M');
        System.out.println("Name:" + ahus1.getName());
        System.out.println("Age:" + ahus1.getAge());
        System.out.println("email:" + ahus1.getEmailAddress());
        System.out.println("Gender:" + ahus1.getGender());
        
        
        
       
        
       
        
        
        
    }
     
    
    
}
