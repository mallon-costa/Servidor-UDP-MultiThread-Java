/*
Trabalho pr�tico sobre sockets UDP,
para disciplina de Sistemas Distribuidos.
Equipe:
Alaim de Jesus Le�o Costa
Manoel Malon Costa de Moura
*/
package br.com.unifesspa;

public class Test {
	public static void main(String[] args) throws Exception {
		new Thread(new ClienteUdp(8888)).start();
		new Thread(new ServidorUdp(8888)).start();
	}
}
