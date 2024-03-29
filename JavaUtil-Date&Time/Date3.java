import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.LocalDate;

public class Date3 {
    
    public static void main(String[] args)
    {

    Scanner scanner = new Scanner(System.in);
    String datestr;
    datestr = scanner.nextLine();

    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    LocalDate ld = LocalDate.parse(datestr,f);
    
    System.out.println(ld);

    scanner.close();

    }
}
