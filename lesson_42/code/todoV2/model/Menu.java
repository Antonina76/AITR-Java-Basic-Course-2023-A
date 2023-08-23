package todoV2.model;

public enum Menu {
    ADD(1), LIST(2), REMOVE(3), FIND(4),EXIT(5);
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

    public static void printMenu() {
        Menu[] menu = Menu.values();
        for (int i = 0; i < Menu.values().length; i++) {
            System.out.print((menu[i].menuNum) + " - " + menu[i] + " | ");
        }
    }
}