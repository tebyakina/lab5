package ru.tebyakina.classes;
import java.util.Comparator;
/**
 * класс сортировки
 * @author fox
 */
public class SortMode implements Comparator<Line> {
    private boolean sortUp;
    private int sortMode;
    /**
     * Конструктор
     * @param sortUp по возрастанию?
     * @param sortMode тип сортировки
     */
    public SortMode(boolean sortUp, int sortMode) {
        this.sortUp = sortUp;
        this.sortMode = sortMode;
    }
    /**
     * сравнивает два объекта
     * @param l1 первый объект
     * @param l2 второй объект
     * @return ???
     */
    @Override
    public int compare(Line l1, Line l2) {
        int ret=0;
        if (sortMode==0){//сортируем по id
            if (l1.getId() > l2.getId()){
                ret = 1;
            }
            else if (l1.getId() < l2.getId()){
                ret= -1;
            }
        }
        else if (sortMode==1){//сортируем по name
            ret = l1.getName().compareTo(l2.getName());
        }
        else {// сортируем по дате
            ret = l1.getTime().compareTo(l2.getTime());
        }
        if (sortUp) {
            ret *= (-1);
        }
        return ret;
    }
}
