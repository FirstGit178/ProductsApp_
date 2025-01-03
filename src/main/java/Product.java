public class Product {
    private String name;
    private String description;

    public Product() {
        this.name = null;
        this.description = null;
    }

    public Product(String name) {
        this.name = name;
        this.description = null;
    }
    public Product(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
