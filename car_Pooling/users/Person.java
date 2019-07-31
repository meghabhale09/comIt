package car_Pooling.users;

import car_Pooling.roles.Role;

public class Person {
    private  int id;
    private  String name;
    private Role role;

        public Person(int id, String name, Role role) {
            this.id = id;
            this.name = name;
            this.role = role;
        }

    public int getId() {
        return id;
    }

    public boolean isOwner(){
            return (role.getRole().equalsIgnoreCase("owner"));
        }

        public String getName() {
            return name;
        }
}
