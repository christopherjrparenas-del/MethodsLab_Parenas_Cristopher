
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodslab_parenas_cristopher;

/**
 *
 * @author user
 */
public class MethodsLab_Parenas_Cristopher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int result = classifyTriangle(3, 3, 3);
        System.out.println(result);
        
         int ans = OddEven(20);
         System.out.println(ans);
    }
    static int OddEven(int oddeven) {
        int state;
        if (oddeven % 2 == 0) {
            state = 1;
        } else {
            state = 0;
        }
        return state;
    }
     public static int classifyTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return 0;
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            return 0;
        }
        if (a == b && b == c) {
            return 1; 
        } else if (a == b || b == c || a == c) {
            return 2; 
        } else {
            return 3;
        }
     }
}
    
    

