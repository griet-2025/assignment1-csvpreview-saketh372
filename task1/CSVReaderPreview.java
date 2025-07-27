package task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReaderPreview {

    public static void main(String[] args) {
        // TO DO: Write your code below 
        String filePath = "dataset/dataset.csv";
        try
        {
        	BufferedReader br=new BufferedReader(new FileReader(filePath));
        	String header=br.readLine();
        	if(header==null)
        	{
        		System.out.println("The CSV file is empty.");
        		return;
        	}
        	System.out.println("=== Data Preview ===\n");
        	String[] hcarr=header.split(",");
        	System.out.println("Columns:");
        	for(String i:hcarr)
        	{
        		System.out.print(i+" ");
        	}
        	System.out.println();
        	System.out.println("Total Columns:"+hcarr.length);
        	System.out.println();
        	System.out.println("First 5 Records:");
        	System.out.println();
        	int c=0;
        	String row;
        	while((row=br.readLine())!=null &&(c<5))
        	{
        		String[]  arr=row.split(",");
        		for(String i:arr)
        		{
        			System.out.print(i+" ");
        		}
        		System.out.println();
        	}
           System.out.println();
           while(br.readLine()!=null)
           {
        	   c++;
           }
           System.out.println("Total Records (excluding header):"+c);
        }
           catch(IOException e)
           {
        	   System.out.println("An error occured while reading file");
           }
        
    }
}
