public class BonusCalc {
    static final int BONUS_LIMIT = 1000;
    static final int BONUS_GIFT = 1;
    static final int BONUS_STEP = 100;

    static int bonuscalculator(int currentBill, int payment) {
        int total = currentBill + payment;
        int bonusRubles = 0;
        if (payment>BONUS_LIMIT) {
            bonusRubles = payment/BONUS_STEP*BONUS_GIFT;
            total = total + bonusRubles;
        }
        return bonusRubles;
    }
}
