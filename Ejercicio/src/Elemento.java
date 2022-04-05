public class Elemento implements Component {
    private float precio;
	private int codigo;
    public Elemento(float precio, int codigo){

            
            this.precio = precio;
            this.codigo= codigo;
    }
        
    public float getPrecio() {
        return precio;
        }
    
    public int getCodigo() {
        return codigo;
    }
    public void setPrecio(int precio) {
        this.precio= precio;
    }
}
