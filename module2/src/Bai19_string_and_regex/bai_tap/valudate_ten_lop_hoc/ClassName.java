package Bai19_string_and_regex.bai_tap.valudate_ten_lop_hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static final String CLASSNAME_REGEX = "^[CAP]\\d{4}[GHIKLM]$";
    private static final String name[]={"M0318G", "P0323A","C1234M","C1234M0","C123MM","A1234K"};
    private static ClassName className;
    public ClassName() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        className=new ClassName();

        for(String Name:name){
           boolean valid=className.validate(Name);
            System.out.println(valid);
        }
    }
}
