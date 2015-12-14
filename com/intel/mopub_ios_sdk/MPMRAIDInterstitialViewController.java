package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NUInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.mopub_ios_sdk.protocol.MPForceableOrientationProtocol;
import ios.foundation.NSBundle;
import ios.foundation.NSCoder;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPMRAIDInterstitialViewController extends
		MPInterstitialViewController implements MPForceableOrientationProtocol {
	static {
		NatJ.register();
	}

	@Generated
	protected MPMRAIDInterstitialViewController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPMRAIDInterstitialViewController alloc();

	@Generated
	@Selector("init")
	public native MPMRAIDInterstitialViewController init();

	@Generated
	@Selector("initWithAdConfiguration:")
	public native MPMRAIDInterstitialViewController initWithAdConfiguration(
			MPAdConfiguration configuration);

	@Generated
	@Selector("initWithCoder:")
	public native MPMRAIDInterstitialViewController initWithCoder(
			NSCoder aDecoder);

	@Generated
	@Selector("initWithNibName:bundle:")
	public native MPMRAIDInterstitialViewController initWithNibNameBundle(
			String nibNameOrNil, NSBundle nibBundleOrNil);

	@Generated
	@Selector("setSupportedOrientationMask:")
	public native void setSupportedOrientationMask(
			@NUInt long supportedOrientationMask);

	@Generated
	@Selector("startLoading")
	public native void startLoading();
}