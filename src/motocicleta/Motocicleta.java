/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package motocicleta;

/**
 *
 * @author ap550
 */
class Moto {
   static int Velocidad; 
   static int Marcha; 

   static void aceleracion() {
      Velocidad += 20;
   }

   
   static void desaceleracion() {
      Velocidad -= 10;
   }
   
   static void cambioVelocidad(int newGear) {
      Marcha = newGear;
   }

   static void showStatus() {
      System.out.println("Velocidad: " + Velocidad + " km/h");
      System.out.println("Marcha: " + Marcha);
   }

    private Moto() {
    }
}

public class Motocicleta {
   public static void main(String[] args) {
      Moto.Velocidad = 0; 
      Moto.Marcha = 1; 

      System.out.println("Estado inicial de la motocicleta: ");
      Moto.showStatus();

      Moto.aceleracion();
      Moto.cambioVelocidad(2);
      System.out.println("\nDespues de acelerar y cambiar de marcha: ");
      Moto.showStatus();

      Moto.desaceleracion();
      Moto.cambioVelocidad(1); 
      System.out.println("\nDespues de frenar y cambiar de marcha: ");
      Moto.showStatus(); 
   }
}
