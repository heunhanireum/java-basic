package poly.ex.pay0practice;

public class PayService {

    public void processPay(String option, int amount) {
        Pay inputPay;

        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        inputPay = Pay.getPay(option);

        boolean result = payValid(inputPay, amount);

        payYN(result);
    }

    private boolean payValid(Pay inputPay, int amount) {
        if (inputPay == null) {
            System.out.println("결제 수단이 없습니다.");
            return false;
        } else {
            return inputPay.pay(amount);
        }
    }

    private void payYN(boolean result) {
        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
