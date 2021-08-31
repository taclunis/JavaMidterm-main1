package string.problems;

public class DuplicateWord {


    public static void main(String[] args) {

        /*
         Write a java program to find the duplicate words and their number of occurrences in the string.
            Also, Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
int count;

st = st.toLowerCase();

String words[] = st.split("");
        int j = 0;
        System.out.println("duplicate words in a string:");
        for(int i = 0; i < words.length; i++) {
            count = 1;
            for(int y = i + 1; y < words.length; y++);{

                if(words[i].equals(words[j])); {
                    count ++;
                    words[j] = String.valueOf(0);

                }
                if(count > 1 && words[i] != "0");

                System.out.println(words[i]);
            }
        }

    }

}
