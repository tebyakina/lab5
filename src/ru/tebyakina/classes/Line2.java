package ru.tebyakina.classes;
/**
 * Уравнение прямой
 * @author fox
 */
public class Line2 extends Line1 {
    {
        this.name = "Уравнение прямой";
    }
    /**
     * коэффициент уравнения
     */
    protected double b;
    /**
     * конструктор
     * @param a коэффициент уравнения
     * @param b коэффициент уравнения
     */
    public Line2(double a, double b) {
        super(a);
        this.b = b;
    }
    /**
     * 
     * @return Расстояние от начала координат
     */
    @Override
    public double getDistanceToCenter() {
        return a - b;
    }
    /**
     * 
     * @return точка пересечения с осью OY
     */
    @Override
    public double getY() {
        return 0*a + b;
    }
    /**
     * 
     * @return точка пересечения с осью OX
     */
    @Override
    public double getX() {
        return -b/a;
    }
    /**
     * 
     * @return угол наклона
     */
    public double getAngle() {
        return Math.atan(a)*180/Math.PI;
    }
    @Override
    public String toString() {
        return this.getName()+" id="+this.getId()+
                "\n"+getTime()+
                "\ny = "+a+"x + "+b+
                "\nТочка пересечения с осью OY (0;"+this.getY()+")"+
                "\nТочка пересечения с осью OX ("+this.getX()+";0)"+
                "\nРасстояние от начала координат "+this.getDistanceToCenter()+
                "\nУгол наклона "+this.getAngle()+" градусов";
    }
    /**
     * двигает уравнение по оси OX
     * @param len длина
     */
    @Override
    public void moveOX(double len) {
        b += (a*len);
    }
    /**
     * двигает уравнение по оси OY
     * @param len длина
     */
    @Override
    public void moveOY(double len) {
        b += len;
    }
}
