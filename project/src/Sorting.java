public class Sorting {
    public void Sort(Sports[] s) {
        for (int i = 0; i < s.length - 1; i++) {
            for (int j = 0; j < s.length - 1 - i; j++) {
                if (s[j].totalPoint < s[j + 1].totalPoint) {
                    Sports gecici = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = gecici;
                }
                if (s[j].totalPoint == s[j + 1].totalPoint) {
                    if ((s[j].scored - s[j].concede) < (s[j + 1].scored - s[j + 1].concede)) {
                        Sports gecici = s[j];
                        s[j] = s[j + 1];
                        s[j + 1] = gecici;
                    }
                }
            }
        }
    }
}
