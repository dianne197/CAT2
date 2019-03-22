package series;

/**
 *
 * @author 114377
 */

public class Series {
   private String title;
   private String studio;
   private String rating;
   
   public Series(String stitle,String sstudio, String sratings){
       title = stitle;
       studio = sstudio;
       rating = sratings;
   } 
   
   public Series(String stitle,String sstudio){

       title = stitle;
       studio = sstudio;
       rating = "PG";
   } 
   public String gettitle(){
       return title;
   }
   public String getstudio(){
       return studio;
   }
   public String getrating(){
       return rating;
   }

    public static void main(String[] args) {
        // TODO code application logic here
        Series Claws = new Series("Casino Royale", "Eon Productions", "PG13");
        System.out.println("series Title: " +  Claws .gettitle());
        System.out.println("series Studio: " +  Claws .getstudio());
        System.out.println("series Ratings: " +  Claws .getrating());
    }
    
}
