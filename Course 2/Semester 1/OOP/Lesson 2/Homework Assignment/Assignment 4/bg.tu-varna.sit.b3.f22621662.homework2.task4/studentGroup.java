import java.util.Objects;

public class studentGroup {
    String speciality;
    int course;
    int group;
    int numOfStudents;

    public studentGroup(String speciality, int course, int group, int numOfStudents) {
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.numOfStudents = numOfStudents;
    }

    public String getSpecialty() {
        return speciality;
    }

    public void setSpecialty(String speciality) {
        this.speciality = speciality;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    @Override
    public String toString() {
        return "studentGroup{" +
                "speciality='" + speciality + '\'' +
                ", course=" + course +
                ", group=" + group +
                ", numOfStudents=" + numOfStudents +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        studentGroup that = (studentGroup) o;
        return course == that.course && group == that.group && numOfStudents == that.numOfStudents && speciality.equals(that.speciality);
    }
}
