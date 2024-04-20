public class Laptop extends Articulo implements DefinirPrecio{
    private String marca;
    private float RAM;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getRAM() {
        return RAM;
    }

    public void setRAM(float RAM) {
        this.RAM = RAM;
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

    @Override
    public void show() {
        System.out.println();
    }

    public Laptop(String marca,float RaM, String name, String model, String description, float price) {
        this.marca = marca;
        this.RAM = RAM;
        this.name=getName();
        this.model = getModel();
        this.description=getDescription();
        this.price=getPrice();
    }
}
