/**
 * Created with IntelliJ IDEA.
 * User: rxiao
 * Date: 6/4/14
 * Time: 10:17 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.*;

public class testCommendInput {
    public static void main(String args[]) {

        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMapTest = new HashMap();
        HashSet testSet = new HashSet();
        HashSet testSet2 = new HashSet();

        arrayList.add('a');
        arrayList.add('s');
        arrayList.add('c');

        arrayList2.add('e');
        arrayList2.add('d');
        arrayList2.add('a');

        hashMapTest.put('1', 'a');
        hashMapTest.put('2', 'b');
        hashMapTest.put('3', 'c');

        testSet.add('a');
        testSet.add('b');
        testSet.add('c');

        testSet2.add('d');
        testSet2.add('b');
        testSet2.add('c');

//        testSet.addAll(testSet2);
        arrayList.addAll(arrayList2);
        System.out.println(arrayList);
        System.out.println(arrayList2.get(2));
//        Iterator iter = testSet.entrySet().iterator();
//        while(iter.hasNext()) {
//            Object element = iter.next();
//            System.out.println(element);
//        }
//        System.out.println(iter);
    }
}
