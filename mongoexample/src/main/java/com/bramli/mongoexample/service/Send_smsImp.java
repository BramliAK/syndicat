package com.bramli.mongoexample.service;
import java.util.ArrayList;
import java.util.List;
import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.MessageFactory;
import com.twilio.sdk.resource.instance.Message;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.stereotype.Service;

/**
 * Created by ahmed on 27/04/2018.
 */
@Service
public class Send_smsImp implements  Send_sms {
    // Find your Account Sid and Token at twilio.com/user/account
    public static final String ACCOUNT_SID = "AC7a811b023e3fe166b5e9fe22e27e9425";
    public static final String AUTH_TOKEN = "884dc606be98898ccf56a7d6f61b923c";
    public static final String TWILIO_NUMBER = "+14807253119";
    @Override
    public void sensSMS() {
        try {
            TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);

            // Build a filter for the MessageList
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("Body", " good luck !!  "));
            params.add(new BasicNameValuePair("To", "+21628063045")); //Add real number here
            params.add(new BasicNameValuePair("From", TWILIO_NUMBER));

            MessageFactory messageFactory = client.getAccount().getMessageFactory();
            Message message = messageFactory.create(params);
            System.out.println(message.getSid());
        }
        catch (TwilioRestException e) {
            System.out.println(e.getErrorMessage());
        }
    }
}
