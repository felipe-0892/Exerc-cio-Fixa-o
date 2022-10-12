import java.util.Scanner;


public class exec14{
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        int resp, SomaIdade=0, cont2=0, cont1=0, cont3=0,  idade;
        double media, perc;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Informe sua idade: ");
            idade = dados.nextInt();
    
            System.out.println("Responda a pesquisa de satisfação");
            System.out.println("Ótimo...........................3");
            System.out.println("Bom.............................2");
            System.out.println("Regular.........................1");
            
            resp=dados.nextInt();

            if (resp==3) {
                SomaIdade+=idade;
                cont3++;
            } else if (resp==2) {
                cont2++;
            }else if (resp==1) {
                cont1++;
            }else{
                System.out.println("Opção inválida. Refaça");
            }

            
        }

        media =(double)SomaIdade/3;
        perc = ((int)cont1/3)*100;
        System.out.println("A média das idades que responderam ótimo: "+media);
        System.out.println("A quantidade de pessoas que responderam regular: "+ cont1);
        System.out.println("A porcetagem da pessoas que responderam bom "+perc+"%");
        
    }
}
