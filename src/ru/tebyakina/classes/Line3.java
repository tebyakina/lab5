package ru.tebyakina.classes;
/**
 * Уравнение параболы
 * @author fox
 */
public class Line3 extends Line2 {
    {
        this.name = "Уравнение параболы";
    }
    /**
     * коэффициент уравнения
     */
    protected double c;
    /**
     * конструктор
     * @param a коэффициент уравнения
     * @param b коэффициент уравнения
     * @param c коэффициент уравнения
     */
    public Line3(double a, double b, double c) {
        super(a,b);
        this.c = c;
    }
    /**
     * 
     * @return точка пересечения с осью OY
     */
    @Override
    public double getY() {
        return 0*a + 0*b + c;
    }
    /**
     * 
     * @return координата центра вершины X
     */
    public double getTopX(){
        return -b/(2*a);
    }
    /**
     * 
     * @return координата центра вершины Y
     */
    public double getTopY(){
        return (-(b*b)/(4*a) + c);
    }
    @Override
    public String toString() {
        return this.getName()+" id="+this.getId()+
                "\n"+getTime()+
                "\ny = "+a+"x^2 + "+b+"x + "+c+
                "\nТочка пересечения с осью OY (0;"+this.getY()+")"+
                "\nКоордината вершины ("+this.getTopX()+";"+this.getTopY()+")";
    }
    /**
     * двигает уравнение по оси OX
     * @param len длина
     */
    @Override
    public void moveOX(double len) {
        c += (a*a*len + b*len);
    }
    /**
     * двигает уравнение по оси OY
     * @param len длина
     */
    @Override
    public void moveOY(double len) {
        c += len;
    }
}
