package CAR;

import java.util.Arrays;

class CarManager {

    public static final String DOMESTIC = "domestic";
    public static final String IMPORT = "import";
    public static final String SEDAN = "sedan";
    public static final String GAS = "gas";
    public static final String SPORT = "sport";
    public static final String SUV = "suv";
    public static final int SEAT5 = 5;
    public static final int SEAT7 = 7;
    public static final String PICKUP = "pickup";
    public static final String DIESEL = "diesel";

    public static void main(String[] args) {
        Mazda[][] mazdaProduct = mazdaProduct();
        int count = 0;
        for (int i = 0; i < mazdaProduct.length; i++) {
            for (int j = 0; j < mazdaProduct[i].length; j++) {
                count++;
            }
        }
        int index = 0;
        Mazda[] allMazdaProduct = new Mazda[count];
        for (int i = 0; i < mazdaProduct.length; i++) {
            for (int j = 0; j < mazdaProduct[i].length; j++) {
                allMazdaProduct[index] = mazdaProduct[i][j];
                index++;
            }
        }

        CarComparator c = new CarComparator();
        Arrays.sort(allMazdaProduct, c);
        for (Mazda value : allMazdaProduct) {
            System.out.println(value.getName() + " " + value.getCost());
        }
    }

    public static Mazda[][] mazdaProduct() {
        Mazda[] newMazda2 = new NewMazda2[4];
        newMazda2[0] = new NewMazda2("NEW MAZDA2 1.5L AT", 479, GAS, SEAT5, SEDAN, IMPORT);
        newMazda2[1] = new NewMazda2("NEW MAZDA2 1.5L DELUXE", 509, GAS, SEAT5, SEDAN, IMPORT);
        newMazda2[2] = new NewMazda2("NEW MAZDA2 1.5L LUXURY", 559, GAS, SEAT5, SEDAN, IMPORT);
        newMazda2[3] = new NewMazda2("NEW MAZDA2 1.5L PREMIUM", 559, GAS, SEAT5, SEDAN, IMPORT);

        Mazda[] newMazda2Sport = new NewMazda2Sport[3];
        newMazda2Sport[0] = new NewMazda2Sport("NEW MAZDA2 SPORT 1.5L DELUXE", 519, GAS, SEAT5, SPORT, IMPORT);
        newMazda2Sport[1] = new NewMazda2Sport("NEW MAZDA2 SPORT 1.5L LUXURY", 574, GAS, SEAT5, SPORT, IMPORT);
        newMazda2Sport[2] = new NewMazda2Sport("NEW MAZDA2 SPORT 1.5L PREMIUM", 619, GAS, SEAT5, SPORT, IMPORT);

        Mazda[] newMazda3 = new NewMazda3[5];
        newMazda3[0] = new NewMazda3("ALL-NEW MAZDA3 1.5L DELUXE", 669, GAS, SEAT5, SEDAN, DOMESTIC);
        newMazda3[1] = new NewMazda3("ALL-NEW MAZDA3 1.5L LUXURY", 729, GAS, SEAT5, SEDAN, DOMESTIC);
        newMazda3[2] = new NewMazda3("ALL-NEW MAZDA3 1.5L PREMIUM", 779, GAS, SEAT5, SEDAN, DOMESTIC);
        newMazda3[3] = new NewMazda3("ALL-NEW MAZDA3 1.5L SIGNATURE LUXURY", 799, GAS, SEAT5, SEDAN, DOMESTIC);
        newMazda3[4] = new NewMazda3("ALL-NEW MAZDA3 1.5L SIGNATURE PREMIUM", 849, GAS, SEAT5, SEDAN, DOMESTIC);

        Mazda[] newMazda3Sport = new NewMazda3Sport[5];
        newMazda3Sport[0] = new NewMazda3Sport("ALL-NEW MAZDA3 SPORT 1.5L DELUXE", 669, GAS, SEAT5, SPORT, DOMESTIC);
        newMazda3Sport[1] = new NewMazda3Sport("ALL-NEW MAZDA3 SPORT 1.5L LUXURY", 744, GAS, SEAT5, SPORT, DOMESTIC);
        newMazda3Sport[2] = new NewMazda3Sport("ALL-NEW MAZDA3 SPORT 1.5L PREMIUM", 799, GAS, SEAT5, SPORT, DOMESTIC);
        newMazda3Sport[3] = new NewMazda3Sport("ALL-NEW MAZDA3 SPORT 2.0L SIGNATURE LUXURY", 799, GAS, SEAT5, SPORT, DOMESTIC);
        newMazda3Sport[4] = new NewMazda3Sport("ALL-NEW MAZDA3 SPORT 2.0L SIGNATURE PREMIUM", 849, GAS, SEAT5, SPORT, DOMESTIC);

        Mazda[] newMazda6 = new NewMazda6[3];
        newMazda6[0] = new NewMazda6("NEW MAZDA6 2.0L LUXURY", 889, GAS, SEAT5, SEDAN, DOMESTIC);
        newMazda6[1] = new NewMazda6("NEW MAZDA6 2.0L PREMIUM", 949, GAS, SEAT5, SEDAN, DOMESTIC);
        newMazda6[2] = new NewMazda6("NEW MAZDA6 2.5L SIGNATURE PREMIUM", 1049, GAS, SEAT5, SEDAN, DOMESTIC);

        Mazda[] mazda6 = new Mazda6[2];
        mazda6[0] = new Mazda6("MAZDA6 2.0L LUXURY", 829, GAS, SEAT5, SEDAN, DOMESTIC);
        mazda6[1] = new Mazda6("MAZDA6 2.5L PREMIUM", 909, GAS, SEAT5, SEDAN, DOMESTIC);

        Mazda[] newMazdaCX5 = new MazdaCX5[6];
        newMazdaCX5[0] = new MazdaCX5("NEW MAZDA CX-5 2.0L DELUXE", 839, GAS, SEAT5, SUV, DOMESTIC);
        newMazdaCX5[1] = new MazdaCX5("NEW MAZDA CX-5 2.0L LUXURY", 879, GAS, SEAT5, SUV, DOMESTIC);
        newMazdaCX5[2] = new MazdaCX5("NEW MAZDA CX-5 2.0L PREMIUM", 919, GAS, SEAT5, SUV, DOMESTIC);
        newMazdaCX5[3] = new MazdaCX5("NEW MAZDA CX-5 2.5L LUXURY", 889, GAS, SEAT5, SUV, DOMESTIC);
        newMazdaCX5[4] = new MazdaCX5("NEW MAZDA CX-5 2.5L SIGNATURE PREMIUM 2WD", 999, GAS, SEAT5, SUV, DOMESTIC);
        newMazdaCX5[5] = new MazdaCX5("NEW MAZDA CX-5 2.5L SIGNATURE PREMIUM AWD", 1059, GAS, SEAT5, SUV, DOMESTIC);

        Mazda[] mazdaCX8 = new MazdaCX8[4];
        mazdaCX8[0] = new MazdaCX8("MAZDA CX-8 2.5L DELUXE", 999, GAS, SEAT7, SUV, DOMESTIC);
        mazdaCX8[1] = new MazdaCX8("MAZDA CX-8 2.5L DELUXE", 999, GAS, SEAT7, SUV, DOMESTIC);
        mazdaCX8[2] = new MazdaCX8("MAZDA CX-8 2.5L DELUXE", 999, GAS, SEAT7, SUV, DOMESTIC);
        mazdaCX8[3] = new MazdaCX8("MAZDA CX-8 2.5L DELUXE", 999, GAS, SEAT7, SUV, DOMESTIC);

        Mazda[] mazdaBT50 = new MazdaBT50[4];
        mazdaBT50[0] = new MazdaBT50("MAZDA BT-50 2.2L STANDARD MT", 579, DIESEL, SEAT5, PICKUP, IMPORT);
        mazdaBT50[1] = new MazdaBT50("MAZDA BT-50 2.2L DELUXE AT", 614, DIESEL, SEAT5, PICKUP, IMPORT);
        mazdaBT50[2] = new MazdaBT50("MAZDA BT-50 2.2L LUXURY AT", 644, DIESEL, SEAT5, PICKUP, IMPORT);
        mazdaBT50[3] = new MazdaBT50("MAZDA BT-50 3.2L PREMIUM AT", 749, DIESEL, SEAT5, PICKUP, IMPORT);

        Mazda[] newMazdaBT50 = new MazdaBT50[4];
        newMazdaBT50[0] = new MazdaBT50("ALL NEW MAZDA BT-50 1.9L MT 4X2", 659, DIESEL, SEAT5, PICKUP, IMPORT);
        newMazdaBT50[1] = new MazdaBT50("ALL NEW MAZDA BT-50 1.9L AT 4X2", 709, DIESEL, SEAT5, PICKUP, IMPORT);
        newMazdaBT50[2] = new MazdaBT50("ALL NEW MAZDA BT-50 1.9L LUXURY 4X2", 789, DIESEL, SEAT5, PICKUP, IMPORT);
        newMazdaBT50[3] = new MazdaBT50("ALL NEW MAZDA BT-50 1.9L PREMIUM 4X4", 849, DIESEL, SEAT5, PICKUP, IMPORT);

        Mazda[] mazdaCX3 = new MazdaCX3[3];
        mazdaCX3[0] = new MazdaCX3("MAZDA CX-3 1.5L DELUXE", 639, GAS, SEAT5, SUV, IMPORT);
        mazdaCX3[1] = new MazdaCX3("MAZDA CX-3 1.5L LUXURY", 679, GAS, SEAT5, SUV, IMPORT);
        mazdaCX3[2] = new MazdaCX3("MAZDA CX-3 1.5L PREMIUM", 719, GAS, SEAT5, SUV, IMPORT);

        Mazda[] mazdaCX30 = new MazdaCX30[2];
        mazdaCX30[0] = new MazdaCX30("MAZDA CX-30 2.0L LUXURY", 849, GAS, SEAT5, SUV, IMPORT);
        mazdaCX30[1] = new MazdaCX30("MAZDA CX-30 2.0L PREMIUM", 909, GAS, SEAT5, SUV, IMPORT);

        Mazda[][] mazdaArr = {newMazda2, newMazda2Sport, newMazda3,
                            newMazda3Sport, newMazda6, mazda6,
                            newMazdaCX5, mazdaCX8, mazdaBT50,
                            newMazdaBT50, mazdaCX3, mazdaCX30};
        return mazdaArr;
    }
}
