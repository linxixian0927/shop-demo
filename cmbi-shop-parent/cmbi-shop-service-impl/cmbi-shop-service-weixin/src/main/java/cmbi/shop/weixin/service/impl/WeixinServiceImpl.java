package cmbi.shop.weixin.service.impl;

import cmbi.shop.entity.AppEntity;
import cmbi.shop.service.api.WeixinService;
import org.springframework.web.bind.annotation.RestController;

/**
 * 1、使用@RestController,当前为接口实现类，接口不存在视图层因此命名为Service
 * 2、不需要再次填写SprigMVC映射路径，已通过接口继承到@RequestMapping()
 */
@RestController
public class WeixinServiceImpl implements WeixinService {
    @Override
    public AppEntity getApp() {
        return new AppEntity("dddddddddddddddddddd","huawei mate pro 30");
    }
}
