package ru.tebyakina.classes;
/**
 * Уравнение прямой параллельной OX
 * @author fox
 */
public class Line1 extends Line {
    {
        this.name = "Уравнение прямой параллельной OX";
    }
    /**
     * конструктор
     * @param a коэффициент уравнения
     */
    public Line1(double a) {
        this.a = a;
    }
    /**
     * 
     * @return Расстояние от начала координат
     */
    public double getDistanceToCenter() { //
        return a;
    }
    /**
     * 
     * @return точка пересечения с осью OY
     */
    public double getY() {//
        return 0*a;
    }
    /**
     * 
     * @return точка пересечения с осью OX
     */
    public double getX() {
        return a;
    }
    @Override
    public String toString() {
        return this.getName()+" id="+this.getId()+
                "\n"+getTime()+
                "\ny = "+a+
                "\nТочка пересечения с осью OY (0;"+this.getY()+")"+
                "\nТочка пересечения с осью OX ("+this.getX()+";0)"+
                "\nРасстояние от начала координат "+this.getDistanceToCenter();
    }
    /**
     * двигает уравнение по оси OX
     * @param len длина
     */
    @Override
    public void moveOX(double len) {
        a += 0;
    }
    /**
     * двигает уравнение по оси OY
     * @param len длина
     */
    @Override
    public void moveOY(double len) {
        a += len;
    }
}
