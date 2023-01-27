package day0113;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex04Date {

    public static void main(String[] args) {
        Date d = new Date();
        d.setHours(17);
        d.setMonth(1);//0~11월
        System.out.println(d);



        DateFormat df = new SimpleDateFormat("yymmdd HH:mm:ss");
        DateFormat df2 = new SimpleDateFormat("yy/mm/dd E hh:mm:ss E");
//        y: 연도
//        M: 월
//        d: 해당 월의 일자
//        E: 요일

//        h : 오전/오후 체계의 현재 시간
//        H: 24시간
//        m: 현재 분
//        s: 현재 초
//        S: 현재 밀리초

        System.out.println(df.format(d));
        System.out.println(df2.format(d));

        DateFormat df3 = new SimpleDateFormat("y/m/d E hh:mm:ss");
        System.out.println(df3.format(d));
        System.out.println("==============================================================");


        df = new SimpleDateFormat("yyMMdd");
        df.setLenient(false);//사전적 의미 : 관대한...false주면 230193주면 예외발생함.
//        String temp = "조재영";
        String temp = "230193";//대충 계산해서 들어감 4월3일로 됨

        try{
            d = df.parse(temp);//예외가 발생("조재영" ex)가 발생할 수 있음으로 try-catch로 감쌈
        } catch (Exception e){
            System.out.println("해당 스트링은 date로 변환할수 없어서 현재 날짜로 date를 설정하겠습니다.");
            d = new Date();
        }

        System.out.println(d);

    }

}
