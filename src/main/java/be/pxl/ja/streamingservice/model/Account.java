package be.pxl.ja.streamingservice.model;

import java.util.List;

public class Account {
    private String email;
    private String password;
    private StreamingPlan streamingPlan;
    private PaymentInfo paymentInfo;
    private List<Profile> profiles;

    public Account(){

    }

    public Account(String text, String text1) {
    }

    public void setStreamingPlan(StreamingPlan value) {
    }

    public void verifyPassword(String password) {
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
    }

    public Object getEmail() {
        return email;
    }
}
