import java.util.Scanner;

public class App {
     public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        

        float n1,n2,soma;
        System.out.print("Digite o 1° número: ");
        n1 = console.nextFloat();

        System.out.print("Digite o 2° número: ");
        n2 = console.nextFloat();

        soma=n1+n2;

        System.out.println("Soma dos números informados é "+soma);
        console.close();
    }
}
