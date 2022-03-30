package cn.virtuepay.model;

/**
 * Created by Afon on 15/12/30.
 */
public class EventData extends VirtuePayObject {
    VirtuePayObject object;

    public VirtuePayObject getObject() {
        return object;
    }

    public void setObject(VirtuePayObject object) {
        this.object = object;
    }
}
