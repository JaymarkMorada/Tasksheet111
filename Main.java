package chapter1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a hero name: ");
        String heroName = scanner.nextLine();
        
        Hero h1 = new Hero();
        System.out.println("Enter the hero's HP: ");
        int hp = scanner.nextInt();
        h1.setHp(hp);
        
        System.out.println(h1);
        System.out.println("Hero's name: " + heroName);
        
        scanner.close();  // Close the scanner to avoid resource leaks
    }
}

class Hero {
    private int hp;

    public void setHp(int hp) {
        if (hp < 0) {
            System.out.println("HP cannot be negative. Setting HP to 0.");
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    @Override
    public String toString() {
        return "Hero's HP: " + this.hp;
    }
}
