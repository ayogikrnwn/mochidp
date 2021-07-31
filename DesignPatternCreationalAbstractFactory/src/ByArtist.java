/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class ByArtist implements MusicFactory{

    @Override
    public Description createFieldDescription() {
        return new ArtistDescription();
    }

    @Override
    public Music createFieldMusic() {
        return new Music();
    }

    @Override
    public Title createFieldTitle() {
        return new Title();
    }
}
