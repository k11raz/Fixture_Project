import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
        ReadFile rf = new ReadFile();
        rf.FileReader();
        WriteFile wr = new WriteFile();
        Sorting Sorting = new Sorting();

        Sports[] Fteams = new Sports[4];
        Fteams[0] = new Sports("F", "Napoli");
        Fteams[1] = new Sports("F", "Benfica");
        Fteams[2] = new Sports("F", "Marsilya");
        Fteams[3] = new Sports("F", "Real Madrid");

        Sports[] Hteams = new Sports[4];
        Hteams[0] = new Sports("H", "Nilufer Bld.");
        Hteams[1] = new Sports("H", "Guneysu");
        Hteams[2] = new Sports("H", "Goztepe");
        Hteams[3] = new Sports("H", "IzmirBB");

        Sports[] Bteams = new Sports[4];
        Bteams[0] = new Sports("B", "Karsiyaka");
        Bteams[1] = new Sports("B", "Bahcesehir");
        Bteams[2] = new Sports("B", "Galatasaray");
        Bteams[3] = new Sports("B", "Fenerbahce");

        Sports[] Vteams = new Sports[4];
        Vteams[0] = new Sports("V", "Eczacibasi");
        Vteams[1] = new Sports("V", "Vakifbank");
        Vteams[2] = new Sports("V", "Galatasaray");
        Vteams[3] = new Sports("V", "Fenerbahce");

        String[][] arrOfFix = new String[14][4];

        for (int i = 0; i < 14; i++) {
            arrOfFix[i] = rf.FileReader()[i].split("    ");
        }

        String[][] scores = new String[14][2];

        for (int i = 0; i < 14; i++) {
            scores[i] = arrOfFix[i][3].split(":");
        }

        for (int i = 0; i < 14; i++) {
            switch (arrOfFix[i][0]) {
                case "F":
                    for (int j = 0; j < 4; j++) {
                        if (arrOfFix[i][1].equals(Fteams[j].name)) {
                            if (Integer.parseInt(scores[i][0]) > Integer.parseInt(scores[i][1])) {
                                Fteams[j].updated(Integer.parseInt(scores[i][0]), Integer.parseInt(scores[i][1]));

                            } else if (Integer.parseInt(scores[i][0]) == Integer.parseInt(scores[i][1])) {
                                Fteams[j].updated(Integer.parseInt(scores[i][0]), Integer.parseInt(scores[i][1]));

                            } else {
                                Fteams[j].updated(Integer.parseInt(scores[i][0]), Integer.parseInt(scores[i][1]));
                            }
                        } else if (arrOfFix[i][2].equals(Fteams[j].name)) {
                            if (Integer.parseInt(scores[i][1]) > Integer.parseInt(scores[i][0])) {
                                Fteams[j].updated(Integer.parseInt(scores[i][1]), Integer.parseInt(scores[i][0]));

                            } else if (Integer.parseInt(scores[i][0]) == Integer.parseInt(scores[i][1])) {
                                Fteams[j].updated(Integer.parseInt(scores[i][1]), Integer.parseInt(scores[i][0]));

                            } else {
                                Fteams[j].updated(Integer.parseInt(scores[i][1]), Integer.parseInt(scores[i][0]));
                            }
                        }
                    }
                    break;
                case "H":
                    for (int j = 0; j < 4; j++) {
                        if (arrOfFix[i][1].equals(Hteams[j].name)) {
                            if (Integer.parseInt(scores[i][0]) > Integer.parseInt(scores[i][1])) {
                                Hteams[j].updatedH(Integer.parseInt(scores[i][0]), Integer.parseInt(scores[i][1]));

                            } else if (Integer.parseInt(scores[i][0]) == Integer.parseInt(scores[i][1])) {
                                Hteams[j].updatedH(Integer.parseInt(scores[i][0]), Integer.parseInt(scores[i][1]));

                            } else {
                                Hteams[j].updatedH(Integer.parseInt(scores[i][0]), Integer.parseInt(scores[i][1]));
                            }
                        } else if (arrOfFix[i][2].equals(Hteams[j].name)) {
                            if (Integer.parseInt(scores[i][1]) > Integer.parseInt(scores[i][0])) {
                                Hteams[j].updatedH(Integer.parseInt(scores[i][1]), Integer.parseInt(scores[i][0]));

                            } else if (Integer.parseInt(scores[i][0]) == Integer.parseInt(scores[i][1])) {
                                Hteams[j].updatedH(Integer.parseInt(scores[i][1]), Integer.parseInt(scores[i][0]));

                            } else {
                                Hteams[j].updatedH(Integer.parseInt(scores[i][1]), Integer.parseInt(scores[i][0]));
                            }
                        }
                    }
                    break;
                case "B":
                    for (int j = 0; j < 4; j++) {
                        if (arrOfFix[i][1].equals(Bteams[j].name)) {
                            if (Integer.parseInt(scores[i][0]) > Integer.parseInt(scores[i][1])) {
                                Bteams[j].updatedB(Integer.parseInt(scores[i][0]), Integer.parseInt(scores[i][1]));

                            } else if (Integer.parseInt(scores[i][0]) == Integer.parseInt(scores[i][1])) {
                                Bteams[j].updatedB(Integer.parseInt(scores[i][0]), Integer.parseInt(scores[i][1]));

                            } else {
                                Bteams[j].updatedB(Integer.parseInt(scores[i][0]), Integer.parseInt(scores[i][1]));
                            }
                        } else if (arrOfFix[i][2].equals(Bteams[j].name)) {
                            if (Integer.parseInt(scores[i][1]) > Integer.parseInt(scores[i][0])) {
                                Bteams[j].updatedB(Integer.parseInt(scores[i][1]), Integer.parseInt(scores[i][0]));

                            } else if (Integer.parseInt(scores[i][0]) == Integer.parseInt(scores[i][1])) {
                                Bteams[j].updatedB(Integer.parseInt(scores[i][1]), Integer.parseInt(scores[i][0]));

                            } else {
                                Bteams[j].updatedB(Integer.parseInt(scores[i][1]), Integer.parseInt(scores[i][0]));
                            }
                        }
                    }
                    break;
                case "V":
                    for (int j = 0; j < 4; j++) {
                        if (arrOfFix[i][1].equals(Vteams[j].name)) {
                            if (Integer.parseInt(scores[i][0]) > Integer.parseInt(scores[i][1])) {
                                Vteams[j].updatedV(Integer.parseInt(scores[i][0]), Integer.parseInt(scores[i][1]));

                            } else if (Integer.parseInt(scores[i][0]) == Integer.parseInt(scores[i][1])) {
                                Vteams[j].updatedV(Integer.parseInt(scores[i][0]), Integer.parseInt(scores[i][1]));

                            } else {
                                Vteams[j].updatedV(Integer.parseInt(scores[i][0]), Integer.parseInt(scores[i][1]));
                            }
                        } else if (arrOfFix[i][2].equals(Vteams[j].name)) {
                            if (Integer.parseInt(scores[i][1]) > Integer.parseInt(scores[i][0])) {
                                Vteams[j].updatedV(Integer.parseInt(scores[i][1]), Integer.parseInt(scores[i][0]));

                            } else if (Integer.parseInt(scores[i][0]) == Integer.parseInt(scores[i][1])) {
                                Vteams[j].updatedV(Integer.parseInt(scores[i][1]), Integer.parseInt(scores[i][0]));

                            } else {
                                Vteams[j].updatedV(Integer.parseInt(scores[i][1]), Integer.parseInt(scores[i][0]));
                            }
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        Sorting.Sort(Fteams);
        Sorting.Sort(Vteams);
        Sorting.Sort(Hteams);
        Sorting.Sort(Bteams);

        String[] fLast = new String[4];
        String[] vLast = new String[4];
        String[] bLast = new String[4];
        String[] hLast = new String[4];
        for (int i = 0; i < 4; i++) {
            fLast[i] = Fteams[i].toString();
            vLast[i] = Vteams[i].toString();
            bLast[i] = Bteams[i].toString();
            hLast[i] = Hteams[i].toString();
        }
        wr.writeFile(fLast, "football.txt");
        wr.writeFile(bLast,"basketball.txt");
        wr.writeFile(vLast,"voleyball.txt");
        wr.writeFile(hLast,"handball.txt");
    }
}