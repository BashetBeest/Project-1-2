import java.util.*;
import java.io.*;

public class FileReaders{
	public static void main(String[] args){
		read("text.txt");
        writeFile("Output.txt");
	}

	public static void read (String fileName){
        FileReader fr = null;
        LinkedList<Double> num = new LinkedList<Double>();
        try {
        	fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            while((line = br.readLine())!=null) {       // For each line in the CSV file
                // Read the line, and convert the string to a list of numbers
                String[] numbers = line.split(" ");                

                for(int i=0; i<numbers.length; i++){
                    if(numbers[i].matches(".*\\d.*")){
                        double num1 = Double.parseDouble(numbers[i]);
                        num.add(num1);
                        System.out.println(num1);
                    }
                }
            }
            double gravity = num.pop();
            double mass = num.pop();
            double coeficientOfFriction = num.pop();
            double initialSpeed = num.pop();
            double tolerance = num.pop();
            double xStart = num.pop();
            double yStart = num.pop();
            double xGoal = num.pop();
            double yGoal = num.pop();
        // Exeptions.
        } catch (FileNotFoundException e){
            e.printStackTrace();
            System.exit(0);
        } catch (IOException e) {   
            e.printStackTrace();  
        } finally{
        	if(fr != null){
        		try{
        			fr.close();
        		} catch(IOException e){

        		}
        	}
        }
	}

	public static void writeFile(String fileName){
        PrintWriter writer = null;
		try {
            writer = new PrintWriter(fileName);
            writer.println("Gravity = " + 100);
            writer.println("Mass = ");
            writer.println("Coefficient of friction = ");
            writer.println("initial speed = ");
            writer.println("tolerence for the goal = ");
            writer.println("Start position X = ");
            writer.println("Start position Y = ");
            writer.println("Goal position X = ");
            writer.println("Goal position Y = ");
            
        } catch (IOException e) {
        }finally{
                writer.close();
        }
	}
}