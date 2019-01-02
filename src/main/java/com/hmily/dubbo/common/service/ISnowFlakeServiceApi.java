package com.hmily.dubbo.common.service;

public interface ISnowFlakeServiceApi {

    long getSnowFlakeID();

    long[] getSnowFlakeIDs(int size);

}
