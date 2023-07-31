package practice;

public class JsonWrapper2 < T >{
    private T value;
     //designer

    public JsonWrapper2(T value) {
        this.value = value;
    }
    //getter

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{value: " + value +"}";
    }
}
