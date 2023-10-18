public class application4 {
    public static void main(String[] args) {
        studentGroup group1 = new studentGroup("Computer Science", 2, 1, 30);
        studentGroup group2 = new studentGroup("Mathematics", 1, 2, 25);
        studentGroup group3 = new studentGroup("Physics", 3, 3, 35);

        studentGroup[] groups = {group1, group2, group3};

        faculty facultyObj = new faculty(groups);

        int targetCourse = 2;
        studentGroup maxStudentGroup = facultyObj.getGroupWithMaxStudentsByCourse(targetCourse);

        if (maxStudentGroup != null) {
            System.out.println("Group with the most students in course " + targetCourse + ":");
            System.out.println("Specialty: " + maxStudentGroup.getSpecialty() +
                    ", Course: " + maxStudentGroup.getCourse() +
                    ", Group: " + maxStudentGroup.getGroup() +
                    ", Number of Students: " + maxStudentGroup.getNumOfStudents());
        } else {
            System.out.println("No groups found for course " + targetCourse);
        }
    }
}
