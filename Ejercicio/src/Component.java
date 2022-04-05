
public interface Component {
	/*
	private float precio;
	private int codigo;
	
	public Component(float precio, int codigo) {
		
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

	*/
    float getPrecio();
    int getCodigo();
    void setPrecio(Float precio);

}
