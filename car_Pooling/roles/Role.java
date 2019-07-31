package car_Pooling.roles;

public class Role {
    private int id;
    private  String role;

    public Role(int id, String role) {
        this.id = id;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public int getId() {
        return id;
    }
}
