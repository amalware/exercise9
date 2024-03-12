public abstract class Person {
    private String name; //All people have names!

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public void contact(); //Only 1
}
