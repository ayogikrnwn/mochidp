/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Hashtable;

public class UserCache {

    private static Hashtable<String, User> userMap  = new Hashtable<String, User>();

    public static User getUser(String shapeId) {
        User cachedShape = userMap.get(shapeId);
        return (User) cachedShape.clone();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes

    public static void loadCache() {
        Music1 music1 = new Music1();
        music1.setId("1");
        userMap.put(music1.getId(),music1);

        Music2 music2 = new Music2();
        music2.setId("2");
        userMap.put(music2.getId(),music2);

        Music3 music3 = new Music3();
        music3.setId("3");
        userMap.put(music3.getId(), music3);
    }
}
