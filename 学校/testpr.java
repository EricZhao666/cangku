package 学校;
import java.util.regex.*;
public class testpr {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("(\\d{3,4})\\-(\\d{7,8})");
        //pattern.matcher("010-12345678").matches();
        Matcher matcher = pattern.matcher("010-12345678");
        if (matcher.matches()) {
            System.out.println(matcher.group(1));
        }
    }
}
