import java.util.Scanner;

public class exec16 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        int idade, som =0, cont=0;
        
        do {
            System.out.println("Digite a sua idade: ");
            idade = dado.nextInt();
            if(idade>0){
            som+=idade;
            cont++;
            }
        } while (idade != 0);
        int med = som  /cont;
        System.out.println("A média das idades = " + med);
    }
}
