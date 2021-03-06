package com.joymeter.weixin.bean;

public class Weixin {
    //需要在微信平台设置	   
    public static final String token = "";//令牌
    public static final String appId = "";
    public static final String appSecret = "";
    public static final String apiKey = "";
    public static final String encodingAESKey="";
    public static final String toName = "";
    public static final String mchId="";
    
	//1)消息文本 text
	public static final String TEXT="text";
	//8）事件推送 event
	public static final String EVENT="event";
	//a)关注 subscribe
	public static final String SUBSCRIBE="subscribe";
	//b)取消关注
	public static final String UNSUBSCRIBE="unsubscribe";
	
	//2)图片消息 image
	public static final String IMAGE="image";
	//3)语音消息 voice
	public static final String VOICE="voice";
	//4)视频消息video
	public static final String VIDEO="video";
	//5)小视频消息 shortvideo
	public static final String SHORTVIDEO="shortvideo";
	//6)地理位置消息 location
	public static final String LOCATION="location";
	//7)链接消息
	public static final String LINK="link";
	//c)菜单点击
	public static final String CLICK="click";
	//d)菜单超链接
	public static final String VIEW="view";
    
    /**
     * text message
     */
    public static final String type_text = "text";
    /**
     * image message
     */
    public static final String type_image = "image";
    /**
     * link message
     */
    public static final String type_link = "link";
    /**
     * news message
     */
    public static final String type_voice = "voice";
    /**
     * music message
     */
    public static final String type_video = "video";
    /**
     * event
     */
    public static final String type_event = "event";
    /**
     * subscribe message
     */
    public static final String type_event_subscribe = "subscribe";
    /**
     * subscribe message
     */
    public static final String type_event_scan = "scan";
    /**
     * unsubscribe message
     */
    public static final String type_event_unsubscribe = "unsubscribe";
    /**
     * location message
     */
    public static final String type_event_location = "location";
    /**
     * click message
     */
}
