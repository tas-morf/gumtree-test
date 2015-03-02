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
                    .name("advertiser")
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
            .build(),
            Ad.newBuilder()
            .title("Charming 2 bedroom property in the picturesque village of Ashfield")
            .contact(Contact.newBuilder()
                    .name("Lucie Bull")
                    .phone("02055556666")
                    .postingPeriod("2+ years")
                    .build())
            .description(
                    "The Clachan lies on the outskirts of th village etc etc etc. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.")
            .location("Whitechapel, Whitechapel")
            .price(135000)
            .reference(1102111111)
            .latitude(56.225)
            .longitude(-3.9208)
            .shareUrl("http://www.gumtree.com/p/pets/premium-quality-hypoallergenic-dog-food/1102460807.")
            .imageUrls(getImageArrayList(
                    "http://i.ebayimg.com/00/s/NjgyWDEwMjQ=/z/VVwAAOSwv0tU8J7U/$_86.JPG",
                    "http://i.ebayimg.com/00/s/NjgyWDEwMjQ=/z/6N0AAOSwstxU8J7M/$_86.JPG",
                    "http://i.ebayimg.com/00/s/NjgyWDEwMjQ=/z/KosAAOSwZjJU8J7R/$_86.JPG",
                    "http://i.ebayimg.com/00/s/NjgyWDEwMjQ=/z/2OgAAOSwpDdU8J7K/$_86.JPG",
                    "http://i.ebayimg.com/00/s/NjAwWDgwMA==/$(KGrHqFHJEoFDOIebjmUBQ0o0tpLlw~~48_86.JPG",
                    "http://i.ebayimg.com/00/s/NTQ3WDU0Ng==/z/KikAAOSwZjJU8J7O/$_86.JPG"))
            .metadataList(Arrays.asList(Metadata.newBuilder()
                            .name("Date Posted")
                            .value("Yesterday")
                            .build(),
                    Metadata.newBuilder()
                            .name("Number of beds")
                            .value("2")
                            .build(),
                    Metadata.newBuilder()
                            .name("Seller type")
                            .value("Private")
                            .build()
            ))
            .build(),
            Ad.newBuilder()
                    .title("B2B Account Manager")
                    .contact(Contact.newBuilder()
                            .name("advertiser")
                            .email("random@email.com")
                            .postingPeriod("less than a month")
                            .build())
                    .description(
                            "Our client netowrk bla bla bla etc etc etc. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.")
                    .location("Poole, Dorset")
                    .price(-1)
                    .reference(110215511)
                    .latitude(50.7167)
                    .longitude(-1.9833)
                    .shareUrl("http://www.gumtree.com/p/pets/premium-quality-hypoallergenic-dog-food/1102460807.")
                    .imageUrls(getImageArrayList(
                            "http://i.ebayimg.com/00/s/MTAyNFg3MjQ=/z/5eEAAOSwD0lUdE57/$_86.JPG",
                            "http://i.ebayimg.com/00/s/NzIzWDEwMjQ=/z/A3QAAOSwQJhUdE6G/$_86.JPG"))
                    .metadataList(Arrays.asList(Metadata.newBuilder()
                                    .name("Date Posted")
                                    .value("Yesterday")
                                    .build(),
                            Metadata.newBuilder()
                                    .name("Contract type")
                                    .value("Permanent")
                                    .build()
                    ))
                    .build(),
            Ad.newBuilder()
                    .title("Singer and guitarist seeks drummer and bassist")
                    .contact(Contact.newBuilder()
                            .name("advertiser")
                            .email("random@email.com")
                            .postingPeriod("less than a month")
                            .build())
                    .description(
                            "Looking for etc etc etc. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.")
                    .location("Swindon, Wiltshire")
                    .imageUrls(new ArrayList<String>())
                    .price(-1)
                    .reference(110215521)
                    .latitude(50.7167)
                    .longitude(-1.9833)
                    .shareUrl("http://www.gumtree.com/p/pets/premium-quality-hypoallergenic-dog-food/1102460807.")
                    .metadataList(Arrays.asList(Metadata.newBuilder()
                                    .name("Date Posted")
                                    .value("Yesterday")
                                    .build()
                    ))
                    .build(),
            Ad.newBuilder()
                    .title("Female ginger kitten")
                    .contact(Contact.newBuilder()
                            .name("Lucy")
                            .email("random@email.com")
                            .phone("07760000000")
                            .postingPeriod("one year")
                            .build())
                    .description(
                            "Beautiful Female ginger kitten etc etc etc. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.")
                    .location("Exeter, Devon")
                    .imageUrls(getImageArrayList(
                            "http://i.ebayimg.com/00/s/Njc4WDQzMw==/z/qmQAAOSweW5U89mg/$_86.JPG",
                            "http://i.ebayimg.com/00/s/NTMzWDQyOQ==/z/2a0AAOSwPYZU89mi/$_86.JPG",
                            "http://i.ebayimg.com/00/s/Nzk2WDQ4OQ==/z/Ob8AAOSwBahU89mk/$_86.JPG"))
                    .price(60)
                    .reference(110215521)
                    .latitude(50.7167)
                    .longitude(-3.5333)
                    .shareUrl("http://www.gumtree.com/p/pets/premium-quality-hypoallergenic-dog-food/1102460807.")
                    .metadataList(Arrays.asList(Metadata.newBuilder()
                                    .name("Date Posted")
                                    .value("27/02/2015")
                                    .build(),
                            Metadata.newBuilder()
                                    .name("Ready for rehome")
                                    .value("07/06/2015")
                                    .build(),
                            Metadata.newBuilder()
                                    .name("Date of birth")
                                    .value("03/01/2015")
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
