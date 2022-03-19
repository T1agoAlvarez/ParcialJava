import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        int i, Hamburguesa, Perros, Salchipapas, Chorizos, Total, Pedido, servicio = 0;
        int cHamburguesa = 0, cPerros = 0, cSalchipapas = 0, cChorizos = 0;
        int totalHamburguesa = 0, totalPerros = 0, totalSalchipapas = 0, totalChorizos = 0;
        int Descuento1, Descuento2, Descuento3 = 0, comensales, Tcompra, Dtotal = 0, Vservicio = 0,TotalG;

        Hamburguesa = 10000;
        Perros = 8000;
        Salchipapas = 6000;
        Chorizos = 7000;

        System.out.println("Bienvenido al restaurante muerte lenta");
        System.out.println("Por favor indique la cantidad de comensales");
        comensales = inputData.nextInt();

        for (i = 1; i <= comensales; i++) {
            System.out.println("A continuacion encontrara nuestro menu con nuestros productos");
            System.out.println("Por favor ingrese el pedido del primer comensal" + i + "");
            System.out.println("1. Hamburguesa");
            System.out.println("2. Perros");
            System.out.println("3. Salchipapas");
            System.out.println("4. Chorizos");
            Pedido = inputData.nextInt();

            if (Pedido == 1) {
                cHamburguesa = cHamburguesa + 1;
                totalHamburguesa = Hamburguesa * cHamburguesa;
            } else if (Pedido == 2) {
                cPerros = cPerros + 1;
                totalPerros = Perros * cPerros;
            } else if (Pedido == 3) {
                cSalchipapas = cSalchipapas + 1;
                totalSalchipapas = Salchipapas * cSalchipapas;
            } else if (Pedido == 4) {
                cChorizos = cChorizos + 1;
                totalChorizos = Chorizos * cChorizos;
            }

            if (cHamburguesa > 1 || cPerros > 1 || cSalchipapas > 1 || cChorizos > 1) {
                Total = totalHamburguesa + totalPerros + totalSalchipapas + totalChorizos;
                Descuento1 = Total * 5 / 100;
                Tcompra = Total - Descuento1;
                System.out.println("tuvo descuento del 5%");

                if (Total>20000){
                    Descuento2 = Tcompra * 10 / 100;
                    Descuento3 = Tcompra - Dtotal;
                    System.out.println("Tuvo descuento del 10%");
                }
                System.out.println("¿Desea incluir el servicio?");
                System.out.println("1. Si");
                System.out.println("2. No");
                servicio = inputData.nextInt();

                if (servicio == 1){
                    Vservicio = Descuento3 * 10/100;
                    TotalG = Descuento3 + Vservicio;

                    System.out.println(cHamburguesa+"Hamburguesa"+totalHamburguesa);
                    System.out.println(cPerros+"Perros"+totalPerros);
                    System.out.println(cSalchipapas+"Salchipapas"+totalSalchipapas);
                    System.out.println(cChorizos+"Chorizos"+totalChorizos);
                }

            }
        }
    }
}




