package bai17_string_regualar.thuchanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    // Class được sử dụng để xác định một định dạng;
    private static Pattern pattern;
    //Class Matcher  cung cấp bộ máy xử lý biểu thức chính quy để thao tác với chuỗi ký tự.
    private Matcher matcher;
    // Format của email;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailExample() {
        //sử dụng method compile() để tạo đối tượng, với tham số là biểu thức chính quy.
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
