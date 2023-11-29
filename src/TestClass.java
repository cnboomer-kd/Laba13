import java.util.Arrays;

public class TestClass
{
    public static void main(String[] args)
    {
        Student[] students = {
                new Student("A", 1523),
                new Student("B", 454656),
                new Student("C", 786879),
                new Student("D", 234453),
                new Student("E", 234534),
                new Student("F", 231234),
                new Student("G", 23144),
                new Student("H", 231234),
                new Student("I", 212534),
                new Student("K", 2375334),
                new Student("L", 2345334),
                new Student("M", 237578375),
                new Student("N", 232754),
        };

        // Сортировка массива студентов по идентификатору (iDNumber)
        for (int i = 1; i < students.length; i++)
        {
            Student current = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getiDNumber() > current.getiDNumber())
            {
                students[j + 1] = students[j];
                j--;
            }

            students[j + 1] = current;
        }

        // Вывод отсортированного массива студентов
        System.out.println(Arrays.toString(students));
    }
}

class Student
{
    private String name;
    private int iDNumber;

    public Student(String name, int iDNumber)
    {
        this.name = name;
        this.iDNumber = iDNumber;
    }

    public int getiDNumber()
    {
        return iDNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", iDNumber=" + iDNumber +
                '}';
    }
}