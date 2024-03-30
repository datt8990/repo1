package bai3;

import java.util.List;
import java.util.ArrayList;

public class Repositories {

    private List<Model_Sach> list = new ArrayList<>();

    public List<Model_Sach> fakeData() {
        list.add(new Model_Sach("Sach1", "Vượt qua rông bão", 2020, 0));
        list.add(new Model_Sach("Sach2", "Truyện cười", 2014, 0));
        list.add(new Model_Sach("Sach3", "Sách tiểu thuyết", 2010, 1));
        list.add(new Model_Sach("Sach4", "Truyện tranh", 1999, 0));
        return list;
    }
}
