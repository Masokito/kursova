package Maincode.emailsender;

import org.simplejavamail.api.email.Email;
import org.simplejavamail.api.mailer.Mailer;
import org.simplejavamail.api.mailer.config.TransportStrategy;
import org.simplejavamail.email.EmailBuilder;
import org.simplejavamail.mailer.MailerBuilder;


public class EmailSender {
    static Mailer mailer = MailerBuilder
            .withSMTPServer("smtp.elasticemail.com", 2525, "dgtfgdgfdg@proton.me", "FEAC393A13AFD12ECFCCCE83C815826E2900")
            .withTransportStrategy(TransportStrategy.SMTP_TLS)
            .buildMailer();
    static public void send(String receiverEmail,String error){

        Email email = EmailBuilder.startingBlank()
                .from("From", receiverEmail)
                .to("1 st Receiver", "fhhgyh8@gmail.com")
                .withSubject("Error")
                .withPlainText("Error occurred " + error + " in program")
                .buildEmail();
        mailer.sendMail(email);
    }

}
