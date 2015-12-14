package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NFloat;
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
public class MPVASTCompanionAd extends MPVASTModel {
	static {
		NatJ.register();
	}

	@Generated
	protected MPVASTCompanionAd(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("HTMLResources")
	public native NSArray HTMLResources();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPVASTCompanionAd alloc();

	@Generated
	@Selector("assetHeight")
	@NFloat
	public native double assetHeight();

	@Generated
	@Selector("assetWidth")
	@NFloat
	public native double assetWidth();

	@Generated
	@Selector("clickThroughURL")
	public native NSURL clickThroughURL();

	@Generated
	@Selector("clickTrackingURLs")
	public native NSArray clickTrackingURLs();

	@Generated
	@Selector("height")
	@NFloat
	public native double height();

	@Generated
	@Selector("identifier")
	public native String identifier();

	@Generated
	@Selector("iframeResources")
	public native NSArray iframeResources();

	@Generated
	@Selector("init")
	public native MPVASTCompanionAd init();

	@Generated
	@Selector("initWithDictionary:")
	public native MPVASTCompanionAd initWithDictionary(NSDictionary dictionary);

	@Generated
	@Selector("modelMap")
	public static native NSDictionary modelMap();

	@Generated
	@Selector("staticResources")
	public native NSArray staticResources();

	@Generated
	@Selector("trackingEvents")
	public native NSDictionary trackingEvents();

	@Generated
	@Selector("width")
	@NFloat
	public native double width();
}