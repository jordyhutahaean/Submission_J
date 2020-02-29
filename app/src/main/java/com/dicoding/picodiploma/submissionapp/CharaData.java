package com.dicoding.picodiploma.submissionapp;

import java.util.ArrayList;

public class CharaData {
    private static String[] charaNames = {
            "Fate/GrandOrder",
            "Arknights",
            "Love Live : School Idol Festival All-Stars",
            "Azur Lane",
            "Girls Frontline",
            "Princess Connect Re:dive",
            "THE IDOLM@STER CINDERELLA GIRLS : STARLIGHT STAGE",
            "Dragalia Lost",
            "KOF ALL STARS",
            "Dragonball Z: Dokkan Battle"
    };

    private static String[] charaDetails = {
            "Fate/GrandOrder is a japanese gacha game created by DelightWorks. It acts as another story of the original Fate franchise. You will become the Master of Chaldea, an organization that's sole purpose is to ensure  the survival of human.",
            "Arknights is a japanese gacha game created by YoStar. You Will play as Doctor, a person with no memories of his past and was tasked to lead a group in Rhodes Island to Rebel against the group known as Reunion.",
            "Love Live : School Idol Festival All-Stars is a japanese gacha game by KLab. You will play as a member who acts as manager of the Nijigasaki Idol Club. In your journey, you will also interact with the Legendary Love Live Idol Group such as μ's and Aqours.",
            "Azur Lane is a japanese gacha game by YoStar. You will play as Admiral of a certain fleet. Collect the fleet girls to strengthen your fleet and defeat the enemies.",
            "Girls Frontline is a japanese gacha game by Sunborn Games. You Will play as a Commander in a certain base. Collect the gun-girls to strengthern your units and defeat the enemies.",
            "Princess Connect Re:dive is a japanese gacha game by Cygames Inc. You will play as Hero, a guy who jumped to another world and will journey through the land of Astrea.",
            "The IDOLM@STER CINDERELLA GIRLS : STARLIGHT STAGE is a japanese gacha game by BANDAI NAMCO. You will certainly play as the producer, who will scout for new Idol members and train them to be proper idol.",
            "Dragalia Lost is a japanese gacha game by Cygames Inc. It's story revolves around bonds between humans and dragons.",
            "KOF ALL STARS is a game by Netmarble. Collect the Legendary character from SNK Series such as Kyo Kusanagi, Iori Yagami, Mr.Karate, Mai Shiranui, Terry Bogard, etc.",
            "Dragonball Z: Dokkan Battle is a japanese gacha game by BANDAI NAMCO. Colllect the Legendary characters from Dragonball franchise such as Son Goku, Vegeta, Son Gohan, Picollo, YAMCHA, to defeat your arch enemies"
    };

    private static int[] charaImages = {
            R.drawable.fgo,
            R.drawable.arknights,
            R.drawable.llsifas,
            R.drawable.azurlane,
            R.drawable.gfl,
            R.drawable.pricon,
            R.drawable.imascgss,
            R.drawable.dragalia,
            R.drawable.kofas,
            R.drawable.dbzdb
    };

    static ArrayList<Chara> getListData() {
        ArrayList<Chara> list = new ArrayList<>();
        for (int position = 0; position < charaNames.length; position++) {
            Chara chara = new Chara();
            chara.setName(charaNames[position]);
            chara.setDetail(charaDetails[position]);
            chara.setPhoto(charaImages[position]);

            list.add(chara);
        }
        return list;
    }
}
