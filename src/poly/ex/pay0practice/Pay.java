package poly.ex.pay0practice;

public abstract class Pay {

    public static Pay getPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            return null;
        }
    }

    public abstract boolean pay(int amount);
    public abstract String getOption();
}
