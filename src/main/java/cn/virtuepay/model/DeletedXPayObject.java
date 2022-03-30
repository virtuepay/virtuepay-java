package cn.virtuepay.model;

/**
 * Created by Afon on 15/12/23.
 */
interface DeletedVirtuePayObject {
    String getId();

    void setId(String id);

    Boolean getDeleted();

    void setDeleted(Boolean deleted);
}