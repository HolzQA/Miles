public class Main {
    public static void main(String[] args) {

        int valueTicket = 25_000;
        int valueOneBonusMile = 20;

        int bonusMiles = valueTicket / valueOneBonusMile;

        System.out.println("Вам начислено " + bonusMiles + " бонусных миль");
    }
}