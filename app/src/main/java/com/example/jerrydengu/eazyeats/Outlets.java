package com.example.jerrydengu.eazyeats;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by JAMBO on 1/27/17.
 * EazyEats
 */

public class Outlets {

    private static final Random RANDOM = new Random();

    public static int getRandomAvatar() {
        switch (RANDOM.nextInt(10)) {
            default:
                return R.mipmap.ic_launcher;
        }
    }

    public static int getRandomImage() {
        switch (RANDOM.nextInt(10)) {
            default:
                return R.mipmap.ic_launcher;
        }
    }

    static ArrayList<Outlet> getOutlets(int amount) {
        ArrayList<Outlet> outletArrayList = new ArrayList<>();

        for(int i=0; i < amount; i++){
            outletArrayList.add(new Outlet(
                    "Amanzi Restaurant",
                    "Lorem ipsum macu macu dolor sit amet, consectetur adipiscing elit. Did nt wan na addm ore la yout stoth e samp le.",

                    "http://www.image.com/image.png,http://www.image.com/image.png,http://www.image.com/image.png",

                    "http://www.image.com/image.png,",

                    "Jerry",
                    "\"The ambience is good and the food is delicious. Nice place\"",
                    5
            ));
        }

        return outletArrayList;
    }

}
