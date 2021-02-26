package cmbi.shop.service.member.impl;

import cmbi.shop.entity.AppEntity;
import cmbi.shop.member.service.api.MemberService;
import cmbi.shop.service.member.fegin.WeixinFeginClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberServiceImpl implements MemberService {

    @Autowired
    private WeixinFeginClient weixinFeginClient;

    @Override
    public AppEntity getMemberToWeixin() {
        return weixinFeginClient.getApp();
    }
}
