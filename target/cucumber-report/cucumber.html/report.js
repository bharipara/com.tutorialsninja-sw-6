$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AccountLoginTest.feature");
formatter.feature({
  "line": 1,
  "name": "AccountLogin",
  "description": "As a user should Navigate to LoginPage Successfully",
  "id": "accountlogin",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9167881100,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "verify User Should Navigate To LoginPage Successfully",
  "description": "",
  "id": "accountlogin;verify-user-should-navigate-to-loginpage-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    },
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am On homepage",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I can Click on My Account Link.",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I can Call the method “selectMyAccountOptions” method and pass the parameter \"Login\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I can Verify the text “Returning Customer”",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 127615300,
  "status": "passed"
});
formatter.match({
  "location": "AccountLoginSteps.iCanClickOnMyAccountLink()"
});
formatter.result({
  "duration": 134925800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 78
    }
  ],
  "location": "AccountLoginSteps.iCanCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameter(String)"
});
formatter.result({
  "duration": 123490700,
  "status": "passed"
});
formatter.match({
  "location": "AccountLoginSteps.iCanVerifyTheTextReturningCustomer()"
});
formatter.result({
  "duration": 40135340200,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//h2[contains(text(),\u0027Returning Customer\u0027)]\"}\n  (Session info: chrome\u003d113.0.5672.93)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.9.0\u0027, revision: \u0027d7057100a6\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [917cf8f328542d1ec7a086fb7f61f183, findElement {using\u003dxpath, value\u003d//h2[contains(text(),\u0027Returning Customer\u0027)]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 113.0.5672.93, chrome: {chromedriverVersion: 113.0.5672.63 (0e1a4471d5ae..., userDataDir: C:\\Users\\bhart\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:50480}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:50480/devtoo..., se:cdpVersion: 113.0.5672.93, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 917cf8f328542d1ec7a086fb7f61f183\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:193)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:183)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy24.getText(Unknown Source)\r\n\tat com.tutorialsninja.utility.Utility.getTextFromElement(Utility.java:62)\r\n\tat com.tutorialsninja.pages.MyAccountPage.getReturningCustomerText(MyAccountPage.java:51)\r\n\tat com.tutorialsninja.steps.AccountLoginSteps.iCanVerifyTheTextReturningCustomer(AccountLoginSteps.java:23)\r\n\tat ✽.Then I can Verify the text “Returning Customer”(AccountLoginTest.feature:8)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1009550100,
  "status": "passed"
});
formatter.before({
  "duration": 6232566700,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "verify That User Should Login And Logout Successfully",
  "description": "",
  "id": "accountlogin;verify-that-user-should-login-and-logout-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@smoke"
    },
    {
      "line": 9,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I am On homepage",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I can Click on My Account Link.",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I can Call the method “selectMyAccountOptions” method and pass the parameter \"login\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I Enter Email address",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I Enter Password",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I can Click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I can Verify text “My Account”",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I can Click on My Account Link.",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I can Call the method “selectMyAccountOptions” method and pass the parameter \"Logout\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I can Verify the text “Account Logout”",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I can Click on Continue button",
  "keyword": "And "
});
formatter.match({
  "location": "TopMenuSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 39000,
  "status": "passed"
});
formatter.match({
  "location": "AccountLoginSteps.iCanClickOnMyAccountLink()"
});
formatter.result({
  "duration": 82948900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "login",
      "offset": 78
    }
  ],
  "location": "AccountLoginSteps.iCanCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameter(String)"
});
formatter.result({
  "duration": 68997400,
  "status": "passed"
});
formatter.match({
  "location": "AccountLoginSteps.iEnterEmailAddress()"
});
formatter.result({
  "duration": 40158455600,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#input\\-email\"}\n  (Session info: chrome\u003d113.0.5672.93)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.9.0\u0027, revision: \u0027d7057100a6\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [0e4adbf13b2d52e50f98d535b02ee157, findElement {using\u003did, value\u003dinput-email}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 113.0.5672.93, chrome: {chromedriverVersion: 113.0.5672.63 (0e1a4471d5ae..., userDataDir: C:\\Users\\bhart\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:50526}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:50526/devtoo..., se:cdpVersion: 113.0.5672.93, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 0e4adbf13b2d52e50f98d535b02ee157\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:193)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:183)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy24.sendKeys(Unknown Source)\r\n\tat com.tutorialsninja.utility.Utility.sendTextToElement(Utility.java:73)\r\n\tat com.tutorialsninja.pages.MyAccountLoginPage.enterEmailAddress(MyAccountLoginPage.java:40)\r\n\tat com.tutorialsninja.steps.AccountLoginSteps.iEnterEmailAddress(AccountLoginSteps.java:30)\r\n\tat ✽.And I Enter Email address(AccountLoginTest.feature:14)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AccountLoginSteps.iEnterPassword()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AccountLoginSteps.iCanClickOnLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AccountLoginSteps.iCanVerifyTextMyAccount()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AccountLoginSteps.iCanClickOnMyAccountLink()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Logout",
      "offset": 78
    }
  ],
  "location": "AccountLoginSteps.iCanCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameter(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AccountLoginSteps.iCanVerifyTheTextAccountLogout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AccountLoginSteps.iCanClickOnContinueButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1001525100,
  "status": "passed"
});
formatter.uri("AccountRegisterTest.feature");
formatter.feature({
  "line": 1,
  "name": "AccountRegister",
  "description": "",
  "id": "accountregister",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5407470300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "verify User Should Navigate To RegisterPage Successfully",
  "description": "",
  "id": "accountregister;verify-user-should-navigate-to-registerpage-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@snaity"
    },
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am On homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I can Click on My Account Link.",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I can Call the method “selectMyAccountOptions” method and pass the parameter Register",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I can Verify the text “Register Account”",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 23800,
  "status": "passed"
});
formatter.match({
  "location": "AccountLoginSteps.iCanClickOnMyAccountLink()"
});
formatter.result({
  "duration": 156510500,
  "status": "passed"
});
formatter.match({
  "location": "AccountRegisterSteps.iCanCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameterRegister()"
});
formatter.result({
  "duration": 114500,
  "status": "passed"
});
formatter.match({
  "location": "AccountRegisterSteps.iCanVerifyTheTextRegisterAccount()"
});
formatter.result({
  "duration": 40162830200,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//h1[normalize-space()\u003d\u0027Register Account\u0027]\"}\n  (Session info: chrome\u003d113.0.5672.93)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.9.0\u0027, revision: \u0027d7057100a6\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [2db30bc750bb9d2af7d3441884410813, findElement {using\u003dxpath, value\u003d//h1[normalize-space()\u003d\u0027Register Account\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 113.0.5672.93, chrome: {chromedriverVersion: 113.0.5672.63 (0e1a4471d5ae..., userDataDir: C:\\Users\\bhart\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:50571}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:50571/devtoo..., se:cdpVersion: 113.0.5672.93, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 2db30bc750bb9d2af7d3441884410813\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:193)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:183)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy24.getText(Unknown Source)\r\n\tat com.tutorialsninja.utility.Utility.getTextFromElement(Utility.java:62)\r\n\tat com.tutorialsninja.pages.MyAccountPage.getRegisterAccountText(MyAccountPage.java:46)\r\n\tat com.tutorialsninja.steps.AccountRegisterSteps.iCanVerifyTheTextRegisterAccount(AccountRegisterSteps.java:19)\r\n\tat ✽.Then I can Verify the text “Register Account”(AccountRegisterTest.feature:8)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 986321300,
  "status": "passed"
});
formatter.before({
  "duration": 5574930100,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "verify That User RegisterAccount Successfully",
  "description": "",
  "id": "accountregister;verify-that-user-registeraccount-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@smoke"
    },
    {
      "line": 9,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I am on Register page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I can Click on My Account Link.",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I can Call the method “selectMyAccountOptions” method and pass the parameter Register",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I Enter First Name",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I Enter Last Name",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I Enter Email",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I Enter Telephone",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I Enter Password",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I Enter Password Confirm",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I can Select Subscribe Yes radio button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I can Click on Privacy Policy check box",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I can Click on Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I can Verify the message “Your Account Has Been Created!”",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I can Click on Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I can Click on My Account Link.",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I can Call the method “selectMyAccountOptions” method and pass the parameter \"Logout\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I can Verify the text “Account Logout”",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I can Click on Continue button",
  "keyword": "And "
});
formatter.match({
  "location": "AccountRegisterSteps.iAmOnRegisterPage()"
});
formatter.result({
  "duration": 36100,
  "status": "passed"
});
formatter.match({
  "location": "AccountLoginSteps.iCanClickOnMyAccountLink()"
});
formatter.result({
  "duration": 99130800,
  "status": "passed"
});
formatter.match({
  "location": "AccountRegisterSteps.iCanCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameterRegister()"
});
formatter.result({
  "duration": 33500,
  "status": "passed"
});
formatter.match({
  "location": "AccountRegisterSteps.iEnterFirstName()"
});
