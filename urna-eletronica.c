    #include <stdio.h>
     
    void menuVotacao()
    {
    	printf("Escolha um candidato:\n89 - Para votar em Alibaba\n93 - Para votar em Alcapone\n99 - Para voto Branco\n");
    }
    int insiraVoto(int *temporario)
    {   
        *temporario = 0;
    	printf("Digite o número:\n");
    	scanf("%d", temporario);
    	return *temporario;
     
    }
    int confirmaVoto(int *c_start)
    {
        int pergunta = 0;
    	printf("Você confirma seu voto?\n1 - Para sim\n2 - Para nao\n");
    	scanf("%d", &pergunta);
    	if(pergunta == 1)
            return *c_start = 1;
    	else if(pergunta == 2)
    	    return *c_start = 0;
    }
    void contabilizaVoto(int *temporario, int *c_alibaba, int *c_alcapone, int *c_branco, int *c_nulo)
    {
    	if(*temporario == 89)
    		(*c_alibaba)++;
    	else if(*temporario == 93)
    		(*c_alcapone)++;
    	else if(*temporario == 99)
    		(*c_branco)++;
    	else 
    		(*c_nulo)++;
    }
     
     
     
    int main() 
    {
        int alibaba = 0, alcapone = 0, branco = 0, temp = 0, nulo = 0, start = 0;
    	    while(start != 1)
    	    {
    	     menuVotacao();
    	     insiraVoto(&temp);
    	     printf("\n\nValor de temporario = %d\n", temp);
    	     confirmaVoto(&start);
    	     if(start == 1)
    		        contabilizaVoto(&temp, &alibaba, &alcapone, &branco, &nulo);
    	    }
            printf("Total de votos:\nAlibaba = [%d]\nAlcapone = [%d]\nVotos em branco = [%d]\nVotos nulos = [%d]\n", alibaba, alcapone, branco, nulo);
        return 0;
    }
