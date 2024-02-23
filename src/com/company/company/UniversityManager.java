package com.company.company;

public class UniversityManager {
    int nexId = 1;
    private int index = 0;
    public Subject[] subjects = new Subject[10];
    private String name;

    public Dean[] deans = new Dean[10];

    private Security[] securityArray = new Security[10];
    private int securityIndex = 0;
    private int generalId = 1;
    private Professor[] professorArray = new Professor[5];

    private int professerId = 1;

    private Student[] studentsArray = new Student[10];
    private int studentIndex = 0;
    private int stundetId = 1;

    public UniversityManager() {
    }

    public UniversityManager(String name) {
        this.name = name;
    }

    public String getUniversityName() {
        return name;
    }

    /**
     * Subject
     */
    public Subject createSubject(String name, int semester) {
        Subject subject = new Subject();
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] != null && subjects[i].getName().equals(name)) {
                System.out.println("Ushbu name mavjud !");
                return null;
            } else if (subjects[i] == null) {
                subject.setId(index);
                subject.setName(name);
                subject.setSemester(semester);
                subjects[i] = subject;
                index++;
                break;
            }
        }
        return subject;
    }

    public Subject getSubjectById(int id) {
        for (Subject subject : subjects) {
            if (subject.getId() == id) {
                return subject;
            }
        }
        return null;
    }

    public Subject getSubjectByName(String name) {
        for (Subject subject : subjects) {
            if (subject.getName().equals(name)) {
                return subject;
            }
        }
        return null;
    }

    /**
     * Dean
     */
    public Dean createDean(String name, String surname, Integer age, String birthDate, String faculty, Double salary, String startjobsdate) {
        for (Dean dean : deans) {
            if (dean != null && dean.getFaculty().equals(faculty)) {
                return null;
            }
        }
        Dean newDean = new Dean(name, surname, age, birthDate, faculty, salary, startjobsdate);
        newDean.setId(nexId++);
        return deans[index] = newDean;

    }

    public Dean getDeanByiId(Integer id) {
        for (Dean dean : deans) {
            if (dean != null && dean.getId() == id) {
                return dean;
            }
        }
        return null;
    }

    public String getDeanEmployedDateByiId(Integer id) {
        Dean dean = getDeanByiId(id);
        if (dean != null) {
            return dean.getStartjobsdate();
        }
        return null;
    }

    public Dean getDeanByFaculty(String faculty) {
        return null;
    }

    /**
     * Security
     */
    public Security createSecurity(String name, String surname, Integer age, String birthDate, Double salary, String militaryRank) {
        Security security = new Security(name, surname, age, birthDate, salary, militaryRank, generalId++);
        if (securityArray.length == securityIndex) {
            Security[] newSecurety = new Security[securityArray.length * 2];
            for (int i = 0; i < securityArray.length; i++) {
                newSecurety[i] = securityArray[i];
            }
            securityArray = newSecurety;
            securityArray[securityIndex++] = security;
        }
        return security;
    }

    public Security[] getSecurityListByMilitaryRank(String militaryRank) {
        int indextemp = 0;
        Security[] temparray = new Security[5];
        for (Security security : securityArray) {
            if (security != null && security.getMilitariRank().equals(militaryRank)) {
                if (temparray.length == indextemp) {

                }
                temparray[indextemp++] = security;
            }
        }
        return temparray;
    }

    /**
     * Professor
     */
    public Professor createProfessor(String name, String surname, Integer age, String birthDate, Double salary, Integer subjectId) {
        for (Professor professor : professorArray) {
            if (professor != null && !professor.getSubjectId().equals(subjectId)) {
                return null;
            }
        }
        Professor professor = new Professor(name, surname, age, birthDate, salary, subjectId, professerId);
        professor.setProfessorId(professerId++);
        professorArray[index++] = professor;
        return professor;
    }

    public Professor getProfessorById(int professerId) {
        for (Professor professor : professorArray) {
            if (professor != null && professor.getProfessorId() == professerId) {
                return professor;
            }
        }
        return null;
    }

    public Professor getProfessorByNameAndBySurname(String name, String surname) {
        for (Professor professor : professorArray) {
            if (professor != null && professor.getName().equals(name) && professor.getSurname().equals(surname)) {
                return professor;
            }
        }
        return null;
    }

    public Professor[] getProfessorListBySubjectId(Integer subjectId) {
        for (Professor professor : professorArray) {
            if (professor != null && professor.getSubjectId().equals(subjectId)) {
                return professorArray;
            }
        }
        return null;
    }

    /**
     * Student
     */
    public Student createStudent(String name, String surname, String age, String birthDate, Integer level) {
        for (Student student : studentsArray) {
            if (student != null) {

            }
        }
        Student student;
        student = new Student(name, surname, age, birthDate, level);
        studentsArray[studentIndex++] = student;
        return student;
    }

    public Student addSubjectToStudent(Integer studentId, Integer subjectId) {
        return null;
    }

    public Student getStudentById(Integer id) {
        return null;
    }

    public Student[] getStudentListByLevel(Integer level) {
        return null;
    }

    public com.company.Student[] getStudentListBySubjectId(Integer subjectId) {
        return null;
    }

    /**
     * Exam
     */
    public Exam createExam(Integer studentId, Integer subjectId, Integer grade) {
        return null;
    }

    public Exam[] getStudentExamList(Integer studentId) {
        return null;
    }

    public com.company.Student[] getStudentListByExamSubjectId(Integer subjectId) {
        return null;
    }

    public Student[] getStudentListByExamGrate(Integer studentId, Integer grade) {
        return null;
    }

    /**
     * Event
     */
    public Event createEvent(String name, Integer professorId) {
        return null;
    }

    public Event[] getEventListByProfessorId(Integer professorId) {
        return null;
    }

    /* Last one */
    public Object[] getAllEmployeeList() {
        return null;
    }

}
