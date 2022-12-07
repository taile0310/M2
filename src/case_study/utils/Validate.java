package case_study.utils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String SERVICECODE_REGEX = "^[SV]+[VL|RO]+.+[0-9]{4}$";
    public static final String SERVICENAME_REGEX = "^[A-Z]{1}[a-z]+$";
    public static final String AREA_REGEX = "^[3-9]+[0-9]{1}|[1-9]+[0-9]+[0-9]";
    public static final String AREAPOOL_REGEX = "^[3-9]$";
    public static final String COST_REGEX = "^[1-9]+$";
    public static final String NUMPEOPLE_REGEX = "^([1-9]{1}|10|11|12|13|14|15|16|17|18|19)$";
    public static final String NUMFLOOR_REGEX = "^[1-9]+$";
    public static final String RENTALTYPE_REGEX = "^(Day|Month|Year)$";
    public static final String TYPEROOM_REGEX = "^(Standard|Vip|Deluxe)$";
    public static final String FREESERVICE_REGEX = "^(Car|Lunch|Spa)$";
    private static final String BIRTHDAY_REGEX = "^[0-9]{2}-[0-9]{2}-[0-9]{4}$";

//    static final String[] validCode = new String[]{"SVVL-0001","SVRO-0002","SvVL-0001","SVrO-0002","SVVL-00012"};
//    static final String[] validName = new String[]{"Tai", "Quan", "ThonG", "THe"};
//    static final String[] validArea = new String[]{"31","12","533"};
//    static final String[] validCost = new String[]{"120000","a15000","30000c"};
//    static final String[] validPeople = new String[]{"15","20ng","ng15"};

    //    public static boolean validateCode(String regex) {
//        pattern = Pattern.compile(SERVICECODE_REGEX);
//        matcher = pattern.matcher(regex);
//        return matcher.matches();
//    }
//    public static boolean validateName(String regex) {
//        pattern = Pattern.compile(SERVICENAME_REGEX);
//        matcher = pattern.matcher(regex);
//        return matcher.matches();
//    }
//    public static boolean validateArea(String regex){
//        pattern = Pattern.compile(AREA_REGEX);
//        matcher = pattern.matcher(regex);
//        return matcher.matches();
//    }
//    public static boolean validateCost(String regex){
//        pattern = Pattern.compile(COST_REGEX);
//        matcher = pattern.matcher(regex);
//        return matcher.matches();
//    }
    static Scanner scanner = new Scanner(System.in);

    public static String validateRegex(String regex) {
        String temp;
        while (true) {
            temp = scanner.nextLine();
            if (Pattern.matches(regex, temp)) {
                System.out.println("Add successful");
                break;
            } else {
                System.out.println("input invalid, please try agian ");
            }
        }
        return temp;
    }

//    public static void main(String[] args) {
//        for (String code : validCode) {
//            if (validateCode(code)){
//                System.out.print("true" + ",");
//            }else {
//                System.out.print("false" + ",");
//            }
//        }
//        System.out.println("\n");
//
//        for (String name : validName) {
//            if (validateName(name)) {
//                System.out.print("true" + ",");
//            } else {
//                System.out.print("false" + ",");
//            }
//        }
//        System.out.println("\n");
//
//        for (String area : validArea) {
//            if (validateArea(area)){
//                System.out.print("true" + ",");
//            }else {
//                System.out.print("false" + ",");
//            }
//        }
//        System.out.println("\n");

//        for (String cost : validCost) {
//            if (validateCost(cost)){
//                System.out.print("true" + ",");
//            }else {
//                System.out.print("false" + ",");
//            }
//        }
//        System.out.println("\n");

//        for (String people : validPeople  ) {
//            if (validateNumPeople(people)){
//                System.out.print("true" + ",");
//            }else {
//                System.out.print("false" + ",");
//            }
//        }
//        System.out.println("\n");

}


