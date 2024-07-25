package client.view;

public class View {
	// METODOS FUNCIONAIS
	public static void limparTela() {
		try {
            String sistemaOperacional = System.getProperty("os.name");

            if (sistemaOperacional.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Erro ao limpar a tela: " + e.getMessage());
        }
	}
}
