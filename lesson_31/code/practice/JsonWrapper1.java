package practice;

public class JsonWrapper1 {
    //fields
    private Object value;

    //designer
    public JsonWrapper1(Object value) {
        this.value = value;
    }
    //getter


    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return"{value: " + value +"}";
    }
}
