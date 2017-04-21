
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Simeon
 */
public class ReadTextLinesFromUrl {
    static ArrayList <String> wordList = new ArrayList<>(50) ;
    
     public static void main(String[] args) throws Exception {

        URL keyW = new URL("http://downloads.solarwinds.com/solarwinds/Release/Management/keywords.TXT");
        BufferedReader in = new BufferedReader(new InputStreamReader(keyW.openStream()));
        String inputLine;
        
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);        
            wordList.add(inputLine);
        }
        
        System.out.println("--------------------------");
        
        for (int iWord=0; iWord < wordList.size(); iWord++) {
            System.out.println(wordList.get(iWord));
        }
        
        in.close();
    }
    
    
    
}
