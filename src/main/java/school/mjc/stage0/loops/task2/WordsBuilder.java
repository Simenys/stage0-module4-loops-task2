package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String text = "";
        for (int i = 0; i < chars.length; i++) {
            text += chars[i];
        } System.out.println(text);
    }
}



