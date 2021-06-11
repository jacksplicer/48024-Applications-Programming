public class StretchWith2Vowels {
    public static void main(String[] args) {
        String s;
        while(!(s = newSentence()).equals("*")) {
            System.out.println("Matching words = " + matchWordCount(s.toLowerCase()));
        }
        System.out.println("Done");
    }
    
    public static String newSentence() {
        System.out.print("Sentence: ");
        return In.nextLine();
    }
    
    public static int matchWordCount(String sentence) {
        int count = 0;
        for(String word: sentence.split(" +")) {
            if(matches(word)) {
                count++;
            }
        }
        return count;
    }
    
    public static boolean matches(String word) {
        int count = 0;
        for(String part: word.split("z")) {
            if (vowelCount(part) == 2) {
                count++;
                return true;
            }
        }
        return false;
    }
    
    public static int vowelCount(String part) {
        int vowels = 0;
        String s = part;
        for(int i = 0; i < s.length(); i++) {
            if(isVowel(s.charAt(i))) {
                vowels++;
            }
        }
        return vowels;
    }
    
    public static boolean isVowel(char c) {
        return "aeiou".contains("" + c);
    }
}
