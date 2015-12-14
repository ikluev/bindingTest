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
import ios.foundation.NSArray;
import ios.foundation.NSDictionary;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPVASTCreative extends MPVASTModel {
	static {
		NatJ.register();
	}

	@Generated
	protected MPVASTCreative(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("adID")
	public native String adID();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPVASTCreative alloc();

	@Generated
	@Selector("companionAds")
	public native NSArray companionAds();

	@Generated
	@Selector("identifier")
	public native String identifier();

	@Generated
	@Selector("init")
	public native MPVASTCreative init();

	@Generated
	@Selector("initWithDictionary:")
	public native MPVASTCreative initWithDictionary(NSDictionary dictionary);

	@Generated
	@Selector("linearAd")
	public native MPVASTLinearAd linearAd();

	@Generated
	@Selector("modelMap")
	public static native NSDictionary modelMap();

	@Generated
	@Selector("sequence")
	public native String sequence();
}