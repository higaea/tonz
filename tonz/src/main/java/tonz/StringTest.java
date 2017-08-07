package tonz;

/**
 * Created by dhl on 2017/8/7.
 */
public class StringTest {

    public static void main(String[] args) {

        String s1 = new String("abc");
        String s2 = new String("abc");
        if(s1 == s2) {
            System.out.println("s1==s2");
        }
        else {
            System.out.println("s1 != s2");
        }


    }
}
