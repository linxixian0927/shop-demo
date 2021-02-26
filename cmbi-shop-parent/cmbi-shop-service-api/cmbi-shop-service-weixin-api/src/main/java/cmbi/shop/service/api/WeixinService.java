package cmbi.shop.service.api;

import cmbi.shop.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 微信接口
 */
@Api(tags = "微信模块")
public interface WeixinService {
    /**
     * 获取app参数
     */
    @ApiOperation(value = "获取用户信息")
    @GetMapping("/getApp")
    AppEntity getApp();
}
