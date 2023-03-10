package algaworks;

public class Array2d {

    public static void main(String[] args) {

        Double[] faturamentoJaneiro = new Double[] { 1500.0, 2000.0, 3000.0 };
        Double[] faturamentoFevereiro = new Double[] { 2500.0, 2800.0, 3500.0 };

        Double[][] faturamentoAnual = new Double[][] { faturamentoJaneiro, faturamentoFevereiro };
//
//        System.out.println("Faturamento do dia 1 de Janeiro: " + faturamentoAnual[0][0]);
//        System.out.println("Faturamento do dia 1 de Fevereiro: " + faturamentoAnual[1][0]);

        for (int i = 0; i < faturamentoAnual.length; i++) {
            System.out.println("Mês: " + (i + 1));

            Double[] mes = faturamentoAnual[i];

            for (int y = 0; y < mes.length; y++) {
                Double dia = mes[y]; //Double dia = faturamentoAnual[i][y];
                System.out.println("Dia " + (y + 1) + ": " + dia);
            }
        }
    }
}
