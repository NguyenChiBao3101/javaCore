package collection.list;

import java.util.ArrayList;

// Viet chuong trinh tim tat ca cac so chia het  cho 7 nhung khong la  boi so cua 5,
// nan trong doan tu 10- 200( tinh ca 10 & 200),
//in ra man hinh day so cach nhau boi dau " "
public class ArrayListPractice1 {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        for(int i = 10; i < 201; i++) {
            if((i % 7 == 0) && (i % 5 != 0)) {
                al.add(i);
            }
        }
        showList(al);
    }

    private static void showList(ArrayList<Integer> al) {
        if(!al.isEmpty() || al != null) {
            int size = al.size();
            for(int i = 0; i < size - 1; i++) {
                System.out.println( al.get(i) + " ");
            }
            System.out.print(al.get(size - 1));
        }
    }


}
