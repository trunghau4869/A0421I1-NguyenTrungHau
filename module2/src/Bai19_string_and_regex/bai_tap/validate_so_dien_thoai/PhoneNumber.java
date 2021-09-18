package Bai19_string_and_regex.bai_tap.validate_so_dien_thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String PHONENUMBER ="^\\d{2}-0\\d{9}$";
    private static PhoneNumber phoneNumber;
    private static final String number[]={"84-0123132123","1A-0123123132","15-0123132133","84-1231231324","8400123123123"};
    public PhoneNumber() {
    }
    private boolean validate(String regex){
        Pattern pattern = Pattern.compile(PHONENUMBER);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        phoneNumber=new PhoneNumber();
        for(String phone:number){
            boolean valid=phoneNumber.validate(phone);
            System.out.println(valid);
        }
    }
}
