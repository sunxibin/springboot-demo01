package practices;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author shannon sun
 * @date 2019/4/28 21:34
 */
@SpringBootTest
public class StringTest {
    public static void main(String[] args) {

    }

    @Test
    public void test01() {
        String s1 = "aa";
        String s2 = "bb";
        String s3 = "aabb";
        String s4 = s1 + s2;
        String s5 = "aa" + "bb";
        String s6 = s1 + "bb";
        String s7 = "aa" + s2;

        System.out.println(s3 == s4); //false
        System.out.println(s3 == s5); //true
        System.out.println(s4 == s5); //false
        System.out.println(s3 == s6); //false
        System.out.println(s3 == s7); //false
        System.out.println(s4 == s6); //false
        System.out.println(s4 == s7); //false
        System.out.println(s6 == s7); //false
    }
}
