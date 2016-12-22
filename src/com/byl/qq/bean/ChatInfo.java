package com.byl.qq.bean;

import java.io.Serializable;

public class ChatInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6240488099748291325L;
	public int iconFromResId;
	public String iconFromUrl;
	public String content;
	public String time;
	public int fromOrTo;//0 indicates receiving message and 1 indicates sending message
	@Override
	public String toString() {
		return "ChatInfoEntity [iconFromResId=" + iconFromResId
				+ ", iconFromUrl=" + iconFromUrl + ", content=" + content
				+ ", time=" + time + ", fromOrTo=" + fromOrTo + "]";
	}
}
