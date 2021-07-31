public class DecoratorDemo {


    public static void main(String[]args) {

        Music thumbnail = new Thumbnail(new JudulMusic());
        thumbnail.tambah();
        System.out.println("\n=======Mochi Group=========");

        Music subtitle = new Thumbnail(new lirik(new JudulMusic()));
        subtitle.tambah();
    }
}