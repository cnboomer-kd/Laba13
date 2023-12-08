import java.util.ArrayList;
import java.util.List;

public class MergeSortStudents
{
    public static void main(String[] args)
    {
        List<Integer> list1 = new ArrayList<>();
        list1.add(new Student("A", 1).getiDNumber());
        list1.add(new Student("B", 3).getiDNumber());
        list1.add(new Student("C", 6).getiDNumber());

        List<Integer> list2 = new ArrayList<>();
        list2.add(new Student("D", 2).getiDNumber());
        list2.add(new Student("E", 4).getiDNumber());
        list2.add(new Student("F", 5).getiDNumber());

        List<Integer> mergedList = mergeSortedList(list1, list2);
        System.out.println("Merged List: " + Student.getName() + mergedList);
    }

    public static List<Integer> mergeSortedList(List<Integer> list1, List<Integer> list2)
    {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size())
        {
            if (list1.get(i) < list2.get(j))
            {
                mergedList.add(list1.get(i));
                i++;
            } else
            {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size())
        {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size())
        {
            mergedList.add(list2.get(j));
            j++;
        }
        return mergedList;
    }
}