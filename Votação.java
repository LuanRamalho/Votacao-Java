import java.util.Scanner;

public class Votação 
{
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        
        float VC, VP; float VTC=0; float VTP = 0;
        float VT;
        float PC, PP;
        int i;
        
        i = 1;
        while(i>0)
        {
            System.out.print("Digite a quantidade de votos para o Marcelo Crivela: ");
            VC = ler.nextInt();
            
            System.out.print("Digite a quantidade de votos para o Pedro Paulo: ");
            VP = ler.nextInt();
            
            VTC = VTC + VC;
            VTP = VTP + VP;
            VT = VTC + VTP;
            
            PC = (VTC / VT) * 100;
            PP = (VTP / VT) * 100;
            
            System.out.println("");
            System.out.println("Votos para o Marcelo Crivella: "+ VTC + "           Porcentagem de votos para o Marcelo Crivella: "+PC+"%%"); 
            System.out.println("Votos para o Pedro Paulo: "+ VTP + "                Porcentagem de votos para o Pedro Paulo: "+PP+"%%"); 
            System.out.println("Votos Totais: "+VT);
            
            System.out.println("");
            System.out.println("");
            
            System.out.println("Digite 1 para continuar ou 0 para sair");
            i = ler.nextInt();
            System.out.println("");
        }

    }
    
}
