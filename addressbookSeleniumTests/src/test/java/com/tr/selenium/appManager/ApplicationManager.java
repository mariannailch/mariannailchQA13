package com.tr.selenium.appManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private GroupHelper groupHelper;
    private SessionHelper sessionHelper;
    private ContactHelper contactHelper;
    private NavigationHelper navigationHelper;
    WebDriver wd;
    private String browser;
    Properties properties;

    public ApplicationManager(String browser) {

        this.browser = browser;
        properties = new Properties();
    }

    public void start() throws IOException {
        String target = System.getProperty("target", "local");
        properties.load(new FileReader(String.format("addressbookSeleniumTests/src/test/resources/%s.properties", target)));
        //String browser = BrowserType.CHROME;
        if(browser.equals(BrowserType.FIREFOX)){
            wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        }else if(browser.equals(BrowserType.CHROME)){
            wd = new ChromeDriver();
        }else if(browser.equals(BrowserType.IE)){
            wd = new InternetExplorerDriver();
        }

        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        groupHelper = new GroupHelper(wd);
        sessionHelper = new SessionHelper(wd);
        contactHelper = new ContactHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        openSite(properties.getProperty("web.baseUrl"));//"http://localhost/addressbook/");
        sessionHelper.login(properties.getProperty("web.adminLogin"), properties.getProperty("web.adminPwd"));
    }

    public void openSite(String url) {
        wd.get(url);
    }

    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
