class CreditCard {
    String Number;
    int cash;
    CreditCard(String Number, int cash) {
        this.Number = Number;
        this.cash = cash;
    }
    void topUp(int plus) {
        cash += plus;
    }
    void takeOff(int plus) {
       cash -= plus;
    }
    String information() {
        String result = "Номер счета: " + Number + "," + " " + "Cумма на счете: " + cash;
        return result;
    }
}
