import com.lr.dubbo.order.DoOrderRequest;
import com.lr.dubbo.order.DoOrderResponse;
import com.lr.dubbo.order.IOrderQueryService;
import com.lr.dubbo.order.IOrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liuran
 * @email: liu_ran_programmer@163.com
 * @time 2019/10/11
 * @Description: 描述:
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("order-consumer.xml");
        IOrderService service = (IOrderService) context.getBean("orderService");
        IOrderQueryService queryService = (IOrderQueryService)context.getBean("orderQueryService");
        String result = queryService.doQuery("hahhaha");
        System.out.println(result);
        DoOrderRequest request = new DoOrderRequest();
        request.setName("刘然");
        DoOrderResponse response = service.doOrder(request);
        System.out.println(response);
    }
}
