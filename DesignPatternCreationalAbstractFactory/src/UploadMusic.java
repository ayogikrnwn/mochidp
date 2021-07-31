/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class UploadMusic {
    private Description description;
    private Title title;
    private Music music;

    public UploadMusic(MusicFactory f){
        description = f.createFieldDescription();
        title = f.createFieldTitle();
        music = f.createFieldMusic();
    }

    public void create(){
        description.create();
        title.create();
        music.create();
    }
}
