package ru.tebyakina.classes;
/**
 * Уравнение кубической параболы
 * @author fox
 */
public class Line4 extends Line3 {
    {
        this.name = "Уравнение кубической параболы";
    }
    /**
     * коэффициент уравнения
     */
    protected double d;
    /**
     * конструктор
     * @param a коэффициент уравнения
     * @param b коэффициент уравнения
     * @param c коэффициент уравнения
     * @param d коэффициент уравнения
     */
    public Line4(double a, double b, double c, double d) {
        super(a,b,c);
        this.d = d;
    }
    /**
     * 
     * @return точка пересечения с осью OY
     */
    @Override
    public double getY() {
        return 0*a + 0*b + 0*c +d;
    }
    @Override
    public String toString() {
        return this.getName()+" id="+this.getId()+
                "\n"+getTime()+
                "\ny = "+a+"x^3 + "+b+"x^2 + "+c+"x + "+d+
                "\nТочка пересечения с осью OY (0;"+this.getY()+")";
    }
    /**
     * двигает уравнение по оси OX
     * @param len длина
     */
    @Override
    public void moveOX(double len) {
        d += (a*a*a*len + b*b*len + c*len);
    }
    /**
     * двигает уравнение по оси OY
     * @param len длина
     */
    @Override
    public void moveOY(double len) {
        d += len;
    }
}
