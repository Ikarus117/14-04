import javax.swing.JOptionPane;
import java.util.ArrayList;

public class AppBloco{

   public static void main(String[]args){
      
      BlocoDeNotas2 b = new BlocoDeNotas2();
      
      String notas;
      
      String menu = "1-Adicionar nota\n2-Remover nota\n3-Alterar nota\n4-Listar notas\n5-Sair";
      
      int opcao;
      int zero;
      
      do{
         opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
         if(opcao==1){
            notas = JOptionPane.showInputDialog("Nome da anotacao: ");
            b.addNota(notas);
         
         }else if(opcao == 2){
            int leo = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da nota que deseja ser excluida: "));
            b.removerNota(leo);
       
         if(opcao == 3){
            String mensagem = JOptionPane.showInputDialog("Anotacao: ");
            zero = Integer.parseInt(JOptionPane.showInputDialog("Qual nota voce deseja substituir?"));
            b.mudarNota(zero, mensagem);
               JOptionPane.showMessageDialog(null, "Nota Trocada");
            }
            
         }if(opcao == 4){
            b.listarNotas();
           
         }      
      }while(opcao !=5);
             
      if(opcao == 5){
            
      }else {
         JOptionPane.showMessageDialog(null, "Opcao Invalida");
      }
   
   }
}