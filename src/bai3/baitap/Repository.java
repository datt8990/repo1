package bai3.baitap;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    List<Model> list = new ArrayList<>();

    public List<Model> fakeData() {
        list.add(new Model("A", 10000, "AB", "Hà Nội"));
        list.add(new Model("B", 2000, "A", "Ninh Bình"));
        list.add(new Model("C", 4444, "O", "Hà Nội"));
        list.add(new Model("D", 5555, "AB", "Thái Nguyên"));
        list.add(new Model("E", 555, "B", "Nam Định"));
        return list;
    }

    public String delete(int index) {
        if (index != -1) {
            list.remove(index);
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }

    public String add(Model model) {
        if (model != null) {
            list.add(model);
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

}
