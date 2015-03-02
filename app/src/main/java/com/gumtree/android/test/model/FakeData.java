package com.gumtree.android.test.model;

import com.gumtree.android.test.model.bean.Ad;
import com.gumtree.android.test.model.bean.Contact;
import com.gumtree.android.test.model.bean.Metadata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FakeData {
    private static final Ad[] FAKE_ADS = {
            Ad.newBuilder()
            .title("Alpha Romeo 147 1.6 T Spark 52 reg")
            .contact(Contact.newBuilder()
                    .name("Cool dude")
                    .email("crazy_email@email.com")
                    .phone("02055556666")
                    .postingPeriod("under a month")
                    .build())
            .description(
                    "3 door, navy blue, manual, low milage etc etc etc. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.")
            .location("Whitechapel, Whitechapel")
            .price(1200)
            .reference(1102705155)
            .latitude(51.513074)
            .longitude(-0.064094)
            .shareUrl("http://www.gumtree.com/p/pets/premium-quality-hypoallergenic-dog-food/1102460807.")
            .imageUrls(getImageArrayList(
                    "http://i.ebayimg.com/00/s/NTg1WDkzNg==/z/hUEAAOSwe-FU2cyC/$_86.JPG",
                    "http://i.ebayimg.com/00/s/NTg1WDkzNg==/z/IKMAAOSwPhdU2cyJ/$_86.JPG",
                    "http://i.ebayimg.com/00/s/NTI2WDkzNg==/z/3agAAOSwEeFU2cyU/$_86.JPG",
                    "http://i.ebayimg.com/00/s/NTg1WDkzNg==/z/hIIAAOSwNSxU2cyc/$_86.JPG",
                    "http://i.ebayimg.com/00/s/NTg1WDkzNg==/z/JfAAAOSw8d9U2cyj/$_86.JPG"))
            .metadataList(Arrays.asList(Metadata.newBuilder()
                            .name("Date Posted")
                            .value("Today")
                            .build(),
                    Metadata.newBuilder()
                            .name("Year")
                            .value("2002")
                            .build(),
                    Metadata.newBuilder()
                            .name("Model")
                            .value("147 T Spark")
                            .build(),
                    Metadata.newBuilder()
                            .name("Seller Type")
                            .value("Private")
                            .build(),
                    Metadata.newBuilder()
                            .name("Transmission")
                            .value("Manual")
                            .build(),
                    Metadata.newBuilder()
                            .name("Engine Size")
                            .value("1598")
                            .build(),
                    Metadata.newBuilder()
                            .name("Fuel Type")
                            .value("Petrol")
                            .build(),
                    Metadata.newBuilder()
                            .name("Body type")
                            .value("3 Dorr Hatchback")
                            .build(),
                    Metadata.newBuilder()
                            .name("Colour")
                            .value("Blue")
                            .build(),
                    Metadata.newBuilder()
                            .name("Mileage")
                            .value("63000")
                            .build(),
                    Metadata.newBuilder()
                            .name("Make")
                            .value("Alpha Romeo")
                            .build()
                    ))
            .build()
            
            
    };

    private static ArrayList<String> getImageArrayList(String... strs) {
        ArrayList<String> result = new ArrayList<>(strs.length);
        Collections.addAll(result, strs);
        return result;
    }

    public Ad getAd(int adId) {
        if(adId < FAKE_ADS.length) {
            return FAKE_ADS[adId];
        }
        return null;
    }
}
