package Logics;
import java.io.*;
public class ReadLinesWordsCharactersInString {

	public static void main(String[] args) {
		int countWord = 0; 
        int characterCount = 0; 
        int paragraphCount = 1; 
        int whitespaceCount = 0; 
		
		try {
			FileReader fr=new FileReader("/home/pravinms/Desktop/read.txt");
			BufferedReader reader=new BufferedReader(fr);
			String line=reader.readLine();
			while((line = reader.readLine()) != null) 
	        { 
	            if(line.equals("")) 
	            { 
	                paragraphCount++; 
	            } 
	            if(!(line.equals(""))) 
	            { 
	                  
	                characterCount += line.length(); 
	                  
	                // \\s+ is the space delimiter in java 
	                String[] wordList = line.split("\\s+"); 
	                  
	                countWord += wordList.length; 
	                whitespaceCount += countWord -1; 
	            } 
	        }
		}
		catch(Exception e)
		{
			System.out.println("below exception occured\n"+e);
		}
		System.out.println("Total word count = " + countWord); 
        System.out.println("Total number of characters = " + characterCount); 
        System.out.println("Number of paragraphs = " + paragraphCount); 
        System.out.println("Total number of whitespaces = " + whitespaceCount); 
		

	}
	}

