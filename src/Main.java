import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IncidentManager manager = new IncidentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Incident");
            System.out.println("2. Update Incident");
            System.out.println("3. View All Incidents");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (option == 1) {
                System.out.print("Enter ID: ");
                String id = scanner.nextLine();
                System.out.print("Enter Description: ");
                String description = scanner.nextLine();
                System.out.print("Enter Priority (Low, Medium, High): ");
                String priority = scanner.nextLine();
                Incident incident = new Incident(id, description, priority);
                manager.addIncident(incident);
                System.out.println("Incident added.");
            } else if (option == 2) {
                System.out.print("Enter Incident ID to update: ");
                String id = scanner.nextLine();
                System.out.print("Enter New Status: ");
                String status = scanner.nextLine();
                System.out.print("Enter Resolution Notes: ");
                String notes = scanner.nextLine();
                manager.updateIncident(id, status, notes);
                System.out.println("Incident updated.");
            } else if (option == 3) {
                for (Incident incident : manager.getIncidents()) {
                    System.out.println(incident);
                }
            } else if (option == 4) {
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
