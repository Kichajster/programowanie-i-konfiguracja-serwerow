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

        System.out.println(String.format("Sms został wysłany: \n" +
                "\tNumer odbiorcy: %s,\n" +
                "\tNumer wysyłającego: %s,\n" +
                "\tTreść smsa: %s,\n" +
                "\tData wysłania sms: %s\n\n", smsModel.getRecipient(), smsModel.getSender(), smsModel.getMessage(), smsModel.getSendDate())
        );

        Gson gson = new Gson();
        String json = gson.toJson(smsModel);
        System.out.println(String.format("Sms zbudowany do JsonB: %s, \n\t", json));


    }
}
