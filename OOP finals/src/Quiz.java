public class Student extends Quiz { 
         public int totalScore = 100; 
         public int maxScore = 50; 
          
         public void divide (int totalScore, int maxScore) { 
                 grade = totalScore / maxScore; 
         } 
  
         public Student(String name, double grade) { 
                 super(name, grade); 
         } 
  
         @Override 
         public double calculateGrade() { 
                 return (totalScore / maxScore); 
         } 
 }



public abstract class Quiz { 
         protected String studentName; 
         protected double grade; 
         public int totalScore; 
         public int maxScore; 
  
         public Quiz(String name, double grade) { 
                 this.studentName = name; 
                 this.grade = 0; 
         } 
          
         public Quiz(int totalScore, int maxScore) { 
                 this.totalScore = 100; 
                 this.maxScore= 50; 
         } 
          
         public double getGrade () { 
                 return grade; 
         } 
          
         public void setTotalScore(int Tscore) { 
                 grade = Tscore; 
         } 
          
         public String getStudentName () { 
                 return studentName; 
         } 
          
         public void setStudentName (String name) { 
                 studentName = name; 
         } 
          
         public abstract double calculateGrade(); 
     
 }