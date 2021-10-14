package bai_9_dsa_list.baitap;

public class MyListTest {
    public static class StuDent {
        private int id;
        private String name;

        public StuDent(int id, String name) {
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
            StuDent stuDent = new StuDent(1, "A");
            StuDent stuDent1 = new StuDent(2, "B");
            StuDent stuDent2 = new StuDent(3, "C");
            StuDent stuDent3 = new StuDent(4, "D");
            StuDent stuDent4 = new StuDent(5, "E");

            MyList<StuDent> stuDentMyList = new MyList<>();
            stuDentMyList.add(stuDent);
            stuDentMyList.add(stuDent1);
            stuDentMyList.add(stuDent2);
            stuDentMyList.add(stuDent3);
            stuDentMyList.add(stuDent4);


            for(int i = 0; i< stuDentMyList.size();i++){
                System.out.println(stuDentMyList.element[i]);
            }
        }
    }

}
