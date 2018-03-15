package com.TelRan.course.application;

import com.TelRan.course.model.BoardData;
import com.TelRan.course.model.ListData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private BoardHelper boardHelper;
    private SessionHelper sessionHelper;
    private ListHelper listHelper;
    private NavigationHelper navigationHelper;
    WebDriver wd;
    private String browser;
    Properties properties;

    public ApplicationManager(String browser) {

        this.browser = browser;
        properties = new Properties();
    }

    public void init() throws IOException {
        String target = System.getProperty("target", "local");
        properties.load(new FileReader(String.format("C:\\Users\\User\\Documents\\GitHub\\mariannailchQA13\\trelloSeleniumProject\\src\\test\\resources\\%s.properties", target)));
        if(browser.equals(BrowserType.FIREFOX)){
            wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        }else if(browser.equals(BrowserType.CHROME)){
            wd = new ChromeDriver();
        }else if(browser.equals(BrowserType.IE)){
            wd = new InternetExplorerDriver();
        }
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        boardHelper = new BoardHelper(wd);
        sessionHelper = new SessionHelper(wd);
        listHelper = new ListHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        openSite(properties.getProperty("web.baseUrl"));
        sessionHelper.login(properties.getProperty("web.adminLogin"),properties.getProperty("web.adminPwd"));
    }

    public void openSite(String url) {
        wd.get(url);
    }

    public void stop() {
        wd.quit();
    }

    public BoardHelper getBoardHelper() {
        return boardHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public ListHelper getListHelper() {
        return listHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
