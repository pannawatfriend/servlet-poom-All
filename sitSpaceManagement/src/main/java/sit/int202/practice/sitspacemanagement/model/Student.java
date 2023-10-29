package sit.int202.practice.sitspacemanagement.model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Student {
    private String id;
    private String name;
    private int score;


    public Student(String id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }



    public String getCalculateGrade(){
        if(score >=  80){
            return "A";
        } else if (score >= 70) {
            return  "B";
        } else if (score >= 60) {
            return "C";
        } else if (score >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
