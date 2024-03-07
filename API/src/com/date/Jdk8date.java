package com.date;

import javax.swing.text.DateFormatter;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Jdk8date {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
//      构造方法
        System.out.println(now);
        LocalDateTime of1 = LocalDateTime.of(2023, 11, 12, 13, 14, 15);
        LocalDateTime of = LocalDateTime.of(2023, 1, 2, 3, 4, 5);
        System.out.println(of);
//      获取方法
        int dayOfMonth = of.getDayOfMonth();
        System.out.println(dayOfMonth);

        Month month1 = of.getMonth();
        System.out.println(month1);

        int monthValue = of.getMonthValue();
        System.out.println(monthValue);
//      转换
        LocalDate localDate = of.toLocalDate();
        System.out.println(localDate);
        LocalDate localDate1 = now.toLocalDate();

        LocalTime localTime = of.toLocalTime();
        System.out.println(localTime);
//      格式化
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String format = of.format(pattern);
        System.out.println(format);
//      解析
        String s = "2024年01月02日 03:04:05";
        LocalDateTime parse = LocalDateTime.parse(s, pattern);
        System.out.println(parse);
//      增加和减少时间
        LocalDateTime plusYears = of.plusYears(-1);
        System.out.println(plusYears);
        LocalDateTime minusYears = of.minusYears(-1);
        System.out.println(minusYears);
//      修改时间
        LocalDateTime withYear = of.withYear(2003);
        System.out.println(withYear);
        LocalDateTime withDayOfYear = of.withDayOfYear(100);
        System.out.println(withDayOfYear);
//      计算时间间隔 Period
        Period between = Period.between(localDate, localDate1);
        System.out.println(between);
        int betweenDays = between.getDays();
        System.out.println(betweenDays);
        System.out.println(between.toTotalMonths());
//      计算时间间隔 Duration
        Duration between1 = Duration.between(of, of1);
        System.out.println(between1);
        System.out.println(between1.toMillis());
    }
}
