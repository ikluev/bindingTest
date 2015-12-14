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
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.NSObject;
import ios.coregraphics.struct.CGSize;
import ios.foundation.NSDate;
import ios.foundation.NSDictionary;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPLogEvent extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPLogEvent(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("adCreativeId")
	public native String adCreativeId();

	@Generated
	@Selector("adNetworkType")
	public native String adNetworkType();

	@Generated
	@Selector("adSize")
	@ByValue
	public native CGSize adSize();

	@Generated
	@Selector("adType")
	public native String adType();

	@Generated
	@Selector("adUnitId")
	public native String adUnitId();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPLogEvent alloc();

	@Generated
	@Selector("appBundleId")
	public native String appBundleId();

	@Generated
	@Selector("appName")
	public native String appName();

	@Generated
	@Selector("appStoreId")
	public native String appStoreId();

	@Generated
	@Selector("appVersion")
	public native String appVersion();

	@Generated
	@Selector("asDictionary")
	public native NSDictionary asDictionary();

	@Generated
	@Selector("clientAdvertisingId")
	public native String clientAdvertisingId();

	@Generated
	@Selector("clientDoNotTrack")
	public native boolean clientDoNotTrack();

	@Generated
	@Selector("deviceModel")
	public native String deviceModel();

	@Generated
	@Selector("deviceOSVersion")
	public native String deviceOSVersion();

	@Generated
	@Selector("deviceSize")
	@ByValue
	public native CGSize deviceSize();

	@Generated
	@Selector("eventCategory")
	public native String eventCategory();

	@Generated
	@Selector("eventName")
	public native String eventName();

	@Generated
	@Selector("geoAccuracy")
	public native double geoAccuracy();

	@Generated
	@Selector("geoLat")
	public native double geoLat();

	@Generated
	@Selector("geoLon")
	public native double geoLon();

	@Generated
	@Selector("init")
	public native MPLogEvent init();

	@Generated
	@Selector("initWithEventCategory:eventName:")
	public native MPLogEvent initWithEventCategoryEventName(
			String eventCategory, String eventName);

	@Generated
	@Selector("initWithLogEventProperties:nativeVideoEventType:")
	public native MPLogEvent initWithLogEventPropertiesNativeVideoEventType(
			MPAdConfigurationLogEventProperties logEventProperties,
			@NInt long nativeVideoEventType);

	@Generated
	@Selector("networkISOCountryCode")
	public native String networkISOCountryCode();

	@Generated
	@Selector("networkOperatorCode")
	public native String networkOperatorCode();

	@Generated
	@Selector("networkOperatorName")
	public native String networkOperatorName();

	@Generated
	@Selector("networkSIMCode")
	public native String networkSIMCode();

	@Generated
	@Selector("networkSIMOperatorName")
	public native String networkSIMOperatorName();

	@Generated
	@Selector("networkSimISOCountryCode")
	public native String networkSimISOCountryCode();

	@Generated
	@Selector("networkType")
	@NInt
	public native long networkType();

	@Generated
	@Selector("performanceDurationMs")
	@NUInt
	public native long performanceDurationMs();

	@Generated
	@Selector("recordEndTime")
	public native void recordEndTime();

	@Generated
	@Selector("requestId")
	public native String requestId();

	@Generated
	@Selector("requestRetries")
	@NUInt
	public native long requestRetries();

	@Generated
	@Selector("requestStatusCode")
	@NUInt
	public native long requestStatusCode();

	@Generated
	@Selector("requestURI")
	public native String requestURI();

	@Generated
	@Selector("scribeCategory")
	@NInt
	public native long scribeCategory();

	@Generated
	@Selector("sdkVersion")
	public native String sdkVersion();

	@Generated
	@Selector("serialize")
	public native String serialize();

	@Generated
	@Selector("setAdCreativeId:")
	public native void setAdCreativeId(String value);

	@Generated
	@Selector("setAdNetworkType:")
	public native void setAdNetworkType(String value);

	@Generated
	@Selector("setAdSize:")
	public native void setAdSize(@ByValue CGSize value);

	@Generated
	@Selector("setAdType:")
	public native void setAdType(String value);

	@Generated
	@Selector("setAdUnitId:")
	public native void setAdUnitId(String value);

	@Generated
	@Selector("setAppBundleId:")
	public native void setAppBundleId(String value);

	@Generated
	@Selector("setAppName:")
	public native void setAppName(String value);

	@Generated
	@Selector("setAppStoreId:")
	public native void setAppStoreId(String value);

	@Generated
	@Selector("setAppVersion:")
	public native void setAppVersion(String value);

	@Generated
	@Selector("setEventCategory:")
	public native void setEventCategory(String value);

	@Generated
	@Selector("setEventName:")
	public native void setEventName(String value);

	@Generated
	@Selector("setLogEventProperties:")
	public native void setLogEventProperties(
			MPAdConfigurationLogEventProperties logEventProperties);

	@Generated
	@Selector("setRequestId:")
	public native void setRequestId(String value);

	@Generated
	@Selector("setRequestRetries:")
	public native void setRequestRetries(@NUInt long value);

	@Generated
	@Selector("setRequestStatusCode:")
	public native void setRequestStatusCode(@NUInt long value);

	@Generated
	@Selector("setRequestURI:")
	public native void setRequestURI(String value);

	@Generated
	@Selector("timestamp")
	public native NSDate timestamp();

	@Generated
	@Selector("timestampAsEpoch")
	@NUInt
	public native long timestampAsEpoch();
}