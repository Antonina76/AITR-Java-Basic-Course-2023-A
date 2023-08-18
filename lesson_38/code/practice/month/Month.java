package practice.month;

public enum Month {

   //имена констант в Java всегда задаются заглавными буквами
    JAN(31),FEB(28),MAR(31),APR(30),MAI(31),JUN(30),JUL(31),
    AUG(31),SEP(30),OKT(31),NOV(30),DEC(31);

    //fields
    private int days;

    //constructor
   private Month(int days) {//название класса enum и конструктора совпадают
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
//метод увеличивает кол-во месяцев
    public Month plusMonth (int quantity){
       int index = ordinal();//текущий номер месяца
       index = index + quantity;//увеличили месяц
       Month[]values = values();//определили массив values
       return values[index % values.length];//index разделили с остатком на (12) values.length
    }
//метод возвращает имя месяца по его номеру
    public static String getName(int num){//static - обращаемся к имени класса с большой буквы
       Month[]values = values();
       return values[(num-1)%values.length].name();//возвращаем имя месяца
    }

}
