package pattern.demo.command;

public class Resource {
    private String resourceName;

    public Resource (String name) {
        this.resourceName = name;
    }

    public String toString() {
        return this.resourceName;
    }
}
