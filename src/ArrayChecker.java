public class ArrayChecker {
    public static boolean check(Pole[][] plocha) {
        /*

        x / x / x
        x / x / x
        x / x / x

         */

        //Projíždí sloupce
        for (int i = 0; i < 3; i++) {
            //Projíždí řádky
            for (int z = 0; z < 3; z++) {
                //Zkontroluje zda je políčko prázdný
                if (plocha[i][z].getObsah() != Obsah.NIC) {
                    Obsah obsahPole = plocha[i][z].getObsah();
                    //vlevo
                    if (i == 2) {
                        for (int l = 2; l >= 0; l--) {
                            if (plocha[l][z].getObsah() != obsahPole) {
                                break;
                            }
                            if (l == 0) {
                                return true;
                            }
                        }
                    }
                    //vpravo
                    if (i == 0) {
                        for (int n = 0; n <= 2; n++) {
                            if (plocha[n][z].getObsah() != obsahPole) {
                                break;
                            }
                            if (n == 2) {
                                return true;
                            }
                        }
                    }
                    //nahoru
                    if (z == 2) {
                        for (int m = 2; m >= 0; m--) {
                            if (plocha[i][m].getObsah() != obsahPole) {
                                break;
                            }
                            if (m == 0) {
                                return true;
                            }
                        }
                    }
                    //dolu
                    if (z == 0) {
                        for (int b = 0; b <= 2; b++) {
                            if (plocha[i][b].getObsah() != obsahPole) {
                                break;
                            }
                            if (b == 2) {
                                return true;
                            }
                        }
                    }
                    //šikmo
                    //pravo-dolu
                    if (i == 0 && z == 0) {
                        for (int c = 0; c <= 2; c++) {
                            if (plocha[c][c].getObsah() != obsahPole) {
                                break;
                            }
                            if (c == 2) {
                                return true;
                            }
                        }
                    }
                    //levo-nahodu
                    if (i == 2 && z == 2) {
                        for (int x = 2; x >= 0; x++) {
                            if (plocha[x][x].getObsah() != obsahPole) {
                                break;
                            }
                            if (x == 0) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
