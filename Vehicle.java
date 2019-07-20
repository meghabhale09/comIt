public class Vehicle {
    private String name;
    private String type;
    float commercialValue;

    public Vehicle(String name, String type, float commercialValue) {
        this.name = name;
        this.type = type;
        this.commercialValue = commercialValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getCommercialValue() {
        return commercialValue;
    }

    public void setCommercialValue(float commercialValue) {
        this.commercialValue = commercialValue;
    }


}
