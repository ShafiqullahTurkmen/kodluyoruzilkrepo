import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int water = 400;
        int milk = 540;
        int coffeeBeans = 120;
        int cups = 9;
        int money = 550;
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String input = sc.next();
        System.out.println();

        while (!input.equals("exit")) {
            switch (input) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String choice = sc.next();
                    switch (choice) {
                        case "1":
                            if (water >= 250 && coffeeBeans >= 16 && cups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                System.out.println();
                                water -= 250;
                                coffeeBeans -= 16;
                                cups -= 1;
                                money += 4;
                            } else {
                                if (water < 250) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (coffeeBeans < 16) {
                                    System.out.println("Sorry, not enough coffee beans!");
                                } else if (cups < 1) {
                                    System.out.println("Sorry, not enough cups!");
                                }
                                System.out.println();
                            }
                            break;
                        case "2":
                            if (water >= 350 && milk >= 75 && coffeeBeans >= 20 && cups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                System.out.println();
                                water -= 350;
                                milk -= 75;
                                coffeeBeans -= 20;
                                cups -= 1;
                                money += 7;
                            } else {
                                if (water < 350) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (milk < 75) {
                                    System.out.println("Sorry, not enough milk!");
                                } else if (coffeeBeans < 20) {
                                    System.out.println("Sorry, not enough coffee beans!");
                                } else if (cups < 1) {
                                    System.out.println("Sorry, not enough cups!");
                                }
                                System.out.println();
                            }
                            break;
                        case "3":
                            if (water >= 200 && milk >= 100 && coffeeBeans >= 12 && cups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                System.out.println();
                                water -= 200;
                                milk -= 100;
                                coffeeBeans -= 12;
                                cups -= 1;
                                money += 6;
                            } else {
                                if (water < 200) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (milk < 100) {
                                    System.out.println("Sorry, not enough milk!");
                                } else if (coffeeBeans < 12) {
                                    System.out.println("Sorry, not enough coffee beans!");
                                } else if (cups < 1) {
                                    System.out.println("Sorry, not enough cups!");
                                }
                                System.out.println();
                            }
                            break;
                        case "back":
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    water += sc.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    milk += sc.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    coffeeBeans += sc.nextInt();
                    System.out.println("Write how many disposable cups of coffee you want to add:");
                    cups += sc.nextInt();
                    System.out.println();
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money -= money;
                    System.out.println();
                    break;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " ml of water");
                    System.out.println(milk + " ml of milk");
                    System.out.println(coffeeBeans + " g of coffee beans");
                    System.out.println(cups + " disposable cups");
                    System.out.println("$" + money + " of money");
                    System.out.println();
                    break;
                case "exit":
                    input = "exit";
                    break;
            }
            if (!input.equals("exit")) {
                System.out.println("Write action (buy, fill, take, remaining, exit):");
                input = sc.next();
                System.out.println();
            }
        }

    }
}