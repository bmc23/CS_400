import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVTOHTML {

    public static void main(String[] args) {
        try {
            System.out.println("<html><body><p>");
            System.out.println("<table border =\"2px solid black\">");
		File file = new File("data.csv");
		List<String[]> output = readAll(file);
		for(String row[]:output){
			System.out.println("<tr>");
			for(String col:row){
				System.out.println("<td>" + col + "</td>");
				}
			System.out.println("</tr>");
			}
		System.out.println("</table>");
            System.out.println("</p></body></html>");
        } catch(Exception e) {
            System.out.println("<html><body><pre>");
            System.out.println("Ooops, something went wrong. There was an exception in the Java program:");
            e.printStackTrace(System.out);
            System.out.println("</pre></body></html>");
        }
    }

    public static List<String[]> readAll(File csvFile) throws Exception {
        List<String[]> output = new ArrayList<>();
        try (Scanner fin = new Scanner(csvFile)) {
            while(fin.hasNextLine()) {
                output.add(fin.nextLine().split(","));
            }    
        }
        return output;
    }    

}

