package com.xiaoyu.simplenote.common.beacon;

import java.util.ArrayList;
import java.util.List;

import com.xiaoyu.beacon.spring.config.BeaconReference;
import com.xiaoyu.beacon.starter.BeaconReferConfiguration;
import com.xiaoyu.beacon.starter.anno.BeaconRefer;
import com.xiaoyu.simplenote.modules.biz.message.service.api.IMessageService;
import com.xiaoyu.simplenote.modules.biz.user.service.api.IUserService;
import com.xiaoyu.simplenote.modules.common.service.api.IFileService;

/**
 * @author hongyu
 * @date 2019-02
 * @description
 */
@BeaconRefer
public class BeaconConfig extends BeaconReferConfiguration {

    @Override
    protected List<BeaconReference> doFindBeaconRefers() {
        List<BeaconReference> list = new ArrayList<>();
        list.add(new BeaconReference()
                .setInterfaceName(IUserService.class.getName())
                .setCheck(false)
                .setGroup("dev"));
        list.add(new BeaconReference()
                .setInterfaceName(IFileService.class.getName())
                .setCheck(false)
                .setGroup("dev"));
        list.add(new BeaconReference()
                .setInterfaceName(IMessageService.class.getName())
                .setCheck(false)
                .setGroup("dev"));
        return list;
    }

}