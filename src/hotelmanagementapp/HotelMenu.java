package hotelmanagementapp;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class HotelMenu {

    public void customerMenu() throws ParseException, FileNotFoundException {
        HostelLogic myApp = new HostelLogic();
        Scanner input = new Scanner(System.in);
        int choice;
        boolean x = true;
        while (x) {
            System.out.println("--------------");
            System.out.println("1. Create your profile ");
            System.out.println("2. Edit your profile ");
            System.out.println("3. Check available rooms ");
            System.out.println("4. Add a booking ");
            System.out.println("5. Get your customer information ");
            System.out.println("6. Get all your bookings ");
            System.out.println("7. Exit/Log out");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    myApp.addCustomer();
                case 2:
                    System.out.println("Enter booking ssn: ");
                    String ssn = input.nextLine();
                    myApp.editBookingCustomer(ssn);
                    break;
                case 3:
                    myApp.printAvailableRooms();
                    break;
                case 4:
                    myApp.createBooking2();
                    break;
                case 5:
                    myApp.getCustomer2(HostelLogic.sssn);
                    break;
                case 6:
                    myApp.getBooking();
                    break;
                case 7:
                    x = false;
                    break;
                default:
                    System.out.println("Error");


            }
        }
    }


    public void empMenu() throws ParseException, IOException {
        HostelLogic myApp = new HostelLogic();
        Scanner input = new Scanner(System.in);
        boolean y = true;
        while (y) {
            System.out.println("---------------------------");
            System.out.println("1. add customer");
            System.out.println("2. Show all customers");
            System.out.println("3. Show specific customer");
            System.out.println("4. get all available rooms ");
            System.out.println("5. Add rooms");
            System.out.println("6. show all rooms");
            System.out.println("7. Add a booking");
            System.out.println("8. Edit booking");
            System.out.println("9. Show all bookings");
            System.out.println("10. Remove a room");
            System.out.println("11. Remove a customer");
            System.out.println("12. Exit");
            System.out.println("-----------------------------");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    myApp.addCustomer();
                    break;
                case 2:
                    myApp.getCustomers();
                    break;
                case 3:
                    System.out.println(myApp.getCustomer());
                    break;
                case 4:
                    myApp.printAvailableRooms();
                    break;
                case 5:
                    myApp.addRoom();
                    break;
                case 6:
                    myApp.getRooms();
                    break;
                case 7:
                    myApp.createBooking();
                    break;
                case 8:
                    myApp.editBooking();
                    break;
                case 9:
                    System.out.println(myApp.showBookings());
                    break;
                case 10:
                    myApp.removeRoom();
                    break;
                case 11:
                    myApp.removeCustomer();
                    break;
                case 12:
                   y = false;
                    break;






            }
        }

    }
    public void adminMenu() throws IOException, FileNotFoundException, ParseException {
        HostelLogic myApp = new HostelLogic();
        Scanner input = new Scanner(System.in);
        boolean y = true;
        while (y) {
            System.out.println("---------------------------");
            System.out.println("1. add customer");
            System.out.println("2. Show all customers");
            System.out.println("3. Show specific customer");
            System.out.println("4. get all available rooms ");
            System.out.println("5. Add rooms");
            System.out.println("6. show all rooms");
            System.out.println("7. Add a booking");
            System.out.println("8. Edit booking");
            System.out.println("9. Show all bookings");
            System.out.println("10. Remove a room");
            System.out.println("11. Remove a customer");
            System.out.println("12. Add an employee");
            System.out.println("13: Print Employees  details");
            System.out.println("14: Remove an Employee");
            System.out.println("15: Exit");
            System.out.println("-----------------------------");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    myApp.addCustomer();
                    break;
                case 2:
                    myApp.getCustomers();
                    break;
                case 3:
                    System.out.println(myApp.getCustomer());
                    break;
                case 4:
                    myApp.printAvailableRooms();
                    break;
                case 5:
                    myApp.addRoom();
                    break;
                case 6:
                    myApp.getRooms();
                    break;
                case 7:
                    myApp.createBooking();
                    break;
                case 8:
                    myApp.editBooking();
                    break;
                case 9:
                    System.out.println(myApp.showBookings());
                    break;
                case 10:
                    myApp.removeRoom();
                    break;
                case 11:
                    myApp.removeCustomer();
                    break;
                case 12:
                    myApp.addEmployee();
                    break;
                case 13:
                    myApp.printEmployees();
                    break;
                case 14:
                    myApp.removeEmployee();
                    break;
                case 15:
                    y = false;
                    break;


            }

        }

    }

}
