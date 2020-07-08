package pl.brych.aop_email_api.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pl.brych.aop_email_api.mail.EmailService;

import javax.mail.MessagingException;

@Slf4j
@Component
public class MailSenderAop {

    private EmailService emailService;

    public MailSenderAop(EmailService emailService) {
        this.emailService = emailService;
    }

    @EventListener(ApplicationReadyEvent.class)
    @MailSender
    public String sendMail() throws MessagingException {
        emailService.sendMail(
                "casjoab@gmail.com",
                "Temat maila",
                "Wiadomość",
                true);
        log.info("Im sending email");
        return "send";
    }
}
