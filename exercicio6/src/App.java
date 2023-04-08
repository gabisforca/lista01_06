import java.util.Scanner;

class Main {
  public static void main(String[] args){
    //passo 1:variavel
    double raio;
    double area;
    
    //passo 2: entrada de dados 
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o raio do circulo");
    raio = teclado.nextDouble();

    // passo 3: calcular salario
    area = Math.PI * (raio * raio) ;
    // passo 4: exibir salario 
    System.out.println("a área do circulo é:" + area);
  }
}
