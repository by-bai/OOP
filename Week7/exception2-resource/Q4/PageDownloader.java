import java.net.URL;
import java.util.Scanner;
import java.net.MalformedURLException;
import java.io.IOException;

public class PageDownloader {
    public static void main(String[] args) {

        String websiteURL = "";
        String userPrompt = "Enter the URL> "; 
        Scanner console = new Scanner(System.in);
        System.out.print(userPrompt);
        websiteURL = console.nextLine();

        boolean running = true; 

        while (running) {
          
            try {
                URL url = new URL(websiteURL);
                Scanner sc = new Scanner(url.openStream());
                while (sc.hasNext()) {
                    System.out.println(sc.nextLine());
                }
                
                running = false; 

            } catch (MalformedURLException e) { //child first
                    System.out.println("Invalid URL!");
                    System.out.print(userPrompt);
                    websiteURL = console.nextLine();
            } catch (IOException e) {
                    System.out.println("Error reading from website!"); 
                    System.out.print(userPrompt);
                    websiteURL = console.nextLine();
            }
          
        }
     
    }
}
