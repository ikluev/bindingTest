package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.NSObject;
import ios.foundation.NSArray;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPAnalyticsTracker extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPAnalyticsTracker(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPAnalyticsTracker alloc();

	@Generated
	@Selector("init")
	public native MPAnalyticsTracker init();

	@Generated
	@Selector("sendTrackingRequestForURLs:")
	public native void sendTrackingRequestForURLs(NSArray URLs);

	@Generated
	@Selector("trackClickForConfiguration:")
	public native void trackClickForConfiguration(
			MPAdConfiguration configuration);

	@Generated
	@Selector("trackImpressionForConfiguration:")
	public native void trackImpressionForConfiguration(
			MPAdConfiguration configuration);

	@Generated
	@Selector("tracker")
	public static native MPAnalyticsTracker tracker();
}