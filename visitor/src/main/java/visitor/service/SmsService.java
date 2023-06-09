package visitor.service;

import visitor.request.SmsRequest;

public interface SmsService {

    void sendSms(SmsRequest smsRequest);

}
