class Student {
    public String name;
    public int rollno;
    public String gender;
    public int marks1;
    public int marks2;
    public int marks3;
    public int marks4;
    public int marks5;
    public int totalmarks=0;
    public float percentage=0;

    public void InputFunc(String name, int rollno, String gender,int marks1, int marks2, int marks3, int marks4, int marks5)
    {   
        this.name=name;
        this.rollno=rollno;
        this.gender=gender;
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
        this.marks4=marks4;
        this.marks5=marks5;
        //this:Self-reference.  this->name=name;
        
    }
    public void cal_marks(){
        totalmarks = marks1+marks2+marks3+marks4+marks5;
        percentage= ((float)totalmarks / 500) * 100;
    }
    public void display_Human()
    {
        cal_marks();
        System.out.println("name: "+name+" gender: "+gender+" rollno: "+rollno+" marks1: "+marks1+" marks2: "+marks2+" marks3: "+marks3+" marks4: "+marks4+" marks5: "+marks5);
        System.out.println("Total marks: "+totalmarks);
        System.out.println("Percentage: "+percentage);
    }
    

}
