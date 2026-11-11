class Student {
    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}

class Main {
    public static void main(String[] args) {

        Student s = new Student();

        s.setID(203024);
        System.out.println("Student ID: " + s.getID());

        s.setID(203025);
        System.out.println("Updated ID: " + s.getID());
    }
}