package ru.tebyakina.lab5;
//import java.io.*;
//import java.util.*;
//import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.tebyakina.classes.*;

/*
5 вариант
Уравнение линии на плоскости (абстрактный класс), уравнение прямой
параллельной OX (y=a), уравнение прямой (y=ax+b), уравнение параболы
(y=ax2+bx+c), уравнение кубической параболы (y=ax3+bx2+cx+d)
(сдвиг вдоль оси OY, сдвиг вдоль оси OX).
 */

/**
 * Главный класс проекта
 * @author fox
 */
public class Lab5 {
    //private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static Scanner in = new Scanner(System.in);
    private static ArrayList<Line> list = new ArrayList<Line>();
    /**
     * Точка входа программы
     * @param args не используются
     */
    public static void main(String[] args) {
        System.out.println("wait...");
        //заполнение списка
        try {
            list.add(new Line1(0));
            Thread.sleep(1000);
            list.add(new Line2(1,3));
            Thread.sleep(1000);
            list.add(new Line3(32,32,4));
            Thread.sleep(1000);
            list.add(new Line4(2,3,4,5));
        } catch (InterruptedException ex) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, ex);
        }
        //list.add(new Line1(2));
        //list.add(new Line2(2,3));
        //list.add(new Line2(3,3));
        //list.add(new Line2(4,3));
        //list.add(new Line1(2));
        //list.add(new Line1(5));
        
        //вывод в цикле
        for (Line i: list) {
            System.out.println(i);
            System.out.println();
        }
        while(true) { // начинаем бесконечный цикл
            System.out.println();
            System.out.println("Выберите тип сортировки:");
            System.out.println("1 - по возраcтанию id");
            System.out.println("2 - по убыванию id");
            System.out.println("3 - по возраcтанию имени");
            System.out.println("4 - по убыванию имени");
            System.out.println("5 - по возрастанию даты создания");
            System.out.println("6 - по убыванию даты создания");
            System.out.println("или");
            System.out.println("7 - сдвиг вдоль оси OX");
            System.out.println("8 - сдвиг вдоль оси OY");
            System.out.println("9 - добавить элемент");
            System.out.println("0 - удалить элемент");
            System.out.println("q - выход");
            String mode = in.nextLine();
            if (mode.equals("q")) {
                break;
            }
            boolean sortUp = mode.equals("2")||mode.equals("4")||mode.equals("6");
            int sortMode=0;
            if (mode.equals("3")||mode.equals("4")) {
                sortMode=1;
            }
            else if (mode.equals("5")||mode.equals("6")) {
                sortMode=2;
            }
            else if (mode.equals("7")||mode.equals("8")||mode.equals("9")||mode.equals("0")){
                System.out.print("Введите номер элемента: ");
                int el = in.nextInt();
                if (mode.equals("7")||mode.equals("8")) {
                    System.out.print("Введите величину сдвига: ");
                    double len =  in.nextDouble();
                    if (mode.equals("7")){
                        list.get(el).moveOX(len);
                    }
                    else if (mode.equals("8")){
                        list.get(el).moveOY(len);
                    }
                }
                else if (mode.equals("9")){
                    System.out.println("Введите тип объекта");
                    System.out.println("1 - Line1");
                    System.out.println("2 - Line2");
                    System.out.println("3 - Line3");
                    System.out.println("4 - Line4");
                    int q = in.nextInt();
                    System.out.println("Введите "+q+" параметров через пробел");
                    switch(q){
                        case 1:
                            list.add(el, new Line1(in.nextDouble()));
                            break;
                        case 2:
                            list.add(el, new Line2(in.nextDouble(),in.nextDouble()));
                            break;
                        case 3:
                            list.add(el, new Line3(in.nextDouble(),in.nextDouble(),in.nextDouble()));
                            break;
                        case 4:
                            list.add(el, new Line4(in.nextDouble(),in.nextDouble(),in.nextDouble(),in.nextDouble()));
                            break;
                    } 
                }
                else if (mode.equals("0")){
                    list.remove(el);
                }
            }
            //сортируем
            Collections.sort(list, new SortMode(sortUp,sortMode));
            //вывод используя итератор
            Iterator<Line> it = list.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
                System.out.println();
            }
        }
    }
}

