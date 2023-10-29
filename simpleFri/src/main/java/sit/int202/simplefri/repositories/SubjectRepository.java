package sit.int202.simplefri.repositories;


import sit.int202.simplefri.entities.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectRepository {
    private static List<Subject> subjects;


    public List<Subject> findAll() {
        return subjects;
    }

    public SubjectRepository() {
        initialize();
    }

    private void initialize() {
        subjects = new ArrayList<>(20);


        subjects.add(new Subject("INT 100", "IT Fundamentals", 3));
        subjects.add(new Subject("INT 103", "Advance Programming", 3));
        subjects.add(new Subject("INT 201", "Client Side I", 3));
        subjects.add(new Subject("INT 205", "Datebase", 3));
        subjects.add(new Subject("INT 202", "Server Side I", 3));
    }
}
