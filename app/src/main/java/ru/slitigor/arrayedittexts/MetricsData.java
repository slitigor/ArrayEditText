package ru.slitigor.arrayedittexts;

public class MetricsData {
    private static final int LEN = 25;
    private static final double[] units = new double[LEN];

    public MetricsData() { init(); }

    private void init() {
        units[0] = .0254;
        units[1] = .9144;
        units[2] = .3048;
        units[3] = 1609.34399;
        units[4] = Math.pow(10, -24);
        units[5] = Math.pow(10, -21);
        units[6] = Math.pow(10, -18);
        units[7] = Math.pow(10, -15);
        units[8] = Math.pow(10, -12);
        units[9] = Math.pow(10, -9);
        units[10] = Math.pow(10, -6);
        units[11] = Math.pow(10, -3);
        units[12] = Math.pow(10, -2);
        units[13] = Math.pow(10, -1);
        units[14] = Math.pow(10, 0);
        units[15] = Math.pow(10, 1);
        units[16] = Math.pow(10, 2);
        units[17] = Math.pow(10, 3);
        units[18] = Math.pow(10, 6);
        units[19] = Math.pow(10, 9);
        units[20] = Math.pow(10, 12);
        units[21] = Math.pow(10, 15);
        units[22] = Math.pow(10, 18);
        units[23] = Math.pow(10, 21);
        units[24] = Math.pow(10, 24);
    }

    // По позиции и значению определяется значение в метрах
    // а затем обновляются все остальные значения
    private double[] convertDist(int unitsPos, double val) {
        double[] res =  new double[LEN];
        for (int i = 0; i < LEN; i++)
            res[i] = (units[unitsPos] / units[i]) * val;
        return res;
    }
}
