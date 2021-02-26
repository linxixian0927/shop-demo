package cmbi.shop.member.service.api;

import cmbi.shop.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 会员服务
 */
@Api(tags = "会员模块")
public interface MemberService {
    /**
     * 调度微信获取信息
     * @return
     */
    @ApiOperation(value = "调度微信获取用户信息")
    @GetMapping("/getMember")
    public AppEntity getMemberToWeixin();
}
