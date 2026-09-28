import java.util.Scanner;

class Student{
    int id;
    String name, major;
    Long phone;

    void setId(int i){id=i;}
    void setName(String n){name=n;}
    void setMajor(String m){major=m;}
    void setPhone(Long p){phone=p;}

    int getId(){return id;}
    String getName(){return name;}
    String getMajor(){return major;}
    Long getPhone(){return phone;}
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];
        for(int i=0; i<students.length ; i++){
            students[i] = new Student();
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            students[i].setId(sc.nextInt());
            students[i].setName(sc.next());
            students[i].setMajor(sc.next());
            students[i].setPhone(sc.nextLong());
        }
        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        for(int i=0 ; i<students.length ; i++){
            String pn = Long.toString(students[i].getPhone());
            pn = '0'+pn.substring(0,2)+'-'+pn.substring(2,6)+'-'+pn.substring(6,10);
            System.out.printf("%d번째 학생: %d %s %s %s\n", i+1, students[i].getId(), students[i].getName(), students[i].getMajor(), pn);
        }
    }
}
