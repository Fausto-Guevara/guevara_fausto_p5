/*
 * @author Guevara Thomas Fausto Yahel
 * @version 1.0
 * @date 12-Abril-2024 
 */
import especies.Animal;
import especies.Plantae;
import especies.Fungi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número (1: Animal, 2: Plantae, 3: Fungi):");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                Animal animal = new Animal("León", "Panthera leo", "Animalia", "Mammalia", "Carnivora");
                System.out.println(animal);
                break;
            case 2:
                Plantae planta = new Plantae("Rosa", "Rosa sp.", "Plantae", "Magnoliopsida", "Rosales");
                System.out.println(planta);
                break;
            case 3:
                Fungi fungi = new Fungi("Champiñón", "Agaricus bisporus", "Fungi", "Agaricomycetes", "Agaricales");
                System.out.println(fungi);
                break;
            default:
                System.out.println("Número no válido.");
                break;
        }

        scanner.close();
    }
}
