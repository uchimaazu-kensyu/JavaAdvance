package Exception;


import java.util.Scanner;

public class ExceptionPractice extends IlligalScoreException {

    public static void main(String[] args){
        String rank;
        boolean i = true;
        while(i){
            var sc = new Scanner(System.in);
            var input = sc.nextLine();
            var score = Integer.parseInt(input);

            try{
                rank = judgeScore(score);
                System.out.println(rank);
                i = false;
            }catch (IlligalScoreException e){
                System.out.println("スコアが不正です。");
                System.out.println("もう一度入力してください。");
                e.printStackTrace();
            }

        }

    }


    public static String judgeScore(int score) throws IlligalScoreException {
        String rank ;
        if(score>100 || score <0){
            throw new IlligalScoreException();
        }else if(score >= 80){
            rank ="A";
        }else if(score >=70){
            rank = "B";
        }else if(score >=60){
            rank = "C";
        }else{
            rank = "D";
        }
        return rank;
    }
}
