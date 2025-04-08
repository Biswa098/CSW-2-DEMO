import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        FileWriter Writer =new FileWriter("File.txt");
        for(int i=0;i<name.length();i++) {
        	if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
            Writer.write(name.charAt(i));
            
        	}
        
	}
        Writer.close();
        System.out.println("Successfully written");
}
	
	  }try {
		  File obj1=new File("File.txt");
		  Scanner Reader=new Scanner(obj1);
		  while(Reader.hasNextLine()) {
			  String data=Reader.
		  }
	  }
		  
	  }
