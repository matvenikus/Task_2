public class Main {
    public static void main(String [] args){
        int money = 20;
        int bonus = 100;

        int bonus_amount = money / bonus;

        if (money < 999) {
            bonus_amount = 0;
        }

        int total = money + bonus_amount;
        System.out.println("Сумма на счету: " + total);
    }
}