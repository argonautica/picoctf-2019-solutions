import java.util.*;

class VaultDoor1 {
    public static void main(String args[]) {
        VaultDoor1 vaultDoor = new VaultDoor1();
       checkPassword();


    }

    // I came up with a more secure way to check the password without putting
    // the password itself in the source code. I think this is going to be
    // UNHACKABLE!! I hope Dr. Evil agrees...
    //
    // -Minion #8728
    public static void checkPassword() {

        char[] temp = new char[32];



               temp[0] =  'd';
               temp[29] =  '7';
               temp[4] =  'r';
               temp[2] =  '5';
               temp[23] =  'r';
               temp[3] =  'c';
               temp[17] =  '4';
               temp[1] =  '3';
               temp[7] =  'b';
               temp[10] =  '_';
               temp[5] =  '4';
               temp[9] =  '3';
               temp[11] =  't';
               temp[15] =  'c';
               temp[8] =  'l';
               temp[12] =  'H';
               temp[20] =  'c';
               temp[14] =  '_';
               temp[6] =  'm';
               temp[24] =  '5';
               temp[18] =  'r';
               temp[13] =  '3';
               temp[19] =  '4';
               temp[21] =  'T';
               temp[16] =  'H';
               temp[27] =  '3';
               temp[30] =  'a';
               temp[25] =  '_';
               temp[22] =  '3';
               temp[28] =  'b';
               temp[26] =  '0';
               temp[31] =  '0';


               String t = "";
               for (char x : temp){

                   t += x;
               }

               System.out.println(t);


    }
}
