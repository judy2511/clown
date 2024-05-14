package model;

import controler.Draw;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HighScore {
    
              static  int score;
               public static String path=Draw.path;
    public static void save() {
		try {String s=(""+HighScore.score);
                    System.out.println(s);
			 BufferedWriter writer = new BufferedWriter(new FileWriter(path+"highScore.txt"));
		 writer.write(s );
                  writer.close();
                } catch (IOException e1) {
			// TODO Auto-generated catch block

                }
	}

	public static String load() {
 String s = null;
		try {Scanner scanner = new Scanner(new File(path+"highScore.txt"));
		  s=scanner.nextLine();
                } catch (IOException e) {
                    // TODO Auto-generated catch block

		}
return s;
	}
         public static void saveHighScore(int score){
             HighScore.score=score;
             String x=load();
             if(score>Integer.parseInt(x)){
                 save();
             }
         }
}

