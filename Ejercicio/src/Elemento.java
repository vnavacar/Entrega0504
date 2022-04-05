import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Elemento implements Component {
    protected List <Component> children = new ArrayList<>();
    private float precio;
	private int codigo;




    public Elemento(int codigo, Component... componentes ){
        this.codigo =0;
        add(componentes);
        calcularPrecio();

    }
    public Elemento(float precio, int codigo){ 
            this.precio = precio;
            this.codigo= codigo;
    }

    public void calcularPrecio(){
        if (this.children.isEmpty()){
        return;
    }
    float precio=0;
    for (int i = 0; i < this.children.size(); i++) {
        precio = precio+this.children.get(i).getPrecio();
    }
        this.precio= precio;
        return;
    }
        
    public float getPrecio() {
        return precio;
        }
    
    public int getCodigo() {
        return codigo;
    }
    public void setPrecio(Float precio) {
        this.precio= precio;
    }

    public void add(Component component) {
        children.add(component);
    }

    public void add(Component... components) {
        children.addAll(Arrays.asList(components));
    }
    public void remove(Component child) {
        children.remove(child);
    }

    public void remove(Component... components) {
        children.removeAll(Arrays.asList(components));
    }


}
