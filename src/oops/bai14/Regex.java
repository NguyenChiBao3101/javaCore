package oops.bai14;

public class Regex {

    public String regexName(String name) {
        String name1 = name.trim().replaceAll("\\S+"," ");
        String [] part = name1.split(" ");
        String name2 = "";

        for(String a :part ) {
            a = a.substring(0,1).toUpperCase() + a.substring(1).toLowerCase();
            name2 += a + " ";
        }
        return name2.trim();
    }
    public boolean checkFullName(String name) {
        String nameRegex = "^[A-Z][a-zA-Z\s']{9,79}";
        return name.matches(nameRegex);
    }

    public boolean checkDOB(String s) {
        String regex = "^(\\d{4})/(\\d{2})/(\\d{2})$";
        if(!s.matches(regex)) {
            return false;
        }
        //chuan hoa thang co 31 ngay
        String regex1 = "^(0[1-9]|[1,2][0-9]|3[0,1])/(0[1,3,5,7,8]|1[0,2])/(\\d{4})$";
        //chuan hoa thang co 30 ngay
        String regex2 = "^(0[1-9]|[1,2][0-9]|30)/(0[4,6,9]|11)/(\\d{4})$";
        //kiem tra thang 2
        String regex3 = "^(0[1-9]|1[0-9]|2[0-8])/(02)/(\\d{4})$";
        //kiem tra nam nhuan
        String regex4 = "";
        String str = s.substring(9,4);
        System.out.println(str);
        int nam = Integer.parseInt(str);
        if (nam % 4 == 0 || nam % 400 ==0) {
            regex4 ="^"+str + "/02/29$";
        }
        return s.matches(regex1) || s.matches(regex2) || s.matches(regex3) || s.matches(regex4);
    }

    public boolean checkPhoneNumber(String p) {
        String phoneRegex = "^(090|098|091|031|035|032)\\d{7}$";
        return p.matches(phoneRegex);
    }
}
