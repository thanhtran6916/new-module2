public class Customer {
    private String name;
    private String add;
    private int age;

    public Customer(String name, String add, int age) {
        this.name = name;
        this.add = add;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAdd() {
        return add;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", add='" + add + '\'' +
                ", age=" + age +
                '}';
    }
}
