package cursojavaloiane.ExerciciosAulas24.Ex_01;

public class TesteLampada {

    public static void main(String[] args) {
        Lampada lampPhilips = new Lampada();

        lampPhilips.marca = "Philips";
        lampPhilips.cor = "Branca";
        lampPhilips.preco = 20;
        lampPhilips.potencia = 25;

        System.out.println(lampPhilips.marca);
        System.out.println(lampPhilips.cor);

        Lampada lampLg = new Lampada();

        lampLg.marca = "LG";
        lampLg.cor = "Amarela";
        lampLg.preco = 10;
        lampLg.potencia = 16;

        System.out.println(lampLg.marca);
        System.out.println(lampLg.cor);

    }
}
