package de.hdm_stuttgart.mi.sd1.RoutingNavigation;

public class Driver {
   /**
    * @param args unused
    */
   public static void main(String[] args) {
      
      final Segment[] route = new Segment[] {
            new Segment(2.4, 50)
            ,new Segment(5, 100)
            ,new Segment(3.1, 50)
            ,new Segment(0.8, 30)
      };
      
 
      final long fullMinutes = Segment.duration(route, 100);
      
      System.out.println("Minimal duration:" + fullMinutes); 
}
}