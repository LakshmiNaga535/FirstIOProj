//program to read data from a file
import java.io.*;
public class ReadFromFile {
	
	public static void CharBychar(){
		try {
			FileReader fileReader= new FileReader("C:/Users/pakal/Desktop/1.txt");
			
			int i=fileReader.read();
			while(i!=-1){
				char ch=(char)i;
				System.out.print(ch);
				i=fileReader.read();
			}
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Specified file not found");}
			catch(IOException ex){
			System.out.println("Problem reading data from file");	
			}
	}
	public static void LineByLine(){
		try {
			FileReader fileReader= new FileReader("C:/Users/pakal/Desktop/1.txt");
			
			BufferedReader bufferedReader= new BufferedReader(fileReader);
			String str=bufferedReader.readLine();
			while(str!=null){
				System.out.println(str);
				str=bufferedReader.readLine();
	
			}
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Specified file not found");}
			catch(IOException ex){
			System.out.println("Problem reading data from file");	
			}	
	}
	public static void WriteToFile(){
		try {
			//FileWriter fileWriter=new FileWriter("C:/Users/pakal/Desktop/1.txt");
			//To append with the existing data we should pass the boolean value as
			FileWriter fileWriter=new FileWriter("C:/Users/pakal/Desktop/1.txt",true);
			fileWriter.write("good morning");
			fileWriter.close();
			System.out.println("Data is written succesfully");
			
			} catch (FileNotFoundException e) {
			System.out.println("Specified file not found");}
			catch(IOException ex){
			System.out.println("Problem reading data from file");	
			}	
	}
public static void main(String args[]){
	//CharBychar();
	LineByLine();
	WriteToFile();
	LineByLine();
	
}
}