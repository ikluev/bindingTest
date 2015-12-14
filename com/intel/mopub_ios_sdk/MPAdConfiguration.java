package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.ByValue;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NInt;
import com.intel.inde.moe.natj.general.ann.NUInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.Class;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.NSObject;
import ios.coregraphics.struct.CGSize;
import ios.foundation.NSData;
import ios.foundation.NSDate;
import ios.foundation.NSDictionary;
import ios.foundation.NSURL;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPAdConfiguration extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPAdConfiguration(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("adResponseData")
	public native NSData adResponseData();

	@Generated
	@Selector("adResponseHTMLString")
	public native String adResponseHTMLString();

	@Generated
	@Selector("adTimeoutInterval")
	public native double adTimeoutInterval();

	@Generated
	@Selector("adType")
	@NUInt
	public native long adType();

	@Generated
	@Selector("adUnitWarmingUp")
	public native boolean adUnitWarmingUp();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPAdConfiguration alloc();

	@Generated
	@Selector("clickDetectionURLPrefix")
	public native String clickDetectionURLPrefix();

	@Generated
	@Selector("clickTrackingURL")
	public native NSURL clickTrackingURL();

	@Generated
	@Selector("creationTimestamp")
	public native NSDate creationTimestamp();

	@Generated
	@Selector("creativeId")
	public native String creativeId();

	@Generated
	@Selector("customEventClass")
	public native Class customEventClass();

	@Generated
	@Selector("customEventClassData")
	public native NSDictionary customEventClassData();

	@Generated
	@Selector("customSelectorName")
	public native String customSelectorName();

	@Generated
	@Selector("dspCreativeId")
	public native String dspCreativeId();

	@Generated
	@Selector("failoverURL")
	public native NSURL failoverURL();

	@Generated
	@Selector("hasPreferredSize")
	public native boolean hasPreferredSize();

	@Generated
	@Selector("headerAdType")
	public native String headerAdType();

	@Generated
	@Selector("impressionTrackingURL")
	public native NSURL impressionTrackingURL();

	@Generated
	@Selector("init")
	public native MPAdConfiguration init();

	@Generated
	@Selector("initWithHeaders:data:")
	public native MPAdConfiguration initWithHeadersData(NSDictionary headers,
			NSData data);

	@Generated
	@Selector("interceptURLPrefix")
	public native NSURL interceptURLPrefix();

	@Generated
	@Selector("isVastVideoPlayer")
	public native boolean isVastVideoPlayer();

	@Generated
	@Selector("nativeSDKParameters")
	public native NSDictionary nativeSDKParameters();

	@Generated
	@Selector("nativeVideoImpressionMinVisiblePercent")
	@NInt
	public native long nativeVideoImpressionMinVisiblePercent();

	@Generated
	@Selector("nativeVideoImpressionVisible")
	public native double nativeVideoImpressionVisible();

	@Generated
	@Selector("nativeVideoMaxBufferingTime")
	public native double nativeVideoMaxBufferingTime();

	@Generated
	@Selector("nativeVideoPauseVisiblePercent")
	@NInt
	public native long nativeVideoPauseVisiblePercent();

	@Generated
	@Selector("nativeVideoPlayVisiblePercent")
	@NInt
	public native long nativeVideoPlayVisiblePercent();

	@Generated
	@Selector("networkType")
	public native String networkType();

	@Generated
	@Selector("orientationType")
	@NUInt
	public native long orientationType();

	@Generated
	@Selector("precacheRequired")
	public native boolean precacheRequired();

	@Generated
	@Selector("preferredSize")
	@ByValue
	public native CGSize preferredSize();

	@Generated
	@Selector("refreshInterval")
	public native double refreshInterval();

	@Generated
	@Selector("scrollable")
	public native boolean scrollable();

	@Generated
	@Selector("setAdResponseData:")
	public native void setAdResponseData(NSData value);

	@Generated
	@Selector("setAdTimeoutInterval:")
	public native void setAdTimeoutInterval(double value);

	@Generated
	@Selector("setAdType:")
	public native void setAdType(@NUInt long value);

	@Generated
	@Selector("setAdUnitWarmingUp:")
	public native void setAdUnitWarmingUp(boolean value);

	@Generated
	@Selector("setClickTrackingURL:")
	public native void setClickTrackingURL(NSURL value);

	@Generated
	@Selector("setCreationTimestamp:")
	public native void setCreationTimestamp(NSDate value);

	@Generated
	@Selector("setCreativeId:")
	public native void setCreativeId(String value);

	@Generated
	@Selector("setCustomEventClass:")
	public native void setCustomEventClass(Class value);

	@Generated
	@Selector("setCustomEventClassData:")
	public native void setCustomEventClassData(NSDictionary value);

	@Generated
	@Selector("setCustomSelectorName:")
	public native void setCustomSelectorName(String value);

	@Generated
	@Selector("setDspCreativeId:")
	public native void setDspCreativeId(String value);

	@Generated
	@Selector("setFailoverURL:")
	public native void setFailoverURL(NSURL value);

	@Generated
	@Selector("setHeaderAdType:")
	public native void setHeaderAdType(String value);

	@Generated
	@Selector("setImpressionTrackingURL:")
	public native void setImpressionTrackingURL(NSURL value);

	@Generated
	@Selector("setInterceptURLPrefix:")
	public native void setInterceptURLPrefix(NSURL value);

	@Generated
	@Selector("setIsVastVideoPlayer:")
	public native void setIsVastVideoPlayer(boolean value);

	@Generated
	@Selector("setNativeSDKParameters:")
	public native void setNativeSDKParameters(NSDictionary value);

	@Generated
	@Selector("setNativeVideoImpressionMinVisiblePercent:")
	public native void setNativeVideoImpressionMinVisiblePercent(
			@NInt long value);

	@Generated
	@Selector("setNativeVideoImpressionVisible:")
	public native void setNativeVideoImpressionVisible(double value);

	@Generated
	@Selector("setNativeVideoMaxBufferingTime:")
	public native void setNativeVideoMaxBufferingTime(double value);

	@Generated
	@Selector("setNativeVideoPauseVisiblePercent:")
	public native void setNativeVideoPauseVisiblePercent(@NInt long value);

	@Generated
	@Selector("setNativeVideoPlayVisiblePercent:")
	public native void setNativeVideoPlayVisiblePercent(@NInt long value);

	@Generated
	@Selector("setNetworkType:")
	public native void setNetworkType(String value);

	@Generated
	@Selector("setOrientationType:")
	public native void setOrientationType(@NUInt long value);

	@Generated
	@Selector("setPrecacheRequired:")
	public native void setPrecacheRequired(boolean value);

	@Generated
	@Selector("setPreferredSize:")
	public native void setPreferredSize(@ByValue CGSize value);

	@Generated
	@Selector("setRefreshInterval:")
	public native void setRefreshInterval(double value);

	@Generated
	@Selector("setScrollable:")
	public native void setScrollable(boolean value);

	@Generated
	@Selector("setShouldInterceptLinks:")
	public native void setShouldInterceptLinks(boolean value);

	@Generated
	@Selector("shouldInterceptLinks")
	public native boolean shouldInterceptLinks();
}