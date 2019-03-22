package television;

/**
 *
 * @author 114377
 */

public class Television {
    
    private boolean isSwitchedOn; // either true or false
    private int volume; // from 0 to 10
    private double frequency; // from 535 to 1605 Mhz

   public boolean setvolume(int vol){
       boolean flag;
       if(vol >= 0 && vol <= 10){
           volume = vol;
           flag = true;
       }
       else{  
           System.out.println("Error! Volume should be between 0 and 10.");
           flag = false;
       }
       return flag;
   }
   
   public boolean setfrequency(int freq){
       boolean flag;
       if(freq >= 535 && freq <= 1605){
           frequency = freq;
           flag = true;
       }
       else{  
           System.out.println("Error! Kindly set the frequency between 535 to 1605 Mhz");
           flag = false;
       }
       return flag;
   }
    
    public static void main(String[] args) {
     Television VON = new Television();
     System.out.println(VON.setvolume(15));
     System.out.println(VON.setfrequency(1200));
    }
    
}
