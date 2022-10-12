import java.util.Scanner;

public class exec15 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

       
        char sexo, op;
        int contSim=0, contNao=0, contF=0,contM=0;

        
        for (int i = 0; i <=3; i++) {
            
            System.out.print("Informe seu sexo: ");
            sexo = dados.next().charAt(0);
            sexo = Character.toUpperCase(sexo);

            System.out.println("Gostou do produto? (S/N)");
            op=dados.next().charAt(0);
            op=Character.toUpperCase(op);

            if (op == 'S') {
               contSim++; if (sexo == 'F') {
                   contF++;
               }
            } else if (op == 'N') {
                contNao++;
                if (sexo=='M') {
                    contM++;
                }
            }

        }

        System.out.println("Quantidade de pessoas com resposta SIM: "+ contSim);
        System.out.println("Quantidade de pessoas com resposta NÃO: "+ contNao);
        System.out.println("Quantidade de mulheres com resposta SIM : "+ contF);
        double perc = ((double)contM/contNao)* 100;
        System.out.println("Porcentagem de homens que responderam não: " + perc + "%");
        
    }
}
