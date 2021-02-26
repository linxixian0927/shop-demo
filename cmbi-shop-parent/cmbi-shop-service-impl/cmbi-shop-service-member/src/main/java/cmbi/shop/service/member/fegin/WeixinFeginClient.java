package cmbi.shop.service.member.fegin;

import cmbi.shop.service.api.WeixinService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "app-mayikt-weixin",url = "http://127.0.0.1:8201")
public interface WeixinFeginClient extends WeixinService {
}
