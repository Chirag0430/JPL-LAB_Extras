
import java.util.Scanner;
class vehicle {
    int registration_number;
    String color, type_of_vehicle;
}
class car extends vehicle {
    int make, CC;
    String fuel_type;
    void get_data() {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter registration number : ");
        registration_number = ip.nextInt();
        System.out.print("Enter colour : ");
        color = ip.next();
        System.out.print("Enter type of vehicle : ");
        type_of_vehicle = ip.next();
        System.out.print("Enter year of make : ");
        make = ip.nextInt();
        System.out.print("Enter the CC of engine : ");
        CC = ip.nextInt();
        System.out.print("Enter fuel type : ");
        fuel_type = ip.next();
    }
    void display() {
        System.out.println("****** VEHICLE DETAILS ******");
        System.out.println("Registration number : " +
                registration_number);
        System.out.println("Vehicle colour : " + color);
        System.out.println("Type of vehicle : " + type_of_vehicle);
        System.out.println("Year of make : " + make);
        System.out.println("CC : " + CC);
        System.out.println("Fuel type : " + fuel_type + "\n\n\n");
    }
}
class truck extends vehicle {
    int make, CC;
    String fuel_type;
    void get_data() {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter registration number : ");
        registration_number = ip.nextInt();
        System.out.print("Enter colour : ");
        color = ip.next();
        System.out.print("Enter type of vehicle : ");
        type_of_vehicle = ip.next();
        System.out.print("Enter year of make : ");
        make = ip.nextInt();
        System.out.print("Enter the CC of engine : ");
        CC = ip.nextInt();
        System.out.print("Enter fuel type : ");
        fuel_type = ip.next();
    }
    void display() {
        System.out.println("****** VEHICLE DETAILS ******");
        System.out.println("Registration number : " +
                registration_number);
        System.out.println("Vehicle colour : " + color);
        System.out.println("Type of vehicle : " + type_of_vehicle);
        System.out.println("Year of make : " + make);
        System.out.println("CC : " + CC);
        System.out.println("Fuel type : " + fuel_type + "\n\n\n");
    }
}
class motorcycle extends vehicle {
    int make, CC;
    String fuel_type;
    void get_data() {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter registration number : ");
        registration_number = ip.nextInt();
        System.out.print("Enter colour : ");
        color = ip.next();
        System.out.print("Enter type of vehicle : ");
        type_of_vehicle = ip.next();
        System.out.print("Enter year of make : ");
        make = ip.nextInt();
        System.out.print("Enter the CC of engine : ");
        CC = ip.nextInt();
        System.out.print("Enter fuel type : ");
        fuel_type = ip.next();
    }
    void display() {
        System.out.println("****** VEHICLE DETAILS ******");
        System.out.println("Registration number : " +
                registration_number);
        System.out.println("Vehicle colour : " + color);
        System.out.println("Type of vehicle : " + type_of_vehicle);
        System.out.println("Year of make : " + make);
        System.out.println("CC : " + CC);
        System.out.println("Fuel type : " + fuel_type + "\n\n\n");
    }
}
public class Car_Truck {
    public static void main(String[] args) {
        car c = new car();
        motorcycle m = new motorcycle();
        truck t = new truck();
        c.get_data();
        c.display();
        m.get_data();
        m.display();
        t.get_data();
        t.display();
    }
}
