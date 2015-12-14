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
import ios.foundation.NSNumber;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPRewardedVideoReward extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPRewardedVideoReward(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPRewardedVideoReward alloc();

	@Generated
	@Selector("amount")
	public native NSNumber amount();

	@Generated
	@Selector("currencyType")
	public native String currencyType();

	@Generated
	@Selector("init")
	public native MPRewardedVideoReward init();

	@Generated
	@Selector("initWithCurrencyAmount:")
	public native MPRewardedVideoReward initWithCurrencyAmount(NSNumber amount);

	@Generated
	@Selector("initWithCurrencyType:amount:")
	public native MPRewardedVideoReward initWithCurrencyTypeAmount(
			String currencyType, NSNumber amount);
}