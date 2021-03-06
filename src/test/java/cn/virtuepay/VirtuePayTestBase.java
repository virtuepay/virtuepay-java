package cn.virtuepay;

import org.junit.BeforeClass;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'Afon' at '16-12-16 上午10:33' with Gradle 3.1
 *
 * @author Afon, @date 16-12-16 上午10:33
 */
public class VirtuePayTestBase {

    @BeforeClass
    public static void initApiKey() {
        VirtuePay.overrideApiBase(VirtuePayTestData.getApiBase());
        VirtuePay.apiKey = VirtuePayTestData.getApiKey();
        VirtuePay.appId = VirtuePayTestData.getAppID();
        VirtuePay.privateKey = VirtuePayTestData.getPKCS8PrivateKey();

        VirtuePay.DEBUG = true;
    }
}
