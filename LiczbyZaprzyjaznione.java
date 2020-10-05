package liczbyzaprzyjaznione;
import java.util.*;
public class LiczbyZaprzyjaznione {

    public static void main(String[] args) {
        
        Scanner skan = new Scanner(System.in);
        
        System.out.print("Podaj liczbe a: ");
        int a = skan.nextInt();
        System.out.print("Podaj liczbe b: ");
        int b = skan.nextInt();
        
        ArrayList<Integer> dzielnikiA = new ArrayList<Integer>();
        ArrayList<Integer> dzielnikiB = new ArrayList<Integer>();
        
        int sumaDzA = 0;
        int sumaDzB = 0;
        
        System.out.println("\nDzielniki liczby " + a + ": ");
        for (int i = 1; i < a; i++){
            if(a % i == 0){
                dzielnikiA.add(i);
                System.out.print(i + " ");
                sumaDzA += i;
            }
        }
        System.out.println("\nSuma dzielnikow liczby " + a + " = " + sumaDzA);
        
        System.out.println("\nDzielniki liczby " + b + ": ");
        for (int i = 1; i < b; i++){
            if(b % i == 0){
                dzielnikiB.add(i);
                System.out.print(i + " ");
                sumaDzB += i;
            }
        }
        System.out.println("\nSuma dzielnikow liczby " + b + " = " + sumaDzB);
        
        if(sumaDzA == b && sumaDzB == a){
            System.out.println("Sa zaprzyjaznione");
        }
        else{
            System.out.println("Nie sa zaprzyjaznione");
        }
    }
    
}
