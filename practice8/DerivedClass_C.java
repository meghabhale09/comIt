package practice8;

public class DerivedClass_C extends BaseA {
    BaseB value;

    public DerivedClass_C(int baseA_var) {
        super(baseA_var);
    }

    public DerivedClass_C() {
        super(12);
    }

    @Override
    public String toString() {
        return "DerivedClass_C{" +
                "value=" + value +
                '}';
    }
}
