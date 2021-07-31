public class StrategyPatternDemo {
    public static void main(String[] args) {
        UpdateMusic update = new UpdateMusic(new AddMusic());
        System.out.println("Penghitung Unggahan Musik");
        System.out.println("10 Lagu Baru Ditambhkan, Total Lagu Sekarang :" + update.executeStrategy(10, 10));

        update = new UpdateMusic(new DeleteMusic());
        System.out.println("5 Lagu Dihapus, Total Lagu Sekarang :" + update.executeStrategy(20, 5));

    }
}