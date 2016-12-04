package javarush;

/**
 * Created by User on 04.12.2016.
 */

//Метод должен выводить полное ФИО студента на экран. Слова разделить пробелом.
    public class Facebook {

        public static void main(String[] args)
        {
            Student student = new Student();      //создание обьекта student в класе Student
            student.firstName = "Mark";           //присвоение переменной fisrtName обьекта student значения Mark
            student.middleName = "Elliot";
            student.lastName = "Zuckerberg";
            printFullName(student);               //ссылка на метод printFullName ?
        }
        //метод printFullName
        public static void printFullName(Student student)
        {
            System.out.println(student.firstName);    //вывод значения переменной fisrtName обьекта student  ?
            System.out.println(student.middleName);
            System.out.println(student.lastName);
        }
        //создание класса Student
        public static class Student
        {
            public String firstName;   //обьявление переменной firstName типа String без значения
            public String middleName;
            public String lastName;
        }
    }
