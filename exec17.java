import java.util.Scanner;

public class exec17 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        int canal=0;
        int cont4=0;
        int cont5=0;
        int cont7=0;
        int cont12=0;
        int pessoa, maxpessoa=0;

        do {
            System.out.println("Informe o número do canal: (4,5,7,12) ");
            canal = dados.nextInt();
            System.out.println("Informe o número de pessoas que estavam assistindo a esse canal: ");
            pessoa = dados.nextInt();

            maxpessoa+=pessoa;

            if (canal == 4) {
                cont4+=pessoa;
            }
            else if (canal==5) {
                cont5+=pessoa;
            }
            else if (canal==7) {
                cont7+=pessoa;
            }
            else if (canal==12) {
                cont12+=pessoa;
            }
        } while (canal!=0);



        double perc = ((double)cont4/maxpessoa)*100;
        double perc5 = ((double)cont5/maxpessoa)*100;
        double perc7 =((double)cont7/maxpessoa)*100;
        double perc12 =((double)cont12/maxpessoa)*100;

        System.out.println("A audiência do canal 4 é: " + perc + "%");
        System.out.println("A audiência do canal 5 é: " + perc5 + "%");
        System.out.println("A audiência do canal 7 é: " + perc7 + "%");
        System.out.println("A audiência do canal 12 é: " + perc12 + "%");
    }
}