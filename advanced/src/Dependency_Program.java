
//implementing interface

interface MessageService
{
    String getMessage();

}

class EmailService implements MessageService{

    @Override
    public String getMessage()
    {
        return "Email Message";
    }
}

//class that depends on MessageService through injection

class MessageProcessor{

    private final MessageService messageService;

    public MessageProcessor( MessageService messService)
    {
        this.messageService=messService;
    }

    public void processMessage()
    {
        String message = messageService.getMessage();
        System.out.println("Processing Message: " + message);
    }

}

public class Dependency_Program {

    public static  void main(String[] args)
    {
        MessageService emailservice = new EmailService();

        MessageProcessor messageProcessor = new MessageProcessor(emailservice);

        messageProcessor.processMessage();


    }
}
