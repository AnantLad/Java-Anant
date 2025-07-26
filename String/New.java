package String;

public class New {
static void characterFrequency(String str) {
    int[] freq = new int[256];
    for (char c : str.toCharArray()) freq[c]++;

    for (int i = 0; i < 256; i++) {
        if (freq[i] > 0 && (char)i != ' ') {
            System.out.print((char) i + " : " + freq[i] + " ");
        }
    }
}

    
public static void main(String[] args) {
       String str = "my name is anant kumar lad " ;
       str.split(" "); 
       characterFrequency(str);
    } 
}
 