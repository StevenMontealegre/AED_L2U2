package model;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Dijkistra {

	public int distancia[] = new int[10];
	public int[][] costo = new int[10][10];

	public void calc(int n, int s) {
		int flag[] = new int[n + 1];
		int i, minpos = 1, k, c, minimo;

		for (i = 1; i <= n; i++) {
			flag[i] = 0;
			this.distancia[i] = this.costo[s][i];
		}
		c = 2;
		while (c <= n) {
			minimo = 99;
			for (k = 1; k <= n; k++) {
				if (this.distancia[k] < minimo && flag[k] != 1) {
					minimo = this.distancia[i];
					minpos = k;
				}
			}
			flag[minpos] = 1;
			c++;
			for (k = 1; k <= n; k++) {
				if (this.distancia[minpos] + this.costo[minpos][k] < this.distancia[k] && flag[k] != 1)
					this.distancia[k] = this.distancia[minpos] + this.costo[minpos][k];
			}
		}

	}

}
