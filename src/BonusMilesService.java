public class BonusMilesService {
    public int calculate(int price) {
        int milePerPrice = 20; //количество рублей за одну милю
        int miles = price / milePerPrice; // количество миль
        return miles;
    }
}
