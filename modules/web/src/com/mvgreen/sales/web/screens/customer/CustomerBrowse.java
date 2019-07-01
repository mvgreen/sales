package com.mvgreen.sales.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.mvgreen.sales.entity.Customer;

@UiController("sales_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
}