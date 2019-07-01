package com.mvgreen.sales.web.screens.customer;

import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.mvgreen.sales.entity.Customer;
import com.mvgreen.sales.entity.Order;

import javax.inject.Inject;

@UiController("sales_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
public class CustomerEdit extends StandardEditor<Customer> {
    @Subscribe
    private void onBeforeShow(BeforeShowEvent event) {
        ordersDl.setParameter("customer", getEditedEntity());
        getScreenData().loadAll();
    }
    @Inject
    private CollectionLoader<Order> ordersDl;
}