package HWork;

public class Test2 <T> {
    T obj;
    //constructor


    public Test2(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }


        public static void main(String[] args) {
                Test2<Integer> iObj = new Test2<Integer>(15);
                System.out.println(iObj.getObj());
                Test2<String> sObj = new Test2<String>("GeeksForGeeks");
                System.out.println(sObj.getObj());
            }
        }

//The type parameters naming conventions are important to learn generics thoroughly. The common type parameters are as follows:
//
//T – Type
//E – Element
//K – Key
//N – Number
//V – Value
//https://www.geeksforgeeks.org/generics-in-java/

