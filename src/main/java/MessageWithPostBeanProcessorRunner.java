import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageWithPostBeanProcessorRunner {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("post-processor-config.xml");

        Message message = (Message) context.getBean("message");
        System.out.println("\n==================================");
        System.out.println(message.getMessage());
        System.out.println("==================================\n");
        //context.registerShutdownHook();

        MSG msg = (MSG) context.getBean("msg");
        System.out.println("\n==================================");
        System.out.println(msg.getMsg());
        System.out.println("==================================\n");
        context.registerShutdownHook();
    }
}
