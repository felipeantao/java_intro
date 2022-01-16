package intro;

import java.util.Scanner;

public class Medidas {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("OPÇÕES:");
        System.out.println("c - Calcular Area Modo Curto");
        System.out.println("e - Calcular Area Modo Extenso");
        System.out.println("d - Contar até 10");
        System.out.println("r - Contagem regressiva até 0");
        System.out.println("i - Modo If Simples");
        System.out.println("Digite a opção desejada:");
        String opcao = scanner.next();


        switch (opcao) {
        case "i":
        case "I":
            System.out.println("Você escolheu executar o método If Simples");
            ifSimples();
            break;
        case "c":
        case "C":
            System.out.println("Você escolheu executar o método curto");
            calcularAreaModoCompacto();
            break;
        case "d":
        case "D":
            System.out.println("Você escolheu executar o método Contar Até 10");
            contarAte10();
            break;
        case "r":
        case "R":
            System.out.println("Você escolheu executar o método Contagem regressiva até 0");
            contagemRegressiva();
            break;
        case "e":
        case "E":
            System.out.println("Você escolheu executar o método Extenso");
            calcularAreaModoExtenso();
            break;

        default:
            System.out.println("Você escolheu um valor inválido");
            break;
}




    }

    public static void ifSimples(){
        String modo = "curto";

        if (modo=="curto") {
            calcularAreaModoCompacto();
        }
        else{
            calcularAreaModoExtenso();
        }
    }

    public static void calcularAreaModoExtenso(){

        System.out.println("Cálculo de Areas Modo Extenso");
        int largura;
        int comprimento;
        int resultado;

        largura=4;
        comprimento=3;

        resultado=largura * comprimento;
        System.out.println("A área é de: " + resultado + "m²");
    }

    public static void calcularAreaModoCompacto(){

        System.out.println("Cálculo de Areas  Modo Curto");
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura " + largura + " e o comprimento " + comprimento +
                           " o resultado é" + largura * comprimento + "m2");
    }

    public static void contarAte10(){

        System.out.println("Contagem crescente");
        for (int numero = 1; numero <= 10; numero ++){
            System.out.println(numero);
        }
    }

    public static void contagemRegressiva(){

        System.out.println("Contagem Regressiva");
        for (int numero = 10; numero >= 0; numero --){
            System.out.println(numero);
        }
    }
}
