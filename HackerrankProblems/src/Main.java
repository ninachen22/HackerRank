public class Main {

    public int count = 0;

    public static void main(String[] args) {
        System.out.println(savingLives("thisnotpangram"));
    }

    // check if pangram
    public static boolean savingLives(String s) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        boolean alive = true;
        String lows = s.toLowerCase();
        for (int i = 0; i < alpha.length(); i++) {
            if (!lows.contains(String.valueOf(alpha.charAt(i)))) {
                alive = false;
            }
        }
        return alive;
    }

//    public boolean solution(String S) {
//        // Implement your solution here
//        boolean lower = false;
//        boolean upper = false;
//        boolean special = false;
//        boolean digit = false;
//        if (S.length() < 6) {
//            return false;
//        }
//        if (S.contains(" ")) {
//            return false;
//        }
//        for (int i = 0; i < S.length(); i++) {
//            if (Character.isLowerCase(S.charAt(i))) {
//                lower = true;
//            }
//            if (Character.isUpperCase(S.charAt(i))) {
//                upper = true;
//            }
//            if (!Character.isDigit(S.charAt(i)) && !Character.isAlphabetic(S.charAt(i))) {
//                special = true;
//            }
//            if (Character.isDigit(S.charAt(i))) {
//                digit = true;
//            }
//        }
//        return lower && upper && special && digit;
//    }

    public int requiredChars(String pw) {
        // aaaaaaa
        // aa
        // Ab!1
        int reqChars = 0;
        if (pw.length() >= 6 && count < 4) {
            reqChars = 4 - count;
        } else if (pw.length() < 6 && count < 4) {
            // aaaaa wouldn't have to worry aobut length req
            if (pw.length() + (4 - count) < 6)
                // 6 - pw length  4 - count
                // 4- count
                reqChars = (4 - count);
        } else if (pw.length() < 6 && count == 4) {
            reqChars = 6 - pw.length();
        }
        return reqChars;
    }

    public void isUppercase(String pw) {
        for (int i = 0; i < pw.length(); i++) {
            if (Character.isUpperCase(pw.charAt(i))) {
                count++;
                break;
            }
        }
    }

    public void isLowercase(String pw) {
        for (int i = 0; i < pw.length(); i++) {
            if (Character.isLowerCase(pw.charAt(i))) {
                count++;
                break;
            }
        }
    }

    public void isNumber(String pw) {
        for (int i = 0; i < pw.length(); i++) {
            if (Character.isDigit(pw.charAt(i))) {
                count++;
                break;
            }
        }
    }

    public void isSpecial(String pw) {
        for (int i = 0; i < pw.length(); i++) {
            if (!Character.isDigit(pw.charAt(i)) && Character.isAlphabetic(pw.charAt(i))) {
                count++;
                break;
            }
        }
    }
}
