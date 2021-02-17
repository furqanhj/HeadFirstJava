package chapterOne;

public class furqanPhraseOMatic {

    public static void main(String[] args) {

        String[] name1 = {"Furqan", "Saba", "Muhammad", "Moosa", "Muaz", "Javed", "Munawar", "Faisal", "Hira", "Azaan", "Abaan", "Fareeha", "Zeeshan", "Taimoor", "Rayan", "Zahid", "Kathleen", "Yafi", "Yasir"};
        String[] emotion = {"Loves", "Hates", "Gets Along With", "will kill", "likes", "is friend with", "fakes their relation with", "wants to be like", "respects", "admires", "is loyal to"};
        String[] name2 = {"Azra aapi", "Athar", "Rabbia", "Ali", "Waqas", "Samreen", "Maryum", "Hania", "Abdulla", "Guriya", "Noman", "Adeel", "Shanza"};

        //finding the words in each list:
        int name1Length = name1.length;
        int emotionLength = emotion.length;
        int name2Length = name2.length;
//        System.out.println(name1Length);
//        System.out.println(emotionLength);
//        System.out.println(name2Length);

        //generating 3 random numbers:
        int randomName1 = (int) (Math.random() * name1Length);
        int randomEmotion = (int) (Math.random() * emotionLength);
        int randomName2 = (int) (Math.random() * name2Length);

        //building a random phrase:
        String phrase = name1[randomName1] + " " + emotion[randomEmotion] + " " + name2[randomName2];

        System.out.println(phrase);
    }
}
