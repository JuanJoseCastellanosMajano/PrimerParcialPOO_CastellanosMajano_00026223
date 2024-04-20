public class Telefono extends Articulo implements DefinirPrecio{
    private String marca;
    private float memory;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getMemory() {
        return memory;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }


    public void create() {

        super.create();
    }

    @Override
    public float obtainPrice() {
        this.price=getPrice();
        return price;
    }

    @Override
    public String  obtainDescription() {
        this.description=getDescription();
        return description;
    }

    public Telefono(String marca, float memory) {
        this.marca = marca;
        this.memory = memory;
        this.name=getName();
        this.model=getModel();
        this.description=getDescription();
        this.price=getPrice();
    }
}
