public class faculty {
    studentGroup[] groups;

    public faculty(studentGroup[] groups) {
        this.groups = groups;
    }

    public studentGroup getGroupWithMaxStudentsByCourse(int targetCourse) {
        studentGroup maxGroup = null;
        int maxStudents = 0;

        for (studentGroup group : groups) {
            if (group.getCourse() == targetCourse && group.getNumOfStudents() > maxStudents) {
                maxGroup = group;
                maxStudents = group.getNumOfStudents();
            }
        }

        return maxGroup;
    }
}
