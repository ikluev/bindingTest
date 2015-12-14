package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.ByValue;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.NSObject;
import ios.coregraphics.struct.CGSize;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPAdConfigurationLogEventProperties extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPAdConfigurationLogEventProperties(Pointer peer) {
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
	public static native MPAdConfigurationLogEventProperties alloc();

	@Generated
	@Selector("init")
	public native MPAdConfigurationLogEventProperties init();

	@Generated
	@Selector("initWithConfiguration:")
	public native MPAdConfigurationLogEventProperties initWithConfiguration(
			MPAdConfiguration configuration);

	@Generated
	@Selector("requestId")
	public native String requestId();

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
	@Selector("setRequestId:")
	public native void setRequestId(String value);
}