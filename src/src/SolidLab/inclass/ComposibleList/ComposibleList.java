package src.SolidLab.inclass.ComposibleList;

import java.util.List;

public class ComposibleList <T> implements ListOnlyWith<T>{

    private List<T>list;

    public ComposibleList(List<T> list) {
        this.list = list;
    }


    @Override
    public void add(T t) {
        list.add(t);
    }
}
