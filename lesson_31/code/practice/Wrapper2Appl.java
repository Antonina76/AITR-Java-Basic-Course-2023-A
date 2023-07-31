package practice;

public class Wrapper2Appl {
    public static void main(String[] args) {
        JsonWrapper2<String> wrapper2 = new JsonWrapper2<>("10.0");
        System.out.println(wrapper2);
        String  a = wrapper2.getValue();
        System.out.println(a + "5");
        JsonWrapper2<Integer>wrapper3 = new JsonWrapper2<>(50);

        System.out.println(wrapper3);
        int b = wrapper3.getValue();
        System.out.println(b*10);

        //public <T> void genericDisplay(T element) {
        //        System.out.println(element.getClass() + " = " + element);
        //    }

    }
}
