package de.hdm_stuttgart.mi.sd1.AnalyzingFilePaths;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class MetaInfoUnixTest {
	   
	   static private final boolean isWindows = System.getProperty("os.name").startsWith("Windows");
	   
	   @Test
	   public void testAbsoluteWithoutExtension() {
	       Assume.assumeFalse(isWindows);
	       
	       final FileMetaInfo fmi = new FileMetaInfo("/usr/openvpn/hdm");
	       
	       Assert.assertFalse(fmi.isRelative);
	       Assert.assertEquals(null, fmi.drive);
	       Assert.assertEquals("/usr/openvpn", fmi.path);
	       Assert.assertEquals("hdm", fmi.basename);
	       Assert.assertEquals(null, fmi.extension);
	   }

	   @Test
	   public void testAbsoluteWithExtension() {
	       Assume.assumeFalse(isWindows);
	       
	       final FileMetaInfo fmi = new FileMetaInfo("/usr/openvpn/hdm.conf");
	       
	       Assert.assertFalse(fmi.isRelative);
	       Assert.assertEquals(null, fmi.drive);
	       Assert.assertEquals("/usr/openvpn", fmi.path);
	       Assert.assertEquals("hdm", fmi.basename);
	       Assert.assertEquals(".conf", fmi.extension);
	   }

	   @Test
	   public void testRelativeWithoutExtension() {
	       Assume.assumeFalse(isWindows);
	       
	       final FileMetaInfo fmi = new FileMetaInfo("../Desktop/icon");
	       
	       Assert.assertTrue(fmi.isRelative);
	       Assert.assertEquals(null, fmi.drive);
	       Assert.assertEquals("../Desktop", fmi.path);
	       Assert.assertEquals("icon", fmi.basename);
	       Assert.assertEquals(null, fmi.extension);
	   }

	   @Test
	   public void testRelativeWithExtension() {
	       Assume.assumeFalse(isWindows);
	       
	       final FileMetaInfo fmi = new FileMetaInfo("../../Desktop/icon.gif");
	       
	       Assert.assertTrue(fmi.isRelative);
	       Assert.assertEquals(null, fmi.drive);
	       Assert.assertEquals("../../Desktop", fmi.path);
	       Assert.assertEquals("icon", fmi.basename);
	       Assert.assertEquals(".gif", fmi.extension);
	   }
	}