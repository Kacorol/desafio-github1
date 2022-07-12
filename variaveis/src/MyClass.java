
public class MyClass {
    public static void main(String args[]) {
      int i;
      //int i; var nao podem ter o mesmo nome
      int I;
      //int 1a; var nao podem começar com nº
      //int _1a; evitar começar com underline
      int $aq;
      int _1a;
      
      i=5;
      I=10;
      _1a=20;
      $aq=7;
      
      final int j=10;
      
      
      int asrn24678md;
      //int asrn2$4678 md=10 var nao pode ter espaço
      int asrn2$4678_md=10;
      //int asrn2$46%78_md=10; var nao pode usar carac especial

      asrn24678md=100;
      asrn2$4678_md=10;

      int quantidadeProduto=50;
      //int QuantidadeProduto; boas praticas =nao começar com letra maiuscula
      final int NUMERO_TENTATIVAS=5;
      //final int numeroTentativas=5; final sempre tds maiusculos separado por underline
      int QUANTIDADE_OPCOES =25;
      //int qtdProd; sem expressividade


      System.out.println(i);
      System.out.println(I);
      System.out.println(_1a);
      System.out.println($aq);

      System.out.println(j);
      System.out.println(asrn24678md);
      System.out.println(asrn2$4678_md);

      System.out.println(quantidadeProduto);
      System.out.println(NUMERO_TENTATIVAS);
      System.out.println(QUANTIDADE_OPCOES);
    }
     
  }     

