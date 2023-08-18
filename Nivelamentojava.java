import java.util.ArrayList;
import java.util.Scanner;

public class Nivelamentojava {
    public static void main(String... args) {
        ArrayList<Double> alturas = new ArrayList<>();
        ArrayList<String> generos = new ArrayList<>();
        double somaAlturasHomens = 0;
        int qtdHomens = 0;
        int qtdMulheres = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite as informações da pessoa " + (i + 1));
            System.out.print("Altura (em centímetros): ");
            double altura = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Gênero (M/F): ");
            String genero = scanner.nextLine().toUpperCase();

            alturas.add(altura);
            generos.add(genero);

            if (genero.equals("M")) {
                somaAlturasHomens += altura;
                qtdHomens++;
            } else if (genero.equals("F")) {
                qtdMulheres++;
            }
        }

        System.out.println("\nInformações:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Pessoa " + (i + 1) + " - Altura: " + alturas.get(i) + " cm, Gênero: " + generos.get(i));
        }

        double maiorAltura = alturas.stream().max(Double::compareTo).get();
        double menorAltura = alturas.stream().min(Double::compareTo).get();
        System.out.println("\nMaior altura: " + maiorAltura + " cm");
        System.out.println("Menor altura: " + menorAltura + " cm");

        if (qtdHomens > 0) {
            double mediaAlturaHomens = somaAlturasHomens / qtdHomens;
            System.out.printf("Média da altura dos homens: %.2f cm%n", mediaAlturaHomens);
        } else {
            System.out.println("Nenhum homem.");
        }

        System.out.println("A quantidade de mulheres foi: " + qtdMulheres);

        scanner.close();
    }
}