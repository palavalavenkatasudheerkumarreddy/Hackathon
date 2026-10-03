import java.util.Scanner;

public class SolarSystem {

    static void displayPanelInfo() {
        int panelId = 101;
        double energyGenerated = 12.5;
        int numberOfPanels = 10;
        char systemStatus = 'A';

        System.out.println("----- Solar Panel Information -----");
        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Number of Solar Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);
    }

    static void checkEnergy(Scanner sc) {
        System.out.print("\nEnter energy generated in kWh: ");
        double energy = sc.nextDouble();

        if (energy >= 10) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }
    }

    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        displayPanelInfo();

        checkEnergy(sc);

        System.out.print("\nEnter morning energy in kWh: ");
        double morningEnergy = sc.nextDouble();

        System.out.print("Enter evening energy in kWh: ");
        double eveningEnergy = sc.nextDouble();

        double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);

        System.out.println("Total Energy Generated: " + totalEnergy + " kWh");

        sc.close();
    }
}