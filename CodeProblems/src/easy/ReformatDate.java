package easy;

import java.util.HashMap;
import java.lang.Character;

public class ReformatDate {
    public String reformatDate(String date) {
        return getYear(date)+"-"+getMonth(parseForMonth(date))+"-"+getDay(date);
    }

    public String parseForMonth(String date){
        String month = "";       
        int letterCount = 0;
        boolean atMonth = false;
        for(int i = 0 ; i < date.length(); i ++){
            if(atMonth){
                month = month + date.charAt(i);
                letterCount++;
                if(letterCount >= 3){
                    break;
                }
            }else if(date.charAt(i) == ' '){
                atMonth = true;
                continue;
            }
        }
        return month;
    }

    public String getMonth(String month){
        HashMap<String, String> months = new HashMap<>();
        months.put("Jan", "01");
        months.put("Feb", "02");
        months.put("Mar", "03");
        months.put("Apr", "04");
        months.put("May", "05");
        months.put("Jun", "06");
        months.put("Jul", "07");
        months.put("Aug", "08");
        months.put("Sep", "09");
        months.put("Oct", "10");
        months.put("Nov", "11");
        months.put("Dec", "12");
        return months.get(month);
    }

    public String getYear(String date){
        
        String year = "";
        for(int i = date.length() - 1; i >= date.length() -4; i --){
            year = date.charAt(i)+ year;
        }
        return year;
    }

    public String getDay(String date){
        String day = "";
        for(int i = 0; i < 2; i ++){
            char current = date.charAt(i);
            if(! Character.isDigit(current)){
                day = "0" +day;
                break;
            }
            day = day + current;
        }
        return day;
    }

}