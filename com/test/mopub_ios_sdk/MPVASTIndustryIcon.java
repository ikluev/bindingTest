package com.test.mopub_ios_sdk;


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
public class MPVASTIndustryIcon extends MPVASTModel {
	static {
		NatJ.register();
	}

	@Generated
	protected MPVASTIndustryIcon(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("HTMLResource")
	public native MPVASTResource HTMLResource();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPVASTIndustryIcon alloc();

	@Generated
	@Selector("apiFramework")
	public native String apiFramework();

	@Generated
	@Selector("clickThroughURL")
	public native NSURL clickThroughURL();

	@Generated
	@Selector("clickTrackingURLs")
	public native NSArray clickTrackingURLs();

	@Generated
	@Selector("duration")
	public native double duration();

	@Generated
	@Selector("height")
	@NFloat
	public native double height();

	@Generated
	@Selector("iframeResource")
	public native MPVASTResource iframeResource();

	@Generated
	@Selector("init")
	public native MPVASTIndustryIcon init();

	@Generated
	@Selector("initWithDictionary:")
	public native MPVASTIndustryIcon initWithDictionary(NSDictionary dictionary);

	@Generated
	@Selector("modelMap")
	public static native NSDictionary modelMap();

	@Generated
	@Selector("offset")
	public native MPVASTDurationOffset offset();

	@Generated
	@Selector("program")
	public native String program();

	@Generated
	@Selector("staticResource")
	public native MPVASTResource staticResource();

	@Generated
	@Selector("viewTrackingURLs")
	public native NSArray viewTrackingURLs();

	@Generated
	@Selector("width")
	@NFloat
	public native double width();

	@Generated
	@Selector("xPosition")
	public native String xPosition();

	@Generated
	@Selector("yPosition")
	public native String yPosition();
}