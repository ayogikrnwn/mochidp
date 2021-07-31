
public class Demo {
    public static void main(String[] args) {
        MusicApi MusicApi = new ProxyMusicApi("D'masiv Jangan Menyerah");

        System.out.println("Load Music detail ke-1");
        MusicApi.getDetailMusic();

        System.out.println("Load Music detail ke-2");
        MusicApi.getDetailMusic();
    }
}
