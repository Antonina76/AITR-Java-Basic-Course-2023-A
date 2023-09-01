package HW_42.forum.dao;

public enum Menu {
    ADD(1),LIST(2),REMOVE(3),FIND_ID(4),FIND_AUTHOR (5),EXIT(6);

    private int menuNum;


    //constructor
    Menu(int menuNum) {

        this.menuNum = menuNum;
    }
    //getter and setter

    public int getMenuNum() {

        return menuNum;
    }

    public void setMenuNum(int menuNum) {

        this.menuNum = menuNum;
    }

    //method
    public static void printMenu() {
     Menu[] menu = Menu.values();
        for (int i = 0; i < Menu.values().length; i++) {
            System.out.print((menu[i].menuNum) + " - " + menu[i] + " | ");
        }
    }
}
