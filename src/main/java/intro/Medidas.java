package intro;

public class Medidas {

    public static void main(String[] args){

        calcularAreaModoCompacto();
        calcularAreaModoExtenso();



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
}