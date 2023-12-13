public class Boom {
    public static void main(String[] args) {
        for (int i = 30; i >= 0; i--) {
            System.out.println("Contagem regressiva: " + i);
            esperarSegundo();
        }

        System.out.println("EXPLOSÃO");
    }
    private static void esperarSegundo() {
        try {
            Thread.sleep(1000);  // Aguarda por 1 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}