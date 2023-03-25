//package Arrays;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//class List {
//    ArrayList<ListElement> elements;
//
//    public List() {
//        elements = new ArrayList<>();
//    }
//
//    public ListElement get(int idx) {
//        return elements.get(idx);
//    }
//
//    public void add(int element) {
//        if (elements.contains(element)) {
//            elements.get(element).count++;
//        } else {
//            ListElement e = new ListElement(element);
//            elements.add(e);
//        }
//    }
//}
//
//class ListElement {
//    public int element;
//    public int count;
//
//    public ListElement(int element) {
//        this.element = element;
//        count = 0;
//    }
//
//    public void add(int element) {
//        this.element = element;
//    }
//
//    public String print() {
//        return element;
//    }
//}
//
//public class FirstElementToOccurKTimes {
//    static int firstElementToOccurKTimes(int[] arr, int k) {
//        int element = 0;
//        List list = new List();
//        for (int i = 0; i < arr.length; i++) {
//            list.add(arr[i]);
//            System.out.println(list);
//            if (list.get(i).count == k) {
//                element = list.get(i).element;
//                break;
//            }
//        }
//        System.out.println(list.elements);
//        return element;
//    }
//
//    public static void main(String args[]) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int result = firstElementToOccurKTimes(arr, k);
//
//        System.out.println(result);
//    }
//}
