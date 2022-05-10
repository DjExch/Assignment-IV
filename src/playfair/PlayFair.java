/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playfair;
import java.util.Scanner;

public class PlayFair {

    //Encryption Function
  static void encrypt(String pt, String key) {
    char[] pt_arr = pt.toCharArray();
    char[] key_arr = key.toCharArray();
    char[] alpha = {'A','B','C','D','E','F','G','H','I','K','L',
    'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    char[][] table = new char[5][5];
    char[] encpt_arr = new char[100];
    int encpt_arr_ctr = 0;
    int ctr = -1;
    for(int i=0;i<key_arr.length;i++)
        for(int j=0;j<25;j++)
        if(key_arr[i]==alpha[j])
        {
        ctr++;
        int round = ctr/5;
        table[round][ctr%5]=alpha[j];
        alpha[j]='0';
        break;
        }
        for(int i=0;i<alpha.length;i++)
        {
        if(alpha[i]!='0')
        {
        ctr++;
        int round = ctr/5;
        table[round][ctr%5]=alpha[i];
        }
        }
        char[] any=new char[100];
        int c=0;
        for(int i=0;i<pt_arr.length;i++)
        {
        if(i==0 && pt_arr[i]!=pt_arr[i+1] && 
        i+1<pt_arr.length)
        {
        any[c++]=pt_arr[i];
        continue;
        }
        if(i==1 && pt_arr[i]!=pt_arr[i+1] && 
        i+1<pt_arr.length)
        {
        any[c++]=pt_arr[i];
        continue;
        }
        if(i==pt_arr.length-2 && i%2==0 && 
        pt_arr[i]!=pt_arr[i-1]
        && pt_arr[i]!=pt_arr[i+1])
        {
        any[c++]=pt_arr[i];
        continue;
        }
        if(i==pt_arr.length-2 && i%2==0 && 
        pt_arr[i]!=pt_arr[i-1]
        && pt_arr[i]==pt_arr[i+1])
        {
        any[c++]=pt_arr[i];
        any[c++]='X';
        continue;
        }
        if(i==pt_arr.length-2 && i%2==0 && 
        pt_arr[i]==pt_arr[i-1]
        && pt_arr[i]!=pt_arr[i+1])
        {
        any[c++]=pt_arr[i];
        continue;
        }
        if(i==pt_arr.length-2 && i%2==0 && 
        pt_arr[i]==pt_arr[i-1]
        && pt_arr[i]==pt_arr[i+1])
        {
        any[c++]=pt_arr[i];
        any[c++]='X';
        continue;
        }
        if(i==pt_arr.length-2 && i%2!=0 && 
        pt_arr[i]!=pt_arr[i-1]
        && pt_arr[i]!=pt_arr[i+1])
        {
        any[c++]=pt_arr[i];
        continue;
        }
        if(i==pt_arr.length-2 && i%2!=0 && 
        pt_arr[i]!=pt_arr[i-1]
        && pt_arr[i]==pt_arr[i+1])
        {
        any[c++]=pt_arr[i];
        any[c++]='X';
        continue;
        }
        if(i==pt_arr.length-2 && i%2!=0 && 
        pt_arr[i]==pt_arr[i-1]
        && pt_arr[i]!=pt_arr[i+1])
        {
        any[c++]=pt_arr[i];
        continue;
        }
        if(i==pt_arr.length-2 && i%2!=0 && 
        pt_arr[i]==pt_arr[i-1]
        && pt_arr[i]==pt_arr[i+1])
        {
        any[c++]=pt_arr[i];
        any[c++]='X';
        continue;
        }
        if(i==pt_arr.length-1 && i%2==0 && 
        pt_arr[i]!=pt_arr[i-1])
        {
        any[c++]=pt_arr[i];
        continue;
        }
        if(i==pt_arr.length-1 && i%2==0 && 
        pt_arr[i]==pt_arr[i-1])
        {
        any[c++]=pt_arr[i];
        any[c++]='X';
        continue;
        }
        if(i==pt_arr.length-1 && i%2!=0 && 
        pt_arr[i]!=pt_arr[i-1])
        {
        any[c++]=pt_arr[i];
        continue;
        }
        if(i==pt_arr.length-1 && i%2!=0 && 
        pt_arr[i]==pt_arr[i-1])
        {
        any[c++]=pt_arr[i];
        any[c++]='X';
        continue;
        }
        if(i%2==0 && pt_arr[i]!=pt_arr[i-1] && 
        pt_arr[i]==pt_arr[i+1])
        {
        any[c++]=pt_arr[i];
        any[c++]='X';
        continue;
        }
        if(i%2==0 && pt_arr[i]!=pt_arr[i-1] && 
        pt_arr[i]!=pt_arr[i+1])
        {
        any[c++]=pt_arr[i];
        continue;
        }
        if(i%2==0 && pt_arr[i]==pt_arr[i-1] && 
        pt_arr[i]!=pt_arr[i+1])
        {
        any[c++]=pt_arr[i];
        continue;
        }
        if(i%2==0 && pt_arr[i]==pt_arr[i-1] && 
        pt_arr[i]==pt_arr[i+1])
        {
        any[c++]=pt_arr[i];
        any[c++]='X';
        continue;
        }
        if(i%2!=0 && pt_arr[i]!=pt_arr[i-1] && 
        pt_arr[i]==pt_arr[i+1])
        {
        any[c++]=pt_arr[i];
        any[c++]='X';
        continue;
        }
        if(i%2!=0 && pt_arr[i]!=pt_arr[i-1] && 
        pt_arr[i]!=pt_arr[i+1])
        {
        any[c++]=pt_arr[i];
        continue;
        }
        if(i%2!=0 && pt_arr[i]==pt_arr[i-1] && 
        pt_arr[i]!=pt_arr[i+1])
        {
        any[c++]=pt_arr[i];
        continue;
        }
        if(i%2!=0 && pt_arr[i]==pt_arr[i-1] && 
        pt_arr[i]==pt_arr[i+1])
        {
        any[c++]=pt_arr[i];
        any[c++]='X';
        continue;
        }
        }
        if(c%2!=0)
        any[c++]='X';
        System.out.print("\nThe Intermediate Text is: ");
        for(int i=0;i<c;i++)
        System.out.print(any[i]);
        System.out.println();
        for(int i=0;i<c;i=i+2)
        {
        if(any[i]=='J')
        any[i]='I';
        if(any[i+1]=='J')
        any[i+1]='I';
        int row1=0,row2=0,col1=0,col2=0;
        for(int j=0;j<5;j++)
        {
        for(int k=0;k<5;k++)
        {
        if(any[i]==table[j][k])
        {
        row1=j;
        col1=k;
        break;
        }
        }
        }
        for(int j=0;j<5;j++)
        {
        for(int k=0;k<5;k++)
        {
        if(any[i+1]==table[j][k])
        {
        row2=j;
        col2=k;
        break;
        }
        }
        }
        if(row1==row2)
        {
        col1=(col1+1)%5;
        col2=(col2+1)%5;
        encpt_arr[encpt_arr_ctr++]=table[row1][col1];
        encpt_arr[encpt_arr_ctr++]=table[row2][col2];
        }
        else if(col1==col2)
        {
        row1=(row1+1)%5;
        row2=(row2+1)%5;
        encpt_arr[encpt_arr_ctr++]=table[row1][col1];
        encpt_arr[encpt_arr_ctr++]=table[row2][col2];
        }
        else if(row1!=row2 && col1!=col2)
        {
        int row=0,col=0;
        row=row1;
        col=col2;
        encpt_arr[encpt_arr_ctr++]=table[row][col];
        row=row2;
        col=col1;
        encpt_arr[encpt_arr_ctr++]=table[row][col];
        }
        else
        {
            }
        }
        System.out.println("\nThe Reference Table is: ");
        for(int i=0;i<5;i++)
        {
        for(int j=0;j<5;j++)
        System.out.print(table[i][j]+" ");
        System.out.print("\n");
        }
        System.out.print("\nThe Encrypted text is: ");
        for(int i=0;i<encpt_arr_ctr;i++)
        System.out.print(encpt_arr[i]);
        
  
  }
    //Decryption Function  
  static void decrypt(String encpt, String key) {
        char[] encpt_arr = encpt.toCharArray();
        char[] key_arr = key.toCharArray();
        char[] alpha = {'A','B','C','D','E','F','G','H','I','K','L',
        'M','N','O','P','Q','R','S','T','U','V','W','X'
        ,'Y','Z'};
        char[][] table=new char[5][5];
        int ctr=-1;
        for(int i=0;i<key_arr.length;i++)
        for(int j=0;j<25;j++)
        if(key_arr[i]==alpha[j])
        {
        ctr++;
        int round = ctr/5;
        table[round][ctr%5]=alpha[j];
        alpha[j]='0';
        break;
        }
        for(int i=0;i<alpha.length;i++)
        {
        if(alpha[i]!='0')
        {
        ctr++;
        int round = ctr/5;
        table[round][ctr%5]=alpha[i];
        }
        }
        System.out.println("\nThe Reference Table is:");
        for(int i=0;i<5;i++)
        {
        for(int j=0;j<5;j++)
        System.out.print(table[i][j]+" ");
        System.out.println();
        }
        char[] any=new char[encpt_arr.length];
        int any_ctr=0;
        for(int i=0;i<encpt_arr.length;i=i+2)
        {
        int row1=0,row2=0,col1=0,col2=0;
        for(int j=0;j<5;j++)
        {
        for(int k=0;k<5;k++)
        {
        if(encpt_arr[i]==table[j][k])
        {
        row1=j;
        col1=k;
        break;
        }
        }
        }
        for(int j=0;j<5;j++)
        {
        for(int k=0;k<5;k++)
        {
        if(encpt_arr[i+1]==table[j][k])
        {
        row2=j;
        col2=k;
        break;
        }
        }
        }
        if(row1==row2)
        {
        col1=(col1-1+5)%5;
        col2=(col2-1+5)%5;
        any[any_ctr++]=table[row1][col1];
        any[any_ctr++]=table[row2][col2];
        }
        else if(col1==col2)
        {
        row1=(row1-1+5)%5;
        row2=(row2-1+5)%5;
        any[any_ctr++]=table[row1][col1];
        any[any_ctr++]=table[row2][col2];
        }
        else if(row1!=row2 && col1!=col2)
        {
        int row=0,col=0;
        row=row1;
        col=col2;
        any[any_ctr++]=table[row][col];
        row=row2;
        col=col1;
        any[any_ctr++]=table[row][col];
        }
        else
        {
        }
        }
        System.out.print("\nThe Intermediate Text is: ");
        for(int i=0;i<any_ctr;i++)
        System.out.print(any[i]);
        char[] decpt_arr=new char[100];
        int decpt_arr_ctr=0;
        for(int i=0;i<any_ctr;i++)
        {
        if(i==0)
        {
        decpt_arr[decpt_arr_ctr++]=any[i];
        continue;
        }
        if(i==1 && any[i-1]==any[i+1] && 
        any[i]=='X')
        {
        continue;
        }
        if(i==1 && any[i-1]!=any[i+1] && 
        any[i]!='X')
        {
        decpt_arr[decpt_arr_ctr++]=any[i];
        continue;
        }
        if(i==2 && any[i-1]==any[i+1] && 
        any[i]=='X')
        {
        continue;
        }
        if(i==2 && any[i-1]!=any[i+1] && 
        any[i]!='X')
        {
        decpt_arr[decpt_arr_ctr++]=any[i];
        continue;
        }
        if(i!=any_ctr-2 && i!=any_ctr-1
        && any[i-1]==any[i+1] && any[i]=='X')
        {
        continue;
        }
        if(i!=any_ctr-2 && i!=any_ctr-1
        && any[i-1]==any[i+1] && any[i]!='X')
        {
        decpt_arr[decpt_arr_ctr++]=any[i];
        continue;
        }
        if(i==any_ctr-2 && any[i-1]==any[i+1] 
        && any[i]=='X')
        {
        continue;
        }
        if(i==any_ctr-2 && any[i-1]==any[i+1] 
        && any[i]!='X')
        {
        decpt_arr[decpt_arr_ctr++]=any[i];
        continue;
        }
        if(i==any_ctr-1 && i%2!=0 && 
        any[i]=='X')
        {
        continue;
        }
        if(i==any_ctr-1 && any[i]!='X')
        {
        decpt_arr[decpt_arr_ctr++]=any[i];
        continue;
        }
        if(i==any_ctr-1 && i%2==0 && 
        any[i]=='X')
        {
        continue;
        }
        if(i>=0)
        {
        decpt_arr[decpt_arr_ctr++]=any[i];
        continue;
        }
        }
        System.out.print("\n\nThe Decrypted Text is: ");
        for(int i=0;i<decpt_arr_ctr;i++)
        System.out.print(decpt_arr[i]);
        }
  

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String pt, et, key, option;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter key: ");
        key = scanner.nextLine();
        System.out.println("Please choose operation (1) Encrypt   (2) De-crypt ");
        option = scanner.nextLine();
        
        if(Integer.parseInt(option) == 1){
            
            System.out.println("Please Enter your Plain Text : ");
            pt = scanner.nextLine();
            encrypt(pt.toUpperCase(),key);
            System.out.println();
            System.out.println("Please choose operation (1) Encrypt   (2) De-crypt ");
            option = scanner.nextLine();
            
        }
        if(Integer.parseInt(option) == 2){
            System.out.println("Please Enter your Cipher Text : ");
            et = scanner.nextLine();
            decrypt(et.toUpperCase(),key);
            System.out.println();
            System.out.println("Please choose operation (1) Encrypt   (2) De-crypt ");
            option = scanner.nextLine();
        }
        scanner.close();
        //encrypt(pt.toUpperCase(), key.toUpperCase());
        //decrypt(pt, key);
        
        
        
    }
    
}
