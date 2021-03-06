package cn.virtuepay.model;

import cn.virtuepay.exception.VirtuePayException;
import cn.virtuepay.net.APIResource;
import cn.virtuepay.net.RequestOptions;

import java.util.List;
import java.util.Map;

public class CardInfo extends APIResource {
    String app;
    String cardBin;
    Integer cardType;
    String openBankCode;
    String openBank;
    List<String> supportChannels;

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getCardBin() {
        return cardBin;
    }

    public void setCardBin(String cardBin) {
        this.cardBin = cardBin;
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public String getOpenBankCode() {
        return openBankCode;
    }

    public void setOpenBankCode(String openBankCode) {
        this.openBankCode = openBankCode;
    }

    public String getOpenBank() {
        return openBank;
    }

    public void setOpenBank(String openBank) {
        this.openBank = openBank;
    }

    public List<String> getSupportChannels() {
        return supportChannels;
    }

    public void setSupportChannels(List<String> supportChannels) {
        this.supportChannels = supportChannels;
    }

    /**
     * 银行卡信息查询
     *
     * @param params 卡号等信息
     * @return CardInfo
     * @throws VirtuePayException
     */
    public static CardInfo query(Map<String, Object> params)
            throws VirtuePayException {
        return query(params, null);
    }

    /**
     * 银行卡信息查询
     *
     * @param params 卡号等信息
     * @param options the specific options
     * @return CardInfo
     * @throws VirtuePayException
     */
    public static CardInfo query(Map<String, Object> params, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.POST, singleClassURL(CardInfo.class), params, CardInfo.class, options);
    }
}
