package de.hdm_stuttgart.mi.sd1.AnalyzingFilePaths;

public class FileMetaInfo {

	boolean isRelative;
	String drive;
	String path;
	String basename;
	String extension;


	public FileMetaInfo(String Path) {


		if (Path.contains("\\") && Path.contains(":")) {

			String parts[] = Path.split("\\\\");

			drive = parts[0];

			isRelative = false;

			if (!(Path.contains("."))) {
				StringBuffer tempPath = new StringBuffer();
				for (int y=1; y< (parts.length) ; y++)
				{
					tempPath.append(parts[y]);

					if (!(y==parts.length-1))
					{
						tempPath.append("\\");
					}
					else
					{

					}
					path = tempPath.toString();
				}
				
			}
			else {
				
			}



			if (Path.contains(".")) {
				
				StringBuffer tempPath = new StringBuffer();
				for (int y=1; y< (parts.length-1) ; y++)
				{
					tempPath.append(parts[y]);

					if (!(y==parts.length-2))
					{
						tempPath.append("\\");
					}
					else
					{

					}
					path = tempPath.toString();
				}
				

				String file[]= parts[parts.length - 1].split("\\.");
				basename = file[0];
				extension = "." + file[1];
			}
			else {
				basename = null;
				extension = null;
			}

		} 
		else 
		{

		}


		if (Path.contains("/")) {

			String parts[] = Path.split("/");

			drive = null;


			StringBuffer tempPath = new StringBuffer();
			for (int y=0; y< (parts.length-1) ; y++)
			{
				tempPath.append(parts[y]);

				if (!(y==parts.length-2))
				{
					tempPath.append("/");	
				}
				else
				{

				}



			}
			path = tempPath.toString();


			String file[]= parts[parts.length - 1].split("\\.");

			basename = file[0];

			if (Path.contains(".") && file.length > 1)
			{
				extension = "." + file[1];	
			} else
			{
				extension = null;
			}

			if (Path.contains("../"))
			{
				isRelative = true;
			}
			else
			{
				isRelative = false;
			}

		}




	}




}


