package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCBlock;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.test.mopub_ios_sdk.protocol.MPNativeCustomEventDelegate;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSDictionary;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPNativeCustomEvent extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPNativeCustomEvent(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPNativeCustomEvent alloc();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPNativeCustomEventDelegate delegate();

	@Generated
	@Selector("init")
	public native MPNativeCustomEvent init();

	@Generated
	@Selector("precacheImagesWithURLs:completionBlock:")
	public native void precacheImagesWithURLsCompletionBlock(
			NSArray imageURLs,
			@ObjCBlock(name = "call_precacheImagesWithURLsCompletionBlock") Block_precacheImagesWithURLsCompletionBlock completionBlock);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_precacheImagesWithURLsCompletionBlock {
		@Generated
		void call_precacheImagesWithURLsCompletionBlock(NSArray arg0);
	}

	@Generated
	@Selector("requestAdWithCustomEventInfo:")
	public native void requestAdWithCustomEventInfo(NSDictionary info);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MPNativeCustomEventDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MPNativeCustomEventDelegate value) {
		Object __old = delegate();
		if (value != null) {
			com.intel.inde.moe.natj.objc.ObjCRuntime.associateObjCObject(this,
					value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			com.intel.inde.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this,
					__old);
		}
	}
}