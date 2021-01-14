import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        int[] a = {9,2,3,5,7,1,4};
        Cat cat1 = new Cat(1, 1);
        Cat cat3 = new Cat(3, 3);
        Cat cat5 = new Cat(5, 5);
        Cat[] cats = {cat3,cat1,cat5};
        Sorter<Cat> sorter = new Sorter<Cat>();
        sorter.sort(cats,new CatComparator());
        System.out.println(Arrays.toString(cats));
    }
}
