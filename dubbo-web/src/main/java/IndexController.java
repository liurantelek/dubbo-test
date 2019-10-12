import com.lr.dubbo.order.DoOrderRequest;
import com.lr.dubbo.order.DoOrderResponse;
import com.lr.dubbo.order.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author liuran
 * @email: liu_ran_programmer@163.com
 * @time 2019/10/12
 * @Description: 描述:
 */
@Controller
@RequestMapping("/index/")
public class IndexController {
    @Autowired
    IOrderService orderService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        DoOrderRequest request = new DoOrderRequest();
        request.setName("jacky cheng");
        DoOrderResponse response = orderService.doOrder(request);

        return "login";
    }
}
