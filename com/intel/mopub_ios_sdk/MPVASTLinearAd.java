package com.intel.mopub_ios_sdk;


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
import ios.foundation.NSURL;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPVASTLinearAd extends MPVASTModel {
	static {
		NatJ.register();
	}

	@Generated
	protected MPVASTLinearAd(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPVASTLinearAd alloc();

	@Generated
	@Selector("clickThroughURL")
	public native NSURL clickThroughURL();

	@Generated
	@Selector("clickTrackingURLs")
	public native NSArray clickTrackingURLs();

	@Generated
	@Selector("customClickURLs")
	public native NSArray customClickURLs();

	@Generated
	@Selector("duration")
	public native double duration();

	@Generated
	@Selector("industryIcons")
	public native NSArray industryIcons();

	@Generated
	@Selector("init")
	public native MPVASTLinearAd init();

	@Generated
	@Selector("initWithDictionary:")
	public native MPVASTLinearAd initWithDictionary(NSDictionary dictionary);

	@Generated
	@Selector("mediaFiles")
	public native NSArray mediaFiles();

	@Generated
	@Selector("modelMap")
	public static native NSDictionary modelMap();

	@Generated
	@Selector("skipOffset")
	public native MPVASTDurationOffset skipOffset();

	@Generated
	@Selector("trackingEvents")
	public native NSDictionary trackingEvents();
}