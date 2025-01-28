import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year of birth : ");
        int birthYear = sc.nextInt();
        System.out.print("Enter your birth month (1-12) : ");
        int birthMonth = sc.nextInt();
        System.out.print("Enter the day of your birth : ");
        int birthDay = sc.nextInt();
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate, currentDate);
        System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");
        sc.close();
    }
}

