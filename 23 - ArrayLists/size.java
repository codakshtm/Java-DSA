import java.util.ArrayList;
public class size {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.size());

        // print the arrayList
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }     
}