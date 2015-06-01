package de.hdm_stuttgart.mi.sd1.AnalyzingFilePaths;


public class AnalyzingFilePaths {
    
	    public static void main( String[] args ) {
	    	
	    	// Linux
	       final FileMetaInfo fmilinux = new FileMetaInfo("/usr/share/gpa/gpa/gpa-logo.ppm");
	       System.out.println("Filename is relative? " + fmilinux.isRelative);
	       System.out.println("Drive letter:" + fmilinux.drive);
	       System.out.println("Directory path: " + fmilinux.path);
	       System.out.println("File basename: " + fmilinux.basename);
	       System.out.println("File extension: " + fmilinux.extension);
	       
	       
	       System.out.print("\n");
	       
	       // Windows
	       final FileMetaInfo fmiwindows = new FileMetaInfo("C:\\users\\heinz\\Desktop\\index");
	       System.out.println("Filename is relative? " + fmiwindows.isRelative);
	       System.out.println("Drive letter: " + fmiwindows.drive);
	       System.out.println("Directory path: " + fmiwindows.path);
	       System.out.println("File basename: " + fmiwindows.basename);
	       System.out.println("File extension: " + fmiwindows.extension);
	    }
	}
      
        
   
    

