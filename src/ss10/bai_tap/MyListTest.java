package ss10.bai_tap;

public class MyListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static void main(String[] args) {
            Student a = new Student(1, "Tien");
            Student b = new Student(2, "Hoang");
            Student c = new Student(3, "Thong");
            Student d = new Student(4, "Quan");
            Student e = new Student(5, "The");
            Student f = new Student(6, "The2");

            MyList<Student> studentMyList = new MyList<>();
            MyList<Student> newMyList = new MyList<>();
            studentMyList.push(a);
            studentMyList.push(b);
            studentMyList.push(c);
            studentMyList.push(d);
            studentMyList.push(e);
            studentMyList.push(f, 2);
            studentMyList.size();

            System.out.println(studentMyList.size());

            System.out.println(studentMyList.get(2).getName());

            System.out.println(studentMyList.indexOf(f));

            System.out.println(studentMyList.contains(b));

            newMyList = studentMyList.clone();
            Student student = newMyList.remove(1);
            for (int i = 0; i < newMyList.size(); i++) {
                System.out.println(newMyList.get(i).getName());

            }


        }
    }
}
