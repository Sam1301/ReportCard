package com.example.sam.reportcard;

import android.util.Log;

/**
 * Created by sam on 11/7/16.
 * <p/>
 * {@link ReportCard} models a report card with letter grades{A, B, C, D, F}
 * for {@link ReportCard#NUMBER_OF_SUBJECT} subjects{Language, Mathematics, Physics, Chemistry,
 * Computer Science, Physical Education}.
 * Also displays aggregate {@link ReportCard#gpa}GPA.
 */
public class ReportCard {
    // Log Tag for logging messages
    private static final String LOG_TAG = ReportCard.class.getSimpleName();

    // Constants to store grade points for all five letter grades
    private final byte A_GRADE_POINT = 4;
    private final byte B_GRADE_POINT = 3;
    private final byte C_GRADE_POINT = 2;
    private final byte D_GRADE_POINT = 1;
    private final byte F_GRADE_POINT = 0;

    // Constant to store number of subjects
    private final byte NUMBER_OF_SUBJECT = 6;

    // Array to store grades
    private char[] grades = new char[NUMBER_OF_SUBJECT];

    // Constants to store subject grade indices for all 6 subjects in grades array
    // Can be accessed outside the class to input grades using constructor
    public final byte LANGUAGE_INDEX = 0;
    public final byte MATH_INDEX = 1;
    public final byte PHY_INDEX = 2;
    public final byte CHEM_INDEX = 3;
    public final byte CS_INDEX = 4;
    public final byte PE_INDEX = 5;

    // Variable to store aggregate GPA
    private float gpa;

    /**
     * Sets the initial grade for all {@link ReportCard#NUMBER_OF_SUBJECT} subjects.
     *
     * @param grades Array containing grades for all {@link ReportCard#NUMBER_OF_SUBJECT}
     *               subjects{Language, Mathematics, Physics, Chemistry, Computer Science,
     *               Physical Education} respectively.
     */
    public ReportCard(char[] grades) {
        // Store grades for all 6 subjects in grades array
        System.arraycopy(grades, 0, this.grades, 0, NUMBER_OF_SUBJECT);

        // Calculate GPA
        calculateGPA();
    }

    /**
     * Calculates aggregate GPA for {@link ReportCard#NUMBER_OF_SUBJECT}
     * subjects using the formula :
     * total number of grade points / number of subjects
     * and stores in {@link ReportCard#gpa}
     */
    private void calculateGPA() {
        // Set initial value for gpa
        gpa = 0f;

        // Calculate sum of grade points
        for (int i = 0; i < NUMBER_OF_SUBJECT; i++) {
            switch (grades[i]) {
                case 'A':
                case 'a':
                    gpa += A_GRADE_POINT;
                    break;
                case 'B':
                case 'b':
                    gpa += B_GRADE_POINT;
                    break;
                case 'C':
                case 'c':
                    gpa += C_GRADE_POINT;
                    break;
                case 'D':
                case 'd':
                    gpa += D_GRADE_POINT;
                    break;
                case 'F':
                case 'f':
                    gpa += F_GRADE_POINT;
                    break;
                default:
                    Log.e(LOG_TAG, "Invalid Grade");
                    break;
            }
        }

        // Divide sum by number of subjects and store in gpa
        gpa /= NUMBER_OF_SUBJECT;
    }

    /**
     * Returns Language grade.
     *
     * @return Language grade
     */
    public char getLanguageGrade() {
        return grades[LANGUAGE_INDEX];
    }

    /**
     * Returns Mathematics grade.
     *
     * @return Mathematics grade
     */
    public char getMathematicsGrade() {
        return grades[MATH_INDEX];
    }

    /**
     * Returns Physics grade.
     *
     * @return Physics grade
     */
    public char getPhysicsGrade() {
        return grades[PHY_INDEX];
    }

    /**
     * Returns Chemistry grade.
     *
     * @return Chemistry grade
     */
    public char getChemistryGrade() {
        return grades[CHEM_INDEX];
    }

    /**
     * Returns Computer Science grade.
     *
     * @return Computer Science grade
     */
    public char getComputerScienceGrade() {
        return grades[CS_INDEX];
    }

    /**
     * Returns Physical Education grade.
     *
     * @return Physical Education grade
     */
    public char getPhysicalEducationGrade() {
        return grades[PE_INDEX];
    }

    /**
     * Resets Language grade.
     *
     * @param grade new grade for Language
     */
    public void setLanguageGrade(char grade) {
        grades[LANGUAGE_INDEX] = grade;

        // Calculate GPA after resetting the grade
        calculateGPA();
    }

    /**
     * Resets Mathematics grade.
     *
     * @param grade new grade for Mathematics
     */
    public void setMathematicsGrade(char grade) {
        grades[MATH_INDEX] = grade;

        // Calculate GPA after resetting the grade
        calculateGPA();
    }

    /**
     * Resets Physics grade.
     *
     * @param grade new grade for Physics
     */
    public void setPhysicsGrade(char grade) {
        grades[PHY_INDEX] = grade;

        // Calculate GPA after resetting the grade
        calculateGPA();
    }

    /**
     * Resets Chemistry grade.
     *
     * @param grade new grade for Chemistry
     */
    public void setChemistryGrade(char grade) {
        grades[CHEM_INDEX] = grade;

        // Calculate GPA after resetting the grade
        calculateGPA();
    }

    /**
     * Resets Computer Science grade.
     *
     * @param grade new grade for Computer Science
     */
    public void setComputerScienceGrade(char grade) {
        grades[CS_INDEX] = grade;

        // Calculate GPA after resetting the grade
        calculateGPA();
    }

    /**
     * Resets Physical Education grade.
     *
     * @param grade new grade for Physical Education
     */
    public void setPhysicalEducationGrade(char grade) {
        grades[PE_INDEX] = grade;

        // Calculate GPA after resetting the grade
        calculateGPA();
    }

    /**
     * To get gpa{@link ReportCard#gpa} calculated by {@link ReportCard#calculateGPA()}
     *
     * @return gpa {@link ReportCard#gpa} GPA
     */
    public float getGPA() {
        return gpa;
    }

    /**
     * Implementation of toString function to display report card summary.
     *
     * @return String which represents report card{@link ReportCard} summary.
     */
    @Override
    public String toString() {
        // Report card summary
        return "ReportCard:" +
                "\nLANGUAGE= " + grades[LANGUAGE_INDEX] +
                "\nMATHEMATICS=" + grades[MATH_INDEX] +
                "\nPHYSICS=" + grades[PHY_INDEX] +
                "\nCHEMISTRY=" + grades[CHEM_INDEX] +
                "\nCOMPUTER SCIENCE=" + grades[CS_INDEX] +
                "\nPHYSICAL EDUCATION=" + grades[PE_INDEX] +
                "\nGPA= " + gpa;
    }
}
