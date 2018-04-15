import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws java.io.IOException, UnsupportedEncodingException{
        Locale localeEU = new Locale("en", "US");
        Locale localeRU = new Locale("ru", "RUS");
        ResourceBundle resourceEN = ResourceBundle.getBundle("resources_EU",localeEU);
        ResourceBundle resourceRU = ResourceBundle.getBundle("resources_RU",localeRU);
        Scanner scanner = new Scanner(System.in);
       String choice;
        System.out.println("Choice language:");
        System.out.println("1. "+localeEU);
        System.out.println("2. "+localeRU);
        System.out.println("Which 1 or 2?");
        choice =  scanner.nextLine();
        switch (choice){
            case "1":
                System.out.println("1. What is you name?");
                System.out.println("2. What is you need?");
                System.out.println("1 or 2?:");

                choice = scanner.nextLine();
                switch (choice){
                    case "1":
                        System.out.println(resourceEN.getString("answer1"));
                        break;
                    case "2":
                        System.out.println(resourceEN.getString("answer2"));
                        break;
                }
                break;
            case "2":
                System.out.println("1. Как твое имя?");
                System.out.println("2. Чего ты хочешь?");
                System.out.println("1 или 2?:");
                choice = scanner.nextLine();
                switch (choice){
                    case "1":
                        System.out.println(new String(resourceRU.getString("answer1").getBytes("ISO-8859-1"), "UTF-8"));
                        break;
                    case "2":
                        System.out.println(new String(resourceRU.getString("answer2").getBytes("ISO-8859-1"), "UTF-8"));
                        break;
                }
                break;
            default:
                System.out.println("Request not found!");
        }
    }
}
