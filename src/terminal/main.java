package terminal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		   File myFolder = new File("data");
		   File[] myfile = myFolder.listFiles();
		   System.out.println(myFolder.getAbsolutePath());
		   
		   ArrayList<bar>allbars = new ArrayList<bar>();
		   
		    //Read file end print to console
		   for(int i=0; i<myfile.length; i ++)
		   {
		    	String para = myfile[i].getName();
		    	System.out.println("file name: " + para);
			   try (BufferedReader br = new BufferedReader(new FileReader(myfile[i])))
				{
			    	String str;
			    	while((str=br.readLine())!=null)
			    	{      
			    		bar newBar = new bar();			    		
			    		String[] partsOfLine = str.split(",");	
						
			    		for(int j = 0; j<partsOfLine.length; j++){
			    			if(j == 0){
			    				newBar.setYear(Integer.valueOf(partsOfLine[0].substring(0,4)));
			    				newBar.setMonth(Integer.valueOf(partsOfLine[0].substring(5,7)));
			    				newBar.setDay(Integer.valueOf(partsOfLine[0].substring(8,partsOfLine[0].length())));					
			    			} 
			    			if(j == 1){
			    				String[] timeParts = partsOfLine[j].split(":");
			    				newBar.setHour(Integer.valueOf(timeParts[0]));
			    				newBar.setMinute(Integer.valueOf(timeParts[1]));
			    			} 
			    			if(j == 2) newBar.setopeningPrice(Double.valueOf(partsOfLine[j]));		
			    			if(j == 3) newBar.setmaximalPrice((Double.valueOf(partsOfLine[j])));		
			    			if(j == 4) newBar.setminimalPrice(Double.valueOf(partsOfLine[j]));		
			    			if(j == 5) newBar.setclosingPrice(Double.valueOf(partsOfLine[j]));			
			    			if(j == 6) newBar.setvolume(Integer.valueOf(partsOfLine[j]));
			    		}
			    		allbars.add(newBar);
			    	}
				}
			 	catch(IOException ex) {System.out.println("Error: " +ex.getMessage());}
		   }  			
	}
}
