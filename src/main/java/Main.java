
import com.kavenegar.sdk.KavenegarApi;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elecomp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        KavenegarApi api=new KavenegarApi("796E5161645A7949536A4D7A565641414D636A4A4E513D3D");
        
        api.send("10004346", "09353364377","test");
        
        
    }
    
}
