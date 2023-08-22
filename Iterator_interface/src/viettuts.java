
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
 
public class viettuts {
    public static void main(String args[]) {
        ArrayList listLanguages = new ArrayList();
 
        // them phan tu vao array list
        listLanguages.add("Java");
        listLanguages.add("Python");
        listLanguages.add("PHP");
        listLanguages.add(".NET");
        listLanguages.add("C");
        listLanguages.add("C++");
  
        // su dung iterator de hien thi noi dung cua listLanguages
        System.out.println("Danh sach ngon ngu lap trinh: ");
        Iterator itr = listLanguages.iterator();
        while (itr.hasNext()) { // trả về true nếu còn phần tử phía sau
            Object element = itr.next(); // itr.next() để lấy ra phần tử
            System.out.println(element);
        }
        System.out.println();
 
        // sua cac phan tu duoc lap
        ListIterator litr = listLanguages.listIterator();
//      ListIterator <Object> litr = listLanguages.listIterator();
        while (litr.hasNext()) {
            Object element = litr.next();
            litr.set(element + " (PASS)");
        }
      
        
        System.out.println("Noi dung da duoc sua cua listLanguages: ");
        itr = listLanguages.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.println(element);
        }
        System.out.println();
 
        // hien thi cac phan tu theo thu tu nguoc lai
        System.out.println("Noi dung da duoc sua cua listLanguages "
                + "theo thu tu nguoc lai: ");
        while (litr.hasPrevious()) { //Trả về true nếu có phần tử trước
            Object element = litr.previous(); // trả về phần tử phía trước
            System.out.println(element);
        }
        System.out.println();
         
        // xoa phan tu C (PASS)
        litr = listLanguages.listIterator();
        while (litr.hasNext()) {
            Object element = litr.next();
            if ("C (PASS)".equals(element.toString())) {
             litr.remove();
            }
        }
        System.out.println("Noi dung da duoc sua cua listLanguages: ");
        itr = listLanguages.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.println(element);
        }
        System.out.println();
         
    }
}
