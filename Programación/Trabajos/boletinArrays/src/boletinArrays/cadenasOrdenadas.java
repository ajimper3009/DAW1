package boletinArrays;

public class cadenasOrdenadas {

    public static void main(String[] args) {

        String[] array = {"alfa", "beta", "gamma", "delta"};

        boolean intercambio;

        do {
            intercambio = false;
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j].compareTo(array[j + 1]) > 0) {
                        String temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        intercambio = true;
                    }
                }
            }

        } while (intercambio);

        // Imprime el array ordenado
        for (String elemento : array) {
            System.out.println(elemento);
        }
    }
}

