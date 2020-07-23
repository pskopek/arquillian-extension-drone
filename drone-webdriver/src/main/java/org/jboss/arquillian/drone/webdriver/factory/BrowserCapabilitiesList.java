package org.jboss.arquillian.drone.webdriver.factory;

import org.jboss.arquillian.drone.webdriver.spi.BrowserCapabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

/**
 * An internal mapping between browser capabilities property, implementation class and DesiredCapabilities. This class
 * also
 * supports implementationClass property which is now legacy configuration value.
 *
 * @author <a href="mailto:kpiwko@redhat.com">Karel Piwko</a>
 * @see DesiredCapabilities
 */
public class BrowserCapabilitiesList {

    public static class Chrome implements BrowserCapabilities {

        /**
         * DesiredCapabilities for a chrome browser.
         */
        public static DesiredCapabilities desiredCapabilities = new DesiredCapabilities(BrowserType.CHROME, "", Platform.ANY);

        @Override
        public String getImplementationClassName() {
            return "org.openqa.selenium.chrome.ChromeDriver";
        }

        @Override
        public Map<String, ?> getRawCapabilities() {
            return desiredCapabilities.asMap();
        }

        @Override
        public String getReadableName() {
            return "chrome";
        }

        @Override
        public int getPrecedence() {
            return 0;
        }
    }

    public static class Edge implements BrowserCapabilities {

        /**
         * DesiredCapabilities for an edge browser.
         */
        public static DesiredCapabilities desiredCapabilities = new DesiredCapabilities(BrowserType.EDGE, "", Platform.WINDOWS);

        @Override
        public String getImplementationClassName() {
            return "org.openqa.selenium.edge.EdgeDriver";
        }

        @Override
        public Map<String, ?> getRawCapabilities() {
            return desiredCapabilities.asMap();
        }

        @Override
        public String getReadableName() {
            return "edge";
        }

        @Override
        public int getPrecedence() {
            return 0;
        }
    }

    public static class Firefox implements BrowserCapabilities {

        /**
         * DesiredCapabilities for a firefox browser.
         */
        public static DesiredCapabilities desiredCapabilities;

        static {
            desiredCapabilities = new DesiredCapabilities(BrowserType.FIREFOX, "", Platform.ANY);
            desiredCapabilities.setCapability("acceptInsecureCerts", true);
        }

        @Override
        public String getImplementationClassName() {
            return "org.openqa.selenium.firefox.FirefoxDriver";
        }

        @Override
        public Map<String, ?> getRawCapabilities() {
            return desiredCapabilities.asMap();
        }

        @Override
        public String getReadableName() {
            return "firefox";
        }

        @Override
        public int getPrecedence() {
            return 0;
        }
    }

    public static class HtmlUnit implements BrowserCapabilities {

        /**
         * DesiredCapabilities for a htmlunit browser.
         */
        public static DesiredCapabilities desiredCapabilities = new DesiredCapabilities(BrowserType.HTMLUNIT, "", Platform.ANY);

        @Override
        public String getImplementationClassName() {
            return "org.jboss.arquillian.drone.webdriver.htmlunit.DroneHtmlUnitDriver";
        }

        @Override
        public Map<String, ?> getRawCapabilities() {
            return desiredCapabilities.asMap();
        }

        @Override
        public String getReadableName() {
            return "htmlunit";
        }

        @Override
        public int getPrecedence() {
            return 0;
        }
    }

    public static class InternetExplorer implements BrowserCapabilities {

        /**
         * DesiredCapabilities for a internet explorer browser.
         */
        public static DesiredCapabilities desiredCapabilities;

        static {
            desiredCapabilities = new DesiredCapabilities(BrowserType.IE, "", Platform.WINDOWS);
            desiredCapabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
        }

        @Override
        public String getImplementationClassName() {
            return "org.openqa.selenium.ie.InternetExplorerDriver";
        }

        @Override
        public Map<String, ?> getRawCapabilities() {
            return desiredCapabilities.asMap();
        }

        @Override
        public String getReadableName() {
            return "internetexplorer";
        }

        @Override
        public int getPrecedence() {
            return 0;
        }
    }

    public static class Opera implements BrowserCapabilities {

        /**
         * DesiredCapabilities for a opera browser.
         */
        public static DesiredCapabilities desiredCapabilities = new DesiredCapabilities(BrowserType.OPERA_BLINK, "", Platform.ANY);

        @Override
        public String getImplementationClassName() {
            return "org.openqa.selenium.opera.OperaDriver";
        }

        @Override
        public Map<String, ?> getRawCapabilities() {
            return desiredCapabilities.asMap();
        }

        @Override
        public String getReadableName() {
            return "opera";
        }

        @Override
        public int getPrecedence() {
            return 0;
        }
    }

    public static class Remote implements BrowserCapabilities {

        @Override
        public String getReadableName() {
            return null;
        }

        @Override
        public String getImplementationClassName() {
            return "org.openqa.selenium.remote.RemoteWebDriver";
        }

        @Override
        public Map<String, ?> getRawCapabilities() {
            return null;
        }

        @Override
        public int getPrecedence() {
            return 0;
        }
    }

    public static class Safari implements BrowserCapabilities {

        /**
         * DesiredCapabilities for a opera browser.
         */
        public static DesiredCapabilities desiredCapabilities = new DesiredCapabilities(BrowserType.SAFARI, "", Platform.MAC);

        @Override
        public String getReadableName() {
            return "safari";
        }

        @Override
        public String getImplementationClassName() {
            return "org.openqa.selenium.safari.SafariDriver";
        }

        @Override
        public Map<String, ?> getRawCapabilities() {
            return desiredCapabilities.asMap();
        }

        @Override
        public int getPrecedence() {
            return 0;
        }
    }

    public static class PhantomJS implements BrowserCapabilities {

        /**
         * DesiredCapabilities for a opera browser.
         */
        public static DesiredCapabilities desiredCapabilities = new DesiredCapabilities(BrowserType.PHANTOMJS, "", Platform.ANY);

        @Override
        public String getReadableName() {
            return "phantomjs";
        }

        @Override
        public String getImplementationClassName() {
            return "org.openqa.selenium.phantomjs.PhantomJSDriver";
        }

        @Override
        public Map<String, ?> getRawCapabilities() {
            return desiredCapabilities.asMap();
        }

        @Override
        public int getPrecedence() {
            return 0;
        }
    }

    public static class ChromeHeadless implements BrowserCapabilities {
        @Override
        public String getReadableName() {
            return "chromeheadless";
        }

        @Override
        public String getImplementationClassName() {
            return "org.openqa.selenium.chrome.ChromeDriver";
        }

        @Override
        public Map<String, ?> getRawCapabilities() {
            return Chrome.desiredCapabilities.asMap();
        }

        @Override
        public int getPrecedence() {
            return 0;
        }
    }
}
