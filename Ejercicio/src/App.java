

public class App {
    public static void main(String[] args) throws Exception {
        //Ejercicio 1
        //utilizamos el patron composite

        Elemento el1 = new Elemento(10, 1); // precio,codigo
        Elemento el2 = new Elemento(10, 2);
        Elemento el3 = new Elemento(10, 3);
        Mueble sofa = new Mueble(324, 4);
        Electrodomestico Lavadora = new Electrodomestico(350, 404);// elementos sueltos

        Elemento[] array = new Elemento[3];
        array[0] = el1;
        array[1] = el2;
        array[2] = el3;

        Elemento el123 = new Elemento(123, array); // codigo, componentes, creacion de elemento compuesto

        el123.printOut();

        Kit PackDescuento =  new Kit(321,el123); //codigo, elementos, creacion kit a partir del elemento compuesto
        PackDescuento.printOut(); // imprimiendo caracteristicas del kit
        
        PackDescuento.add(sofa);
        PackDescuento.add(Lavadora);//añadimos los 2 elementos restantes al kit.

        PackDescuento.printOut();
    
    }
}
