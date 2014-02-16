package ru.tebyakina.classes;

import java.text.SimpleDateFormat;
import java.util.Date;
import ru.tebyakina.inter.MoveOX;
import ru.tebyakina.inter.MoveOY;

/**
 * Уравнение линии на плоскости (абстрактный класс)
 * @author fox
 */
public abstract class Line implements MoveOX, MoveOY {

    private static int nextId = 1;
    private int id;
    private Date time;

    /**
     * Имя уравнения
     */
    protected String name;
    /**
     * коэффициент уравнения
     */
    protected double a;

    {
        this.id = nextId++;
        this.time = new Date(System.currentTimeMillis());
    }
    
    /**
     * 
     * @return 20.11.2013 18:11:85 :)
     */
    public String getTime() {
        //не спрашивайте как это работает
        return new SimpleDateFormat("dd.MM.YYYY HH:mm:ss").format(time);
    }

    /**
     * 
     * @return id объекта
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @return имя объекта
     */
    public String getName() {
        return name;
    }
}
