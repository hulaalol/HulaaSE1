package de.hdm_stuttgart.mi.sd1.RoutingNavigation;
public class Segment {
   
   /**
    * Indication a segment does not have any speed limit.
    */
   static public final int NO_SPEED_LIMIT = 0;

   /**
    * The distance of the current leg in km.
    */
   public final double distance;
   
   /**
    * The current leg's speed limit in km / h. 
    */
   public final int speedLimit;
   
   /**
    * Creating an (immutable) leg
    * @param distance {@link #distance}
    * @param speedLimit {@link #speedLimit}
    */
   public Segment(final double distance, final int speedLimit) {
      this.distance = distance;
      this.speedLimit = speedLimit;
   }
   
   /**
    * Minimal time required when consequently traveling with the minimum of
    * official speed limits and the driver's personal maximum speed. If a
    * leg does not have any speed limit the value of personalSpeedLimit will
    * be used for calculation instead.
    * 
    * @param route The array of segments composing a route.
    * 
    * @param personalSpeedLimit The drivers personal speed limit whether or 
    *        not official limits apply. Must be greater than 0.
    * 
    * @return The minimal duration in (rounded) minutes with respect to all
    *         speed limits. Must be a positive (non-zero) value.
    */
   static public long duration(Segment[] route, int personalSpeedLimit) {
      
	   
	   double duration = 0;
	   for (int i = 0; i<route.length ; i++)
	   {
		   if (personalSpeedLimit < route[i].speedLimit)
		   {
			   duration += (route[i].distance / personalSpeedLimit)*60;
		   } else
		   {
			   duration += (route[i].distance / route[i].speedLimit)*60; 
		   }
		   
	   }
	   return (long) duration;
	   
	   
   }
   
   
}