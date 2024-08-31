package LibraryManagementSystem;

public abstract class Person {
    private String name;
    private String contact;

    public Person(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", contact='" + contact + '\'' + '}';
    }

    public String getName() {
        return this.name;
    }
}
