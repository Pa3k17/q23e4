package unit;

public class main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        int result = service.calculateBonus(1000);
        System.out.println(result);

    }
}
