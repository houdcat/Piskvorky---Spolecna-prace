public class ArrayChecker {
    public static void check(Pole[][] plocha){
        /*

        x / x / x
        x / x / x
        x / x / x

         */


        //Projíždí sloupce
        for (int i = 0;i<3; i++){
            //Projíždí řádky
            for (int z = 0;z<3; z++){
                //Zkontroluje zda je políčko prázdný
                if (plocha[i][z].getObsah() != Obsah.NIC) {

                }
            }
        }
    }
}
