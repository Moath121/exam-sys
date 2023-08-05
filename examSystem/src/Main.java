import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Exam e = new Exam();
        int score = 0;
        for (int i =0; i<5;i++){
            System.out.println(e.getQ(i));
            System.out.print("Enter the answer: ");
            String answer = read.next();
            if (e.getA(i).equals(answer)){
                score = Integer.parseInt(e.getS(i));
                e.calcScore(score);
            }
        }
        System.out.println("your score is "+ e.getScore()+ " and your grade "+ e.getGrade(e.getScore()));



    }
}


class Exam{
    String[][] q = {
            {"What is 3 + 3: ","6","5"},
            {"What is capital of Oman: ","muscat","10"},
            {"What is 9 \\ 3: ","3","5"},
            {"what year sultan Qaboos started AL-Nahdha: ","1770","20"},
            {"What is the color of the sea: ","blue","10"}
    };
    int score = 0 ;


    String getQ(int qNumber){ // get question from q array
        return q[qNumber][0];
    }
    String getA(int aNumber){ // get answer from q array,, tfaseel././././././...//..
        return q[aNumber][1];
    }
    String getS(int sNumber){ //get score from q array
        return q[sNumber][2];
    }

    void calcScore(int questionScore){
            score += questionScore;
    }
    int getScore(){
        return score;
    }

    String getGrade(int g){
        if (g <= 10){
            return "D";
        }
        else if (g <=20){
            return "C";
        }
        else if (g <= 30){
            return "B";
        }
        else if (g <=40){
            return "B+";
        }
        else {
            return "A";
        }

    }}

