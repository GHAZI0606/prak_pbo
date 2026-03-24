package tugas1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to Smart City Management System");
            System.out.println("1. Add New Building");
            System.out.println("2. View All Buildings");
            System.out.println("3. Exit");
            System.out.print("Please select an option: ");
            int pilih = input.nextInt();
            input.nextLine();

            switch (pilih){
                case 1:
                    System.out.print("Enter Building Name: ");
                    String building_name = input.nextLine();
                    System.out.print("Enter Building Addres: ");
                    String building_addres = input.nextLine();
                    System.out.print("Enter Number of Floors: ");
                    String number_floors = input.nextLine();

                    System.out.println("\n===========================");
                    System.out.println("Data Building");
                    System.out.println("Building Name: " + building_name);
                    System.out.println("Building Addres: " + building_addres);
                    System.out.println("Numbers of Floors: " + number_floors);
                    System.out.println("===========================");
                    break;

                case 2:
                    System.out.println("Coming Soon");
                    break;

                case 3:
                    System.out.println("Exit Succes");
                    break;

                default:
                    System.out.println("Invalid Option");
                    break;

            }
        }
    }
}
