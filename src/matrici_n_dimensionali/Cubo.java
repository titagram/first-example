package matrici_n_dimensionali;

import java.util.Scanner;

public class Cubo {
	
	//Attributi
	int latox;
	int latoy;
	int latoz;
	
	//Costruttore
	Cubo(){};
	
	Cubo(int x, int y, int z){
		this.latox = x;
		this.latoy = y;
		this.latoz = z;
		int[][][] cubo = new int[x][y][z];
	}

	
	//Setter e Getter
	public int getLatox() {
		return latox;
	}

	public void setLatox(int latox) {
		this.latox = latox;
	}

	public int getLatoy() {
		return latoy;
	}

	public void setLatoy(int latoy) {
		this.latoy = latoy;
	}

	public int getLatoz() {
		return latoz;
	}

	public void setLatoz(int latoz) {
		this.latoz = latoz;
	}
	
		
	
	//Metodi custom
	
	public void writeCube(int[][][] cubo) {
		Scanner input = new Scanner(System.in);
		for(int i=0; i < this.latox; i++) {
			System.out.println(i);
			for(int j=0; j < this.latoy; j++) {
				System.out.println(j);
				for(int k=0; k < this.latoz; k++) {
					System.out.println(k);
				}
			}
		}
		
	}
	
	
	
	
	
	
	

}
