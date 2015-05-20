package de.hdm_stuttgart.mi.sd1.AnalyzingFilePaths;


public class AnalyzingFilePaths {
    
	    public static void main( String[] args ) {
	       final FileMetaInfo fmi = new FileMetaInfo("/usr/share/gpa/gpa-logo.ppm");
	       
	       System.out.println("Filename is relative? " + fmi.isRelative);
	       System.out.println("Drive letter:" + fmi.drive);
	       System.out.println("Directory path: " + fmi.path);
	       System.out.println("File basename: " + fmi.basename);
	       System.out.println("File extension: " + fmi.extension);
	    }
	}
      
        
   
    

