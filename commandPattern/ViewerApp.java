package commandPattern;

import java.util.Scanner;

public class ViewerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tv tv = new Tv();
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        RemoteControl hub = new RemoteControl();

        boolean running = true;

        System.out.println("=== Welcome to the Smart Home Central Control Hub ===");

        while (running) {
            System.out.println("\nSelect an action to perform:");
            System.out.println("1. Turn On TV");
            System.out.println("2. Turn Off TV");
            System.out.println("3. Turn On Smart Lights");
            System.out.println("4. Increase Thermostat Temperature");
            System.out.println("5. Play Favorite Music Playlist");
            System.out.println("6. Decrease Music Player Volume");
            System.out.println("7. Exit System");
            System.out.print("Enter your choice (1-7): ");

            int choice = scanner.nextInt();

            Command selectedCommand = null;

            switch (choice) {
                case 1:
                    selectedCommand = new PowerOn(tv);
                    break;
                case 2:
                    selectedCommand = new PowerOff(tv);
                    break;
                case 3:
                    selectedCommand = new TurnLightOn(light);
                    break;
                case 4:
                    selectedCommand = new IncreaseTemperature(thermostat);
                    break;
                case 5:
                    selectedCommand = new PlayMusic(musicPlayer);
                    break;
                case 6:
                    selectedCommand = new DecreaseVolume(musicPlayer);
                    break;
                case 7:
                    running = false;
                    System.out.println("Shutting down Smart Home Hub. Goodbye!");
                    continue;
                default:
                    System.out.println("Invalid option. Please try again.");
                    continue;
            }

            hub.setCommand(selectedCommand);
            String output = hub.clickButton();
            System.out.println("\n[HUB RESPONSE]: " + output);
        }

        scanner.close();
    }
}