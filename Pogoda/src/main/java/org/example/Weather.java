package org.example;

import com.ibm.icu.text.Transliterator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;
import java.util.Scanner;

import com.ibm.icu.text.Transliterator;
public class Weather
{
    public static String poisk;
    public static void Translate()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        var CYRILLIC_TO_LATIN = "Russian-Latin/BGN";
        Transliterator transliterator = Transliterator.getInstance(CYRILLIC_TO_LATIN);
        String result = transliterator.transliterate(poisk);
        System.out.println(result);

    }
    //Вывод темпрературы на первый день
    public static void GetTemperature()
    {
        try
        {
            Document document = Jsoup.connect("https://world-weather.ru/pogoda/russia/vladimir/").get();
            String element = document.select("#weather-now-number").text();
            System.out.println(element);
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
    //Вывод данных на сегодня
    public static void GetGeodata()
    {
        try
        {
            Document document = Jsoup.connect("https://world-weather.ru/pogoda/russia/vladimir/").get();
            String element = document.select("#weather-now-description>dl>dd").text();
            String s1 = element;
            //Вывод данных из массива
            String arr[] = s1.split(" ", 9);
            String a1 = arr[0];
            String a2 = arr[1];
            String a3 = arr[2];
            String a4 = arr[3];
            String a5 = arr[4];
            String a6 = arr[5];
            String a7 = arr[6];
            String a8 = arr[7];
            String a9 = arr[8];
            //берем a1, a2, a6, a7
            System.out.println("Ощущается: " + a1 + " Давление: " + a2 + a3 + a4 + a5 + " Влажность: " + a6 + " Ветер: " + a7 + a8);
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
    // Вывод погоды на второй день
    public static void GetTemperatureTwo()
    {
        try
        {
            Document document = Jsoup.connect("https://world-weather.ru/pogoda/russia/vladimir/").get();
            String element = document.select("#vertical_tabs>li:nth-child(2)").text();
            String s1 = element;
            //Вывод данных из массива
            String arr[] = s1.split(" ", 5);
            //берем a1-a5 (день недели, число, месяц, температура днем, температура ночью
            String a1 = arr[0];
            String a2 = arr[1];
            String a3 = arr[2];
            String a4 = arr[3];
            String a5 = arr[4];
            System.out.println(a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5);
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    // Вывод погоды на третий день
    public static void GetTemperatureThree()
    {
        try
        {
            Document document = Jsoup.connect("https://world-weather.ru/pogoda/russia/vladimir/").get();
            String element = document.select("#vertical_tabs>li:nth-child(3)").text();
            String s1 = element;
            //Вывод данных из массива
            String arr[] = s1.split(" ", 5);
            String a1 = arr[0];
            String a2 = arr[1];
            String a3 = arr[2];
            String a4 = arr[3];
            String a5 = arr[4];
            //берем a1-a5 (день недели, число, месяц, температура днем, температура ночью
            System.out.println(a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5);
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    // Вывод погоды на четвертый день
    public static void GetTemperatureFour()
    {
        try
        {
            Document document = Jsoup.connect("https://world-weather.ru/pogoda/russia/vladimir/").get();
            String element = document.select("#vertical_tabs>li:nth-child(4)").text();
            String s1 = element;
            //Вывод данных из массива
            String arr[] = s1.split(" ", 5);
            String a1 = arr[0];
            String a2 = arr[1];
            String a3 = arr[2];
            String a4 = arr[3];
            String a5 = arr[4];
            //берем a1-a5 (день недели, число, месяц, температура днем, температура ночью
            System.out.println(a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5);
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
