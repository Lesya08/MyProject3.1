public class BonusMilesService {
    public int calculate(int price) {
        int miles = price / 20;  // кол-во бонусных миль за покупку билета
        return miles;
    }
}
