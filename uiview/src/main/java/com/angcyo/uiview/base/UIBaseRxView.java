package com.angcyo.uiview.base;

import rx.subscriptions.CompositeSubscription;

/**
 * Copyright (C) 2016,深圳市红鸟网络科技股份有限公司 All rights reserved.
 * 项目名称：
 * 类的描述：
 * 创建人员：Robi
 * 创建时间：2016/12/12 18:15
 * 修改人员：Robi
 * 修改时间：2016/12/12 18:15
 * 修改备注：
 * Version: 1.0.0
 */
public abstract class UIBaseRxView extends UIBaseDataView {
    protected CompositeSubscription mSubscriptions;

    @Override
    public void onViewCreate() {
        super.onViewCreate();
        mSubscriptions = new CompositeSubscription();
    }

    @Override
    public void onViewUnload() {
        super.onViewUnload();
        if (!mSubscriptions.isUnsubscribed()) {
            mSubscriptions.unsubscribe();
        }
    }
}
