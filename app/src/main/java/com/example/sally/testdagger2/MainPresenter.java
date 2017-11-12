package com.example.sally.testdagger2;

import javax.inject.Inject;

/**
 * Created by Sally on 11/11/2017.
 */

public class MainPresenter {
    @Inject
    public MainPresenter() {
    }

    public void testAnyMessage() {
        System.out.println("Test");
    }
}

