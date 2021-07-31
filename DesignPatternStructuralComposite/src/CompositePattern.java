public class CompositePattern {
    public static void main(String[] args) {

        Music Band = new Music("Sheila on 7","Top Rank Band", 30000);
        Music Solo = new Music("Rich Brian","Top Rank solo", 20000);

        Music Rap1 = new Music("Ramen girl","Solo", 10000);
        Music Rap2 = new Music("Joe Million","Solo", 10000);

        Music Pop1 = new Music("Noah","Band", 10000);

        Music Pop2 = new Music("Ungu","Band", 10000);


        Band.add(Solo);

        Band.add(Pop1);
        Band.add(Pop2);

        Solo.add(Rap1);
        Solo.add(Rap2);



        //print all employees of the organization
        System.out.println(Band);

        for (Music topRatemusic : Band.getInformation()) {
            System.out.println(topRatemusic);

            for (Music secondrate : topRatemusic.getInformation()) {
                System.out.println(secondrate);
            }
        }
    }
}
