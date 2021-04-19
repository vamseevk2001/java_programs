package java_lab;

class person {
    String name;
    String dateOfBirth;
    int reg_id;
    float weight;
    float height;

    person(String name, String dob, int reg_id, float weight, float height){
        this.name = name;
        this.dateOfBirth = dob;
        this.reg_id = reg_id;
        this.weight = weight;
        this.height = height;
    }



    public static void main(String[] args){
        Student laasya = new Student("laasya", "12-10-2001", 0164, 62, 167, "Java", 80, 90);
        Student vamsee = new Student("vamsee", "15-10-2001", 0167, 63, 170, "c++", 88, 93);
        Student  gunal = new Student("gunal", "11-9-2001", 0165, 68, 160, "python", 90, 95);

        Teacher sudhakar = new Teacher("sudhakar", "12-10-2001", 74, 80, 176, "pgt", 50000);
        Teacher mousami = new Teacher("mousami", "12-10-2001", 74, 80, 176, "pgt", 40000);

        float cgpa1 = laasya.cgpa_calculator(laasya.mark1, laasya.mark2);
        float cgpa2 = vamsee.cgpa_calculator(vamsee.mark1, vamsee.mark2);
        float cgpa3 = gunal.cgpa_calculator(gunal.mark1, gunal.mark2);
        laasya.Display();
        vamsee.Display();
        gunal.Display();

    }
}

class Student extends person {
    String couseName;
    float mark1, mark2;
    double cgpa = 0;

    Student(String name, String dob, int reg_id, float weight, float height, String couseName, float mark1, float mark2) {
        super(name, dob, reg_id, weight, height);
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.couseName = couseName;
    }


    float cgpa_calculator(float m1, float m2) {
        float cgpa;
        cgpa = ((m1 + m2) / 2);
        cgpa = cgpa / 10;
        this.cgpa = cgpa;
        return cgpa;
    }

    void Display(){
        System.out.println("Name : "+name);
        System.out.println("Date of birth : "+dateOfBirth);
        System.out.println("registration ID : "+reg_id);
        System.out.println("weight : "+weight);
        System.out.println("height : "+height);
        System.out.println("cgpa: "+cgpa);
        System.out.println();
    }
}

class Teacher extends person {
    String occupation;
    int salary;

    Teacher(String name, String dob, int reg_id, float weight, float height, String occupation, int salary) {
        super(name, dob, reg_id, weight, height);
        this.occupation = occupation;
        this.salary = salary;
    }
}


