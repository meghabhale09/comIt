package Bank;

public class Manager implements Workable {
    private int id;
    private String name;
    private int salary;

    public Manager(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int work(int hours) {
        return 0;
    }
}