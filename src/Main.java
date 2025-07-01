import java.util.Scanner;
class Cards {
    public static void main(String[] args) {
        CreditCard Card1 = new CreditCard("BY00001", 25000);
        CreditCard Card2 = new CreditCard("BY00005", 50000);
        CreditCard Card3 = new CreditCard("BY00009", 75000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cумма пополнения : ");
        int Cash1 = scanner.nextInt();
        System.out.println("Сумма снятия : ");
        int Cash2 = scanner.nextInt();
        scanner.close();
        Card1.topUp(Cash1);
        Card2.topUp(Cash1);
        Card3.takeOff(Cash2);
        System.out.println("Новый баланс на первой карте: " + Card1.cash);
        System.out.println("Новый баланс на второй карте: " + Card2.cash);
        System.out.println("Новый баланс на третьей карте: " + Card3.cash);
        System.out.println("Информация о первой карте " + Card1.information());
        System.out.println("Информация о второй карте " + Card2.information());
        System.out.println("Информация о третьей карте " + Card3.information());
    }
}