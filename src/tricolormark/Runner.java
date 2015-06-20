package tricolormark;

import java.util.Random;

public class Runner {

	private static Objeto[][] memoria = new Objeto[10][10];

	private static void main(String[] args) {
		preencherMemoria();

		for (int i = 0; i < memoria.length; i++) {
			transformarBrancoEmCinza(memoria[i][0]);
		}
		
		for (int i = 0; i < memoria.length; i++) {
			transformarCinzaEmPreto(memoria[i][0]);
		}
		
	}

	private static void preencherMemoria() {

		for (int i = 0; i < memoria.length; i++) {
			for (int j = 0; j < memoria.length; j++) {
				memoria[i][j] = new Objeto();
				memoria[i][j].setValue(Math.random());
				memoria[i][j].setCor(Cor.BRANCO);
			}
		}
		
		for (int i = 0; i < memoria.length; i++) {
				memoria[i][0].setCor(Cor.CINZA);
		}

		for (int i = 0; i < memoria.length - 1; i++) {
				memoria[i][0].setObjeto(memoria[i][i + 1]);
		}
		
		for (int i = 0; i < memoria.length; i++) {
			for (int j = 0; j < memoria.length - 1; j++) {
				Random random = new Random(System.currentTimeMillis());
				
				int linha = random.nextInt(9);
				int coluna = random.nextInt(9);
				
				if(memoria[i][j].getObjeto() == null)
					memoria[i][j].setObjeto(memoria[linha][coluna]);
			}
		}

	}
	
	private static void transformarBrancoEmCinza(Objeto objeto) {
		if(objeto.getObjeto() != null)
			if(objeto.getObjeto().getCor() == Cor.BRANCO) {
				objeto.getObjeto().setCor(Cor.CINZA);
				transformarBrancoEmCinza(objeto.getObjeto());
			}
		
	}

	private static void transformarCinzaEmPreto(Objeto objeto) {
		if(objeto.getObjeto() != null)
			if(objeto.getObjeto().getCor() == Cor.CINZA) {
				objeto.setCor(Cor.PRETO);
				transformarCinzaEmPreto(objeto.getObjeto());
			}
		
	}
	
}
