import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        House house1 = new House();

        System.out.println("insert address");
        house1.setAddress(scanner.nextLine());

        System.out.println("insert number of floors");
        house1.setFloorsNumber(Integer.parseInt(scanner.nextLine()));

        System.out.println("insert resident's names");
        house1.setResidentsNames(scanner.nextLine().split(","));



        //Array1[i].setName(Scan.next());
       // System.out.println(house1.getAddress() + house1.getFloorsNumber());
        System.out.printf("Address: %s, number of floors: %d, names %s",
                house1.getAddress(),
                house1.getFloorsNumber(),
                Arrays.toString(house1.getResidentsNames()));

    }
}