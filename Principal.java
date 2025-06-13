import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    

        // Criando dois helicópteros
        Helicoptero h1 = new Helicoptero(4);
        Helicoptero h2 = new Helicoptero(6);

        // Entrada de pessoas
        h1.entra();
        h1.entra();
        h2.entra();
        h2.entra();
        h2.entra();

        // Ligar helicópteros
        h1.ligar();
        h2.ligar();

        // Decolar helicópteros
        h1.decolar(1000);
        h2.decolar(1500);

        // Exibir estados
        System.out.println(h1);
        System.out.println(h2);

        // Aterrisar helicópteros
        h1.aterrisar();
        h2.aterrisar();

        // Desligar helicópteros
        h1.desligar();
        h2.desligar();

        // Saída de pessoas
        h1.sai();
        h2.sai();
        h2.sai();

        // Exibir estados finais
        System.out.println(h1);
        System.out.println(h2);

       sc.close();
    }
}