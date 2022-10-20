package base.Lesson10_RegEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson10_RegExpessionTask {
    public static void main(String[] args) {
        //checkEmailAddress();
        //checkPhoneNumber();
        //checkBookISBN();
        //checkYearFormat();
    }

    public static void checkEmailAddress() {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.next();
        Pattern email_pattern= Pattern.compile("[a-zA-Z0-9]{3,15}@[a-zA-Z0-9]{3,15}[.][a-zA-Z]{2,5}");
        System.out.println(email_pattern.matcher(email).find());
    }

    public static void checkPhoneNumber() {
        Scanner phone = new Scanner(System.in);
        String number = phone.next();
        Pattern phone_check = Pattern.compile("^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$"
                + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$"
                + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$");
        System.out.println(phone_check.matcher(number).find());
    }

    public static void checkBookISBN() {
        List<String> isbns = new ArrayList<String>();

//Valid ISBNs
        isbns.add("ISBN 978-0-596-52068-7");
        isbns.add("ISBN-13: 978-0-596-52068-7");
        isbns.add("978 0 596 52068 7");
        isbns.add("9780596520687");

//Invalid ISBNs
        isbns.add("ISBN 11978-0-596-52068-7");
        isbns.add("ISBN-12: 978-0-596-52068-7");
        isbns.add("978 10 596 52068 7");
        isbns.add("119780596520687");

        String regex = "^(?:ISBN(?:-1[03])?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})[- 0-9X]{13}$|97[89][0-9]{10}$|(?=(?:[0-9]+[- ]){4})[- 0-9]{17}$)(?:97[89][- ]?)?[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$";

        Pattern pattern = Pattern.compile(regex);

        for (String isbn : isbns)
        {
            Matcher matcher = pattern.matcher(isbn);
            System.out.println(matcher.matches());
        }
    }
    public static void checkYearFormat() {
        String date = "2022-Oct-25";
        System.out.println(date.matches("[12][0-9]{3}-(((Feb)-[0-2][0-9])|(((Jan)|(Mar)|(May)|(Jul)|(Aug)|(Oct)|(Dec))-(([0-2][0-9])|(3[01])))|(((Apr)|(Jun)|(Sep)|(Nov))-(([0-2][0-9])|(30))))"));
    }

}
