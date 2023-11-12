import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Numarul angajatilor este: ");
        int nr = myObj.nextInt();

        ArrayList<Employee> angajati = new ArrayList<>();
        for (int i = 0; i < nr; i++) {
            Employee angajat = new Employee();

            System.out.println("Numele angajatului " + (i + 1) + " este: ");
            String nume = myObj.next();
            angajat.setName(nume);

            System.out.println("Emailul angajatului " + (i + 1) + " este: ");
            String email = myObj.next();
            angajat.setEmail(email);

            System.out.println("Salariul angajatului " + (i + 1) + " este: ");
            double hourRate = myObj.nextDouble();
            angajat.setHourRate(hourRate);

            System.out.println("Capacitatea angajatului " + (i + 1) + " este: ");
            double capacity = myObj.nextDouble();
            angajat.setCapacity(capacity);

            System.out.println("Zilele libere ale angajatului " + (i + 1) + " sunt: ");
            int freeDays = myObj.nextInt();
            angajat.setFreeDays(freeDays);

            angajati.add(angajat);
        }

        for (int i = 0; i <= angajati.size(); i++) {
            Employee angajat = angajati.get(i);
            System.out.println("\nAngajatul " + (i + 1) + ":");
            System.out.println("Nume: " + angajat.name);
            System.out.println("Email: " + angajat.email);
            System.out.println("Salariu: " + angajat.hourRate);
            System.out.println("Capacitate: " + angajat.capacity);
            System.out.println("Zile libere: " + angajat.freeDays);
            System.out.println("Venit zilnic: " + angajat.calculateDailyIncome());
            System.out.println("Venit lunar: " + angajat.calculateMonthlyIncome());
        }
    }
}