package nod;

public class NodArgumentAppl {
    public static void main(String[] args) {//в качеству аргумента передаем строки из массива который называется args
    int n =args.length;//сколько параметров передали на вход в командной строке
     int a = Integer.parseInt(args[0]);
     int b = Integer.parseInt(args[1]);
     Nod nod;
     nod = new Nod();
     System.out.println(nod.nod(a,b));

    }

}
