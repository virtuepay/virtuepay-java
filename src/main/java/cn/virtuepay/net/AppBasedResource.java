package cn.virtuepay.net;

import cn.virtuepay.VirtuePay;

public abstract class AppBasedResource extends APIResource {
    /**
     * @param clazz the class of object
     * @return singleClassURL
     */
    protected static String singleClassURL(Class<?> clazz) {
        return String.format("%s/v2/apps/%s/%s", VirtuePay.getApiBase(), APIResource.URIAppIdHolder, className(clazz));
    }

    /**
     * @param clazz the class of object
     * @return classURL
     */
    protected static String classURL(Class<?> clazz) {
        return String.format("%ss", singleClassURL(clazz));
    }

    /**
     * @param clazz the class of object
     * @param id the id of object
     * @return instanceURL
     */
    protected static String instanceURL(Class<?> clazz, String id) {
        return String.format("%s/%s", classURL(clazz), urlEncode(id));
    }
}
