package cn.virtuepay.net;

import cn.virtuepay.VirtuePay;

public abstract class UserBasedResource extends AppBasedResource {

    /**
     * @param clazz the class of object
     * @param userId the id of user
     * @return singleClassURL
     */
    protected static String singleClassURL(Class<?> clazz, String userId) {
        return String.format("%s/v2/apps/%s/users/%s/%s", VirtuePay.getApiBase(), APIResource.URIAppIdHolder, userId, className(clazz));
    }

    /**
     * @param clazz the class of object
     * @param userId the id of user
     * @return classURL
     */
    protected static String classURL(Class<?> clazz, String userId) {
        return String.format("%ss", singleClassURL(clazz, userId));
    }

    /**
     * @param clazz the class of object
     * @param userId the id of user
     * @param id the id of object
     * @return instanceURL
     */
    protected static String instanceURL(Class<?> clazz, String userId, String id) {
        return String.format("%s/%s", classURL(clazz, userId), urlEncode(id));
    }
}
