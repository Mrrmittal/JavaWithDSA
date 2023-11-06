package CompareAndComparator;
import java.util.*;

public class SortingStudentData {
    public static void main(String[] args) {
        Students myStudent1 = new Students(1,"Jatin" , 85);
        Students myStudent2 = new Students(2,"Mukul" , 91);
        Students myStudent3 = new Students(3,"Nikku" , 89);
        Students myStudent4 = new Students(4,"Abhishek" , 37);
        Students myStudent5 = new Students(5,"Gokul" , 39);
        Students myStudent6 = new Students(6,"Mohan" , 99);

        List<Students> studentsList = new ArrayList<Students>();
        studentsList.add(myStudent1);
        studentsList.add(myStudent2);
        studentsList.add(myStudent3);
        studentsList.add(myStudent4);
        studentsList.add(myStudent5);
        studentsList.add(myStudent6);

        Collections.sort(studentsList,new SortMarks());

        SortingStudentData obj = new SortingStudentData();
        obj.printSortingStudentData(studentsList);
    }

    public void printSortingStudentData(List< Students > AllStudents){
        for (Students students : AllStudents) {
            System.out.println(students);
        }

    }
}

    class SortMarks implements Comparator<Students>{

        @Override
        public int compare(Students o1, Students o2) {
            return o1.getStudentMarks().compareTo(o2.getStudentMarks());
        }
    }

class SortName implements Comparator<Students>{

    @Override
    public int compare(Students o1, Students o2) {
        return o1.getStudentName().compareTo(o2.getStudentName());
    }
}
class SortID implements Comparator<Students>{

    @Override
    public int compare(Students o1, Students o2) {
        return o1.getStudentId().compareTo(o2.getStudentId());
    }
}
