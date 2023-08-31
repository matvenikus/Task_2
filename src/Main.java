public class Main {
    public static void main(String [] args){
        int money = 20;
        int bonus = 100;

        int bonusAmount = money / bonus;

        if (money < 999) {
            bonusAmount = 0;
        }

        int total = money + bonusAmount;
        System.out.println("Сумма на счету: " + total);
    }
}