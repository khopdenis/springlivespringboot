package internship.springlivespringboot.domain;

public class Car {

    private Long id;
    private String group;
    private String brand;
    private String model;
    private Integer horsePower;

    public Car(Long id, String group, String brand, String model, Integer horsePower) {
        this.id = id;
        this.group = group;
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
