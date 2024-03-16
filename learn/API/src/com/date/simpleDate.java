package com.date;

import javax.swing.text.DateFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class simpleDate {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
//        格式化
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String result = simpleDateFormat.format(date);
        System.out.println("格式化 "+result);
//       解析
        String s1 = "2024-01-11";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = simpleDateFormat1.parse(s1);
        System.out.println("解析 "+date1);
//        转换为毫秒制
        long date1Time = date.getTime();
        System.out.println("毫秒制 "+date1Time);
//        jdk8
        String s = "2024年01月11日 00:00:00";
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(s, pattern);
        LocalDateTime plussedDays = localDateTime.plusDays(1);
        String format = plussedDays.format(pattern);
        System.out.println("jdk8新特性 + 一天  "+format);
    }
}
