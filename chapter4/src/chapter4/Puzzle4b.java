/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter4;

/**
 *
 * @author Hoeco
 */
public class Puzzle4b {
    int ivar;
    
    public int doStuff(int factor) {
        if (ivar > 100) {
            return ivar*factor;
        } else {
            return ivar*(5-factor);
        }
    }
}
