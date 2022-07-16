/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter4;
import chapter4.Puzzle4b;

/**
 *
 * @author Hoeco
 */
public class Puzzle4 {
    Puzzle4b[] obs = new Puzzle4b[6];
    int y = 1;
    int x = 0;
    int result = 0;
    
    public int run () {
    
        while(x<6) {
            obs[x] = new Puzzle4b();
            obs[x].ivar = y;
            y = y*10;
            x = x + 1;
        }
        x = 6;
        while (x > 0) {
            x = x - 1;
            result = result + obs[x].doStuff(x);
        }
        System.out.println("result " + result);
        return result;
    }
    
}


