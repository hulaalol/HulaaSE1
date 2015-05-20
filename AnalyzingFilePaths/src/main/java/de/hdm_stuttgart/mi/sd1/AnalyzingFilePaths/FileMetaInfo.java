package de.hdm_stuttgart.mi.sd1.AnalyzingFilePaths;

public class FileMetaInfo {

	String isRelative;
	String drive;
	String path;
	String basename;
	String extension;
	
	
	
	

	public FileMetaInfo(String Path) {
		
		
		if (Path.contains("\\") && Path.contains(":")) {
			
			String parts[] = Path.split("\\\\");
			
			drive = parts[0];
			
			isRelative = "yes";
			
			
			StringBuffer tempPath = new StringBuffer();
			for (int y=1; y< (parts.length-1) ; y++)
			{
				tempPath.append(parts[y]);
				tempPath.append("\\");
				path = tempPath.toString();
			}
			
			String file[]= parts[parts.length - 1].split("\\.");
			
			basename = file[0];
			extension = "." + file[1];

			
		} else {}
		
		if (Path.contains("/")) {
			
			String parts[] = Path.split("\\//");
			
			isRelative = "no";
			
			drive = null;
			
			
			StringBuffer tempPath = new StringBuffer();
			for (int y=1; y< (parts.length-1) ; y++)
			{
				tempPath.append(parts[y]);
				tempPath.append("//");
				path = tempPath.toString();
			}
			
			String file[]= parts[parts.length - 1].split("\\.");
			
			basename = file[0];
			extension = "." + file[1];
		}

		
	

	}
	
	
		

	}


