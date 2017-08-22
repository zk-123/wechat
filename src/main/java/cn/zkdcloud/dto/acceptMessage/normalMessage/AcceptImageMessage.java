package cn.zkdcloud.dto.acceptMessage.normalMessage;

import cn.zkdcloud.dto.acceptMessage.AcceptNormalMessage;

/**
 * 图片消息
 */
public class AcceptImageMessage extends AcceptNormalMessage {

    /**
     * picUrl图片路径
     */
    private String picUrl;
    /**
     * mediaId
     */
    private String mediaId;

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }
}
