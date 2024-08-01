package com.web.base.pagesteps;

import com.thoughtworks.gauge.ContinueOnFailure;
import com.thoughtworks.gauge.Step;

public class MainPageSteps {

    public class MainPageeSteps extends BaseSteps {

        @ContinueOnFailure({AssertionError.class})
        @Step("Mainpage")
        public void mainPage() throws InterruptedException {
            MainPageeSteps Scenario3Page;
            Scenario3Page.mainPage();
        }
    }
}
