package terminal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<bar> bars = new ArrayList();
		
		File []fList; 
		File F = new File("data\\");
		fList = F.listFiles();
		
		for(int i=0; i<fList.length; i++)           
		{
		     if(fList[i].isFile())
		     {
		    	 System.out.println("���� " + String.valueOf(i) + ": " + fList[i].getName());
		    	 
		    	 try (BufferedReader br = new BufferedReader(new FileReader(F)))
		 		{
		 		    String s;
		 		   // Bar mybars[] = new Bar[bar_count];
		 		    int j = 0;
		 		    while((s=br.readLine())!=null)
		 		    {      
		 		    	//mybars[i] = new Bar(i,s);
		 		        j++;
		 		    }
		 		    
		 		   
		 		    
		 		    String para = F.getName();
		 		    		
		 			System.out.println("LENTA> file: " + para);
		 		    System.out.println("LENTA> lines: " + j);
		 		    
		 		}
		 		 catch(IOException ex){       
		 		    System.out.println("������: " +ex.getMessage());
		 		} 
		    	 
		    	 
		     }
		}
		
	//	bars.add();

	}

}
