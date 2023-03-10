package algaworks;

public class Array2dimesoes {

    public static void main(String[] args) {

        Double[] faturamentoJaneiro = new Double[] { 1500.0, 2000.0, 3000.0 };
        Double[] faturamentoFevereiro = new Double[] { 2500.0, 2800.0, 3500.0 };

        Double[][] faturamentoAnual = new Double[][] { faturamentoJaneiro, faturamentoFevereiro };

        Double[][][] faturamentoQuinquenal = new Double[][][] { faturamentoAnual };

        Double[][][][] faturamentoDaDecada = new Double[][][][] { faturamentoQuinquenal };

        for (int i = 0; i < faturamentoDaDecada.length; i++) {
            System.out.println("Mês: " + (i + 1));

            Double[] decada = faturamentoQuinquenal[i][i];

            for (int y = 0; y < decada.length; y++) {
                Double anual = decada[y]; //Double dia = faturamentoAnual[i][y];
                System.out.println("Dia " + (y + 1) + ": " + anual);
            }
        }
    }
}
