package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        char lowChar = Character.toLowerCase(character);
        if (lowChar >= 'a' && lowChar <= 'z' || lowChar >= 'A' && lowChar <= 'Z'){
           if(lowChar == 'a' || lowChar == 'e' || lowChar == 'u' || lowChar == 'o' || lowChar == 'i') {
               System.out.println("Vowel");
           }else {
               System.out.println("Consonant");
           }
        }else {
            System.out.println("wrong alphabet!");
        }
    }
}
