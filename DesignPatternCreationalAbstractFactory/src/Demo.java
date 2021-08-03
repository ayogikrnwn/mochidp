/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Demo {
    private static UploadMusic uploadNewMusic(String category){
        UploadMusic upMusic = null;
        MusicFactory factory;

        if(category.toLowerCase().contains("music")){
            factory = new ByMusic();
            upMusic = new UploadMusic(factory);
        }else if(category.toLowerCase().contains("artist")){
            factory = new ByArtist();
            upMusic = new UploadMusic(factory);
        }else{
            System.out.println("Kategori tidak ditemukan..");
        }
        return upMusic;
    }

    public static void main(String[] args) {
        String kategori = "";
        UploadMusic upMusic;

        kategori = "artist";
        upMusic = uploadNewMusic(kategori);
        upMusic.create();

        kategori = "music";
        upMusic = uploadNewMusic(kategori);
        upMusic.create();
    }
}
