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
import ios.foundation.NSDictionary;
import ios.foundation.NSURL;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPVASTTrackingEvent extends MPVASTModel {
	static {
		NatJ.register();
	}

	@Generated
	protected MPVASTTrackingEvent(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("URL")
	public native NSURL URL();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPVASTTrackingEvent alloc();

	@Generated
	@Selector("eventType")
	public native String eventType();

	@Generated
	@Selector("init")
	public native MPVASTTrackingEvent init();

	@Generated
	@Selector("initWithDictionary:")
	public native MPVASTTrackingEvent initWithDictionary(NSDictionary dictionary);

	@Generated
	@Selector("modelMap")
	public static native NSDictionary modelMap();

	@Generated
	@Selector("progressOffset")
	public native MPVASTDurationOffset progressOffset();
}