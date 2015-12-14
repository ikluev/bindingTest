package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCBlock;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSError;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPNativeAdRequest extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPNativeAdRequest(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPNativeAdRequest alloc();

	@Generated
	@Selector("init")
	public native MPNativeAdRequest init();

	@Generated
	@Selector("requestWithAdUnitIdentifier:rendererConfigurations:")
	public static native MPNativeAdRequest requestWithAdUnitIdentifierRendererConfigurations(
			String identifier, NSArray rendererConfigurations);

	@Generated
	@Selector("setTargeting:")
	public native void setTargeting(MPNativeAdRequestTargeting value);

	@Generated
	@Selector("startForAdSequence:withCompletionHandler:")
	public native void startForAdSequenceWithCompletionHandler(
			@NInt long adSequence,
			@ObjCBlock(name = "call_startForAdSequenceWithCompletionHandler") Block_startForAdSequenceWithCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_startForAdSequenceWithCompletionHandler {
		@Generated
		void call_startForAdSequenceWithCompletionHandler(
				MPNativeAdRequest arg0, MPNativeAd arg1, NSError arg2);
	}

	@Generated
	@Selector("startWithCompletionHandler:")
	public native void startWithCompletionHandler(
			@ObjCBlock(name = "call_startWithCompletionHandler") Block_startWithCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_startWithCompletionHandler {
		@Generated
		void call_startWithCompletionHandler(MPNativeAdRequest arg0,
				MPNativeAd arg1, NSError arg2);
	}

	@Generated
	@Selector("targeting")
	public native MPNativeAdRequestTargeting targeting();
}