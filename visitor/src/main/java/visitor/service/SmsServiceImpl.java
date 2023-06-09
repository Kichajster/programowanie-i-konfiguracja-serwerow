package visitor.service;

import visitor.model.SmsModel;
import visitor.request.SmsRequest;
import org.springframework.stereotype.Component;
import com.google.gson.Gson;
import java.util.Date;

@Component
public class SmsServiceImpl implements SmsService {

    @Override
    public void sendSms(SmsRequest smsRequest) {
        SmsModel smsModel = new SmsModel(
                smsRequest.getPhoneNumber(),
                "+48 123 458 456",
                smsRequest.getMessage(),
                new Date()
        );
        smsResult(smsModel);
        System.out.println(toJson(smsModel));
    }
    public void smsResult(SmsModel smsModel) {
        System.out.println(String.format("Sms został wysłany: \n" +
                "\tNumer odbiorcy: %s,\n" +
                "\tNumer wysyłającego: %s,\n" +
                "\tTreść smsa: %s,\n" +
                "\tData wysłania sms: %s\n", smsModel.getRecipient(), smsModel.getSender(), smsModel.getMessage(), smsModel.getSendDate())
        );
    }
    public String toJson(SmsModel smsModel){
        Gson gson = new Gson();
        String json = gson.toJson(smsModel);
        return String.format("Sms zbudowany do JsonB: %s, \t", json);
    }
}
