package de.hdm_stuttgart.mi.sd1.summingUpIntegerArray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
   /**
    * empty list
    */
   @Test
   public void testEmptyList() {
       Assert.assertEquals("0", App.prettifyOutput(new int[0]));
   }
   /**
    * single positive value
    */
   @Test
   public void testSinglePositive() {
       Assert.assertEquals("45", App.prettifyOutput(new int[]{45}));
   }
   /**
    * single zero
    */
   @Test
   public void testSingleZero() {
       Assert.assertEquals("0", App.prettifyOutput(new int[]{0}));
   }
   /**
    * single negative
    */
   @Test
   public void testSingleNegative() {
       Assert.assertEquals("-13", App.prettifyOutput(new int[]{-13}));
   }
   /**
    * two positive
    */
   @Test
   public void testTwoPositive() {
       Assert.assertEquals("1+56=57", App.prettifyOutput(new int[]{1,56}));
   }
   /**
    *  Two first Positive
    */
   @Test 
   public void testTwoFirstPositive() {
       Assert.assertEquals("1-17=-16", App.prettifyOutput(new int[]{1, -17}));
   }
   /**
    *  First negative
    */
   @Test
   public void testTwoFirstNegative() {
       Assert.assertEquals("5-3=2", App.prettifyOutput(new int[]{-3,5}));
   }
   /**
    *  Both negative
    */
   @Test
   public void testTwoBothNegative() {
       Assert.assertEquals("-2-3=-5", App.prettifyOutput(new int[]{-2, -3}));
   }
   /**
    *  Both negative and zero
    */
   @Test
   public void testTwoNegativeZero() {
       Assert.assertEquals("-2", App.prettifyOutput(new int[]{-2, 0}));
   }
   /**
    *  Both zero and negative
    */
   @Test
   public void testTwoZeroNegative() {
       Assert.assertEquals("-2", App.prettifyOutput(new int[]{0, -2}));
   }
   /**
    *  positive positive zero
    */
   @Test
   public void testPositivePositiveZero() {
       Assert.assertEquals("1+44=45", App.prettifyOutput(new int[]{1, 44, 0}));
   }
   /**
    *  Negative zero
    */
   @Test
   public void testThreeNegativeZero() {
       Assert.assertEquals("33-1=32", App.prettifyOutput(new int[]{-1, 0, 33}));
   }
   /**
    *  
    */
   @Test
   public void testThreeZeroZeroNegative() {
       Assert.assertEquals("-3", App.prettifyOutput(new int[]{0, 0, -3}));
   }
   /**
    *  
    */
   @Test
   public void testThreeAllZero() {
       Assert.assertEquals("0", App.prettifyOutput(new int[]{0, 0, 0}));
   }
}
