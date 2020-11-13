    import java.util.Scanner;
     
    class GestaoDeNotas
    {
    	public static void main (String[] args)
    	{
    		Aluno an1 = new Aluno();
    		double n1, n2, n3;
    		n1 = 4;
    		n2 = 10;
    		n3 = 3;
    		//Scanner input = new Scanner(System.in);
    		an1.setNome("Luiz");
    		an1.setMatricula("35411");
    		an1.setNotas(n1,n2,n3);
    		an1.calculaMedia();
     
    	}
    }
     
     
    class Aluno
    {
    	private static String nome;
    	private static String matricula;
    	private static double nota1, nota2, nota3, media;
     
     
    	//==================== Construtor ======================\\
    	public Aluno()
    	{
    		nome = "";
    		matricula = "";
    		nota1 = 0;
    		nota2 = 0;
    		nota3 = 0;
    		media = 0;
     
    	}
     
    	//========================= Matricula =================================\\
    	public static void setMatricula(String codigoMatricula)
    	{
    		matricula = codigoMatricula;
    	}
     
    	public static String getMatricula()
    	{
    		return matricula;
    	}
     
    	//========================= Notas =================================\\
    	public static void setNotas(double num1, double num2, double num3)
    	{
    		nota1 = num1; 
    		nota2 = num2; 
    		nota3 = num3;
    	}
     
    	public static double getNota1(double num1)
    	{return nota1;
    	}
    	public static double getNota2(double num2)
    	{return nota2;
    	}
    	public static double getNota3(double num3)
    	{return nota3;
    	}
     
     
     
    	//========================= Nome =================================\\
    	public static void setNome(String nomeDoAluno)
    	{nome = nomeDoAluno;
    	}
    	public static String getNome()
    	{return nome;
    	}
     
    	//========================== Media ===============================\\
     
    	public static void calculaMedia()
    	{
    		media = ((nota1 + nota2 + nota3) / 3);
    		if(media <= 0.0)
    		{
    			System.out.println("Não há notas cadastradas no sistema!");
    		}
     
    		else if(media >= 7)
    		{
    			System.out.println("Aluno aprovado!");
    		}
    		else
    		{
    			System.out.println("Aluno reprovado!");
    		}
    	}
     
    }
