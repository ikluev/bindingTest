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
import ios.foundation.NSURL;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPEnhancedDeeplinkRequest extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPEnhancedDeeplinkRequest(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPEnhancedDeeplinkRequest alloc();

	@Generated
	@Selector("fallbackTrackingURLs")
	public native NSArray fallbackTrackingURLs();

	@Generated
	@Selector("fallbackURL")
	public native NSURL fallbackURL();

	@Generated
	@Selector("init")
	public native MPEnhancedDeeplinkRequest init();

	@Generated
	@Selector("initWithURL:")
	public native MPEnhancedDeeplinkRequest initWithURL(NSURL URL);

	@Generated
	@Selector("originalURL")
	public native NSURL originalURL();

	@Generated
	@Selector("primaryTrackingURLs")
	public native NSArray primaryTrackingURLs();

	@Generated
	@Selector("primaryURL")
	public native NSURL primaryURL();

	@Generated
	@Selector("setFallbackTrackingURLs:")
	public native void setFallbackTrackingURLs(NSArray value);

	@Generated
	@Selector("setFallbackURL:")
	public native void setFallbackURL(NSURL value);

	@Generated
	@Selector("setOriginalURL:")
	public native void setOriginalURL(NSURL value);

	@Generated
	@Selector("setPrimaryTrackingURLs:")
	public native void setPrimaryTrackingURLs(NSArray value);

	@Generated
	@Selector("setPrimaryURL:")
	public native void setPrimaryURL(NSURL value);
}